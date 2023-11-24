package com.grandapp.repository;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.grandapp.model.AppointmentModel;

public interface AppointmentRepository extends JpaRepository<AppointmentModel, Long> {

//	@Query(value = "SELECT a.id, a.time_start, a.time_end, a.barber_id FROM appointments a "
//			+ " WHERE a.barber_id = :barberId", nativeQuery = true)
//	List<AppointmentModel> getAppointmentsByBarberId(@Param("barberId") Long barberId);
	
	@Query(value = "SELECT a.* FROM appointments a "
			+ " WHERE a.barber_id = :barberId" 
			+ " AND  CAST(a.time_start AS date) = CAST(:timeStart AS date)", nativeQuery = true)
	List<AppointmentModel> getAppointmentsByBarberId(@Param("barberId") Long barberId,
	@Param("timeStart") Date timeStart);

}
