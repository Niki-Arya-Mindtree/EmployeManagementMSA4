package com.EmployeeManagement.MSA4.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.EmployeeManagement.MSA4.Model.EmployeeModel;
import com.EmployeeManagement.MSA4.Model.EmployeeModelObject;

@Component
public class EmployeeController {
	
	@Autowired
	private EmployeeModelObject empObjMo;
	
	public List<EmployeeModel> fullData(){
		List<EmployeeModel> allData = empObjMo.getListEmp();
		
		return allData;
	}
}

