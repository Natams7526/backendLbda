package com.grandapp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.grandapp.DTO.AppointmentRequestDto;
import com.grandapp.model.AppointmentModel;
import com.grandapp.model.BarberModel;
import com.grandapp.model.ClientModel;
import com.grandapp.repository.AppointmentRepository;
import com.grandapp.service.AppointmentService;

@Service
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	private AppointmentRepository appointmentRepository;

	@Autowired
	private BarberServiceImpl barberService;
	
	@Autowired
	private ClientServiceImpl clientService;

	@Override
	public Optional<AppointmentModel> findById(Long id) {
		return null;
		// appointmentRepository.findById(id);
	}

	@Override
	public AppointmentModel save(AppointmentRequestDto appointment) throws Exception {

		Optional<BarberModel> barber = barberService.findById(appointment.getBarberId());

		BarberModel barberMock = barber.get();
		BarberModel barberSave = new BarberModel();
		barberSave.setId(barberMock.getId());
		barberSave.setName(barberMock.getName());
		barberSave.setPhone(barberMock.getPhone());


		ClientModel clientMock = clientService.findById(appointment.getClientId()).get();
		ClientModel clientSave = new ClientModel();
		clientSave.setId(clientMock.getId());
		clientSave.setName(clientMock.getName());
		clientSave.setPhone(clientMock.getPhone());

		AppointmentModel data = new AppointmentModel();
		data.setBarber(barberSave);
		data.setClient(clientSave);
		data.setTimeStart(appointment.getTimeStart());
		data.setTimeEnd(appointment.getTimeEnd());
		return appointmentRepository.save(data);
	}

	@Override
	public Page<AppointmentModel> findAll(Pageable pageable) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	// Método para obtener citas de un barbero específico
	@Override
	public List<AppointmentModel> getAppointmentsByBarberId(AppointmentRequestDto appointment) throws Exception {
		try {
//			return appointmentRepository.getAppointmentsByBarberId(appointment.getBarberId());
			return appointmentRepository.getAppointmentsByBarberId(appointment.getBarberId(),appointment.getTimeStart());
		} catch (Exception e) {
			throw new Exception("error en metodo getAppointmentsByBarber");
		}
	}

}
