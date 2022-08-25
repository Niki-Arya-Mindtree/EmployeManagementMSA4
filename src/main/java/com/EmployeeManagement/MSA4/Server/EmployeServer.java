package com.EmployeeManagement.MSA4.Server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeManagement.MSA4.Controller.EmployeeController;
import com.EmployeeManagement.MSA4.Model.EmployeeModel;

@RestController
public class EmployeServer {
	
	@Autowired
	private EmployeeController empCont;
	
	@GetMapping("/Emp")
	public List<EmployeeModel> fullData(){
		return empCont.fullData();
	}
}
