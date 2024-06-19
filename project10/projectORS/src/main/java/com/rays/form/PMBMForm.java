package com.rays.form;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.PMBMDTO;


public class PMBMForm extends BaseForm{
	
	@NotEmpty(message = "please enter projectName")
	private String projectName;
	
	@NotEmpty(message = "please enter projectDescription")
	private String projectDescription;
	
	@NotEmpty(message = "please enter startDate")
	private String startDate;
	
	@NotEmpty(message = "please enter endDate")
	private String endDate;
	
	@NotEmpty(message = "please enter equipmentName")
	private String equipmentName;
	
	@NotEmpty(message = "please enter equipmentType")
	private String equipmentType;

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getEquipmentName() {
		return equipmentName;
	}

	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}

	public String getEquipmentType() {
		return equipmentType;
	}

	public void setEquipmentType(String equipmentType) {
		this.equipmentType = equipmentType;
	}
	
	@Override
	public BaseDTO getDto() {

		PMBMDTO dto = initDTO(new PMBMDTO());
		dto.setProjectName(projectName);
		dto.setProjectDescription(projectDescription);
		dto.setStartDate(startDate);
		dto.setEndDate(endDate);
		dto.setEquipmentName(equipmentName);
		dto.setEquipmentType(equipmentType);
		
		return dto;
	}

}
