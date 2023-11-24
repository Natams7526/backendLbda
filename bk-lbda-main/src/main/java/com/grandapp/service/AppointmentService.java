package com.grandapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.grandapp.DTO.AppointmentRequestDto;
import com.grandapp.model.AppointmentModel;

/**

 * */

public interface AppointmentService {

	public AppointmentModel save(AppointmentRequestDto appointment) throws Exception;
	
	public Optional<AppointmentModel> findById(Long id) throws Exception;
	
	public Page<AppointmentModel> findAll(Pageable pageable) throws Exception;

	List<AppointmentModel> getAppointmentsByBarberId(AppointmentRequestDto appointment) throws Exception;
	
}
