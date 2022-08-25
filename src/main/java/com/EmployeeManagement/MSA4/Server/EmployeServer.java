package com.EmployeeManagement.MSA4.Server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeManagement.MSA4.Controller.EmployeeController;
import com.EmployeeManagement.MSA4.Exception.EmptyData;
import com.EmployeeManagement.MSA4.Exception.ExcepMessg;
import com.EmployeeManagement.MSA4.Model.EmployeeModel;

@RestController
public class EmployeServer {
	
	@Autowired
	private EmployeeController empCont;
	
	@GetMapping("/Emp")
	public ResponseEntity<?> fullData(){
		try {
			return new ResponseEntity<>(empCont.fullData(),HttpStatus.FOUND);
		} catch (EmptyData e) {
			return new ResponseEntity<>(new ExcepMessg(e.getMessage()),HttpStatus.NO_CONTENT);
		}
		catch (Exception e) {
			return new ResponseEntity<>(new ExcepMessg(e.getMessage()),HttpStatus.BAD_REQUEST);
		}
	}
}
