package com.grandapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.grandapp.model.ClientModel;

public interface ClientRepository extends JpaRepository<ClientModel, Long> {
	
//	@Transactional(readOnly = true)
//	List<ClientModel> findByName(String  name) throws Exception;
//	
	@Transactional(readOnly = true)
	public Boolean existsByPhone(String Phone)throws Exception;

}
