package com.ncs;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class NcsService {
	
	@Autowired
	private NcsDAO dao;
	
	public void add(NcsDTO dto) {
		
		dao.add(dto);
		
	}

}
