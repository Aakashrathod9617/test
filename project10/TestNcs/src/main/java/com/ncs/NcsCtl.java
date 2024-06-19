package com.ncs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Ncs")
public class NcsCtl {
	
	@Autowired
	private NcsService ncsService;
	
	@PostMapping
	public String add(@RequestBody NcsForm form ) {
		
		NcsDTO dto= new NcsDTO();
		
		dto.setId(form.getId());
		dto.setName(form.getName());
		dto.setDept_id(form.getDept_id());
		dto.setDept_Name(form.getDept_Name());
		
		ncsService.add(dto);
		return "Data savered";
		
		
	}

}
