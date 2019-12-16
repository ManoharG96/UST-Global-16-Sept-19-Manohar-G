package com.ustglobal.springrest.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.springrest.dto.EmployeeBean;
import com.ustglobal.springrest.dto.EmployeeResponse;
import com.ustglobal.springrest.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse addEmployee(@RequestBody EmployeeBean bean) {
		EmployeeResponse response = new EmployeeResponse();
		if (service.addEmployee(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Bean is added in the databases");
		}else {
			response.setStatusCode(401);
			response.setMessage("Not Success");
			response.setDescription("Employee Bean not added in the databases");
		}
		return response;
	}

	@PutMapping (path =  "/modify", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse modifyEmployee(@RequestBody EmployeeBean bean) {
		EmployeeResponse response = new EmployeeResponse();
		if (service.modifyEmployee(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Bean is modified in the databases");
		}else {
			response.setStatusCode(401);
			response.setMessage("Not Success");
			response.setDescription("Employee Bean not modified in the databases");
		}
		return response;
	}

	@DeleteMapping (path = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse deleteEmployee(@PathVariable("id") int id) {
		EmployeeResponse response = new EmployeeResponse();
		if (service.deleteEmployee(id)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Bean is deleted in the databases");
		}else {
			response.setStatusCode(401);
			response.setMessage("Not Success");
			response.setDescription("Employee Bean not deleted in the databases");
		}
		return response;
	}

	@GetMapping (path = "/get" , produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(@RequestParam ("id") int id) {
		EmployeeResponse response = new EmployeeResponse();
		EmployeeBean bean = service.getEmployee(id);
		if (bean!=null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Bean is present in the databases");
			response.setList(Arrays.asList(bean));
		} else {
			response.setStatusCode(401);
			response.setMessage("Not Success");
			response.setDescription("Employee Bean not present in the databases");
		}
		return response;
	}

	@GetMapping (path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployee() {
		EmployeeResponse response = new EmployeeResponse();
		List<EmployeeBean> bean = service.getAllEmployee();
		if (bean!=null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Data is present in the databases");
			response.setList(bean);
		} else {
			response.setStatusCode(401);
			response.setMessage("Not Success");
			response.setDescription("Employee Data not present in the databases");
		}
		return response;
	}
	
	@GetMapping (path = "/excep", produces = MediaType.APPLICATION_JSON_VALUE)
	public void createException() {
		System.out.println("Dividing: "+(1/0));
	}
}
