package com.example.demo.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter

// Class
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
    
    public Long getDepartmentId()
    {
    	return departmentId;
    }
    public String getDepartmentName()
    {
    	return departmentName;
    }
    public String getDepartmentAddress()
    {
    	return departmentAddress;
    }
    public String getDepartmentCode()
    {
    	return departmentCode;
    }
    
    public void setDepartmentId(Long departmentId)
    {
    	this.departmentId = departmentId;
    }
    public void setDepartmentName(String  departmentName)
    {
    	this.departmentName = departmentName;
    }
    public void setDepartmentAddress(String  departmentAddress)
    {
    	this.departmentAddress = departmentAddress;
    }
    
    public void setDepartmentCode(String  departmentCode)
    {
    	this.departmentCode = departmentCode;
    }
}

