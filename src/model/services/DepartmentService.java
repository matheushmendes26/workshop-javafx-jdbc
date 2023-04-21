package model.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.entities.Department;

public class DepartmentService {
	
	Department d1 = new Department(1,"Eletronics");
	Department d2 = new Department(2, "Books");
	Department d3 = new Department(3,"House");
	
	public List<Department> findAll(){
		
		List<Department> list = new ArrayList<>();
		
		list.addAll(Arrays.asList(d1,d2,d3));
		
		return list;
		
	}

}
