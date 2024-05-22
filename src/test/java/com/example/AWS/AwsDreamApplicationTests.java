package com.example.AWS;

import com.example.AWS.controller.SQLDBemployeeBean;
import com.example.AWS.controller.addResponse;

import com.example.AWS.controller.employeeController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.path.json.JsonPath;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class AwsDreamApplicationTests {

	@Autowired
	SQLDBemployeeBean employee;
	@Autowired
	employeeController empcontrol;
	@Autowired
	employeeController con;
	@Test
	public void saveEmployee() throws Exception {

		SQLDBemployeeBean ben = setEmployeeTestData();

		ObjectMapper map = new ObjectMapper();
		String jsonstring = map.writeValueAsString(ben);
		System.out.println("Expected Json -->"+jsonstring);
		JsonPath js = new JsonPath(jsonstring);
		System.out.println(js.get("firstname").toString());
////		ResponseEntity actualresponse = empcontrol.addEmployees(setEmployeeTestData());
//		System.out.println(actualresponse.getStatusCode());
//		addResponse ad1 = (addResponse) actualresponse.getBody();
		//Assert.assertEquals(js.get("firtname").toString(),con.getemp());

	}

	public SQLDBemployeeBean setEmployeeTestData() throws Exception {
		employee.setFirstname("Vipin");
		employee.setLastname("Muley");
		employee.setCity("Pune");
		employee.setDept("IT");
		employee.setEmpid(25336666);

		return employee;
	}

}
