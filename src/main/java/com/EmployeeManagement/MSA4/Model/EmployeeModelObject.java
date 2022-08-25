package com.EmployeeManagement.MSA4.Model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EmployeeModelObject {
	
	private static List<EmployeeModel> listEmp= new ArrayList<>();
	
	static {
		
		listEmp.add(new EmployeeModel(1,"Nikhil",26000));
		listEmp.add(new EmployeeModel(2,"Mahesh",87000));
		listEmp.add(new EmployeeModel(3,"Abhilash",75000));
		listEmp.add(new EmployeeModel(4,"Rakshith",55000));
		listEmp.add(new EmployeeModel(5,"Raga",50000));
		listEmp.add(new EmployeeModel(6,"Yeshwanth",24000));
		listEmp.add(new EmployeeModel(7,"Manja",30000));
		listEmp.add(new EmployeeModel(8,"Kiran",26000));
		listEmp.add(new EmployeeModel(9,"Ravi",30000));
		listEmp.add(new EmployeeModel(10,"Nishanth",20000));
		
	}
	
	public static List<EmployeeModel> getListEmp(){
		return listEmp;
	}
}
