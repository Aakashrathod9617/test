package com.ncs;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class NcsDAO {
	
	@PersistenceContext
	protected EntityManager entityManager;

	
	
	public long add(NcsDTO dto) {
	
		entityManager.persist(dto);
		return dto.getId();
	}

	

}
