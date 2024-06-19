package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_PMBM")
public class PMBMDTO extends BaseDTO {

	@Column(name = "PROJECT_NAME", length = 50)
	private String projectName;
	
	@Column(name = "PROJECT_DESCRIPTION", length = 100)
	private String projectDescription;
	
	@Column(name = "START_DATE", length = 50)
	private String startDate;
	
	@Column(name = "END_DATE", length = 50)
	private String endDate;
	
	@Column(name = "EQUIPMENT_NAME", length = 50)
	private String equipmentName;
	
	@Column(name = "EQUIPMENT_TYPE", length = 50)
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

	public String getKey() {
		return id + "";
	}

	public String getValue() {
		return projectName + " " + projectDescription;
	}
	
	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("projectName", "asc");
		map.put("projectDescription", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("equipmentName", equipmentName);
		return map;
	}
	
	@Override
	public String getUniqueKey() {
		return "equipmentName";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return equipmentName;
	}
	
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "equipmentName";
	}

}
