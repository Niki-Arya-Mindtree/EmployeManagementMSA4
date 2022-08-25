package com.EmployeeManagement.MSA4.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.EmployeeManagement.MSA4.Exception.EmptyData;
import com.EmployeeManagement.MSA4.Model.EmployeeModel;
import com.EmployeeManagement.MSA4.Model.EmployeeModelObject;

@Component
public class EmployeeController {
	
	@Autowired
	private EmployeeModelObject empObjMo;
	
	public List<EmployeeModel> fullData()throws EmptyData
	{
		List<EmployeeModel> allData = empObjMo.getListEmp();
		if(allData==null||allData.size()==0)
			throw new EmptyData("Empty DataBase");
		return allData;
	}
}

