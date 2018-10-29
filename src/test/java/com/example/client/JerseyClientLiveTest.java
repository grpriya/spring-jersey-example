package com.example.client;

import static org.junit.Assert.assertEquals;

import javax.ws.rs.core.Response;

import org.junit.Test;

import com.example.client.rest.RestClient;
import com.example.server.model.Employee;

public class JerseyClientLiveTest {

    public static final int HTTP_CREATED = 201;

    private RestClient client = new RestClient();

    @Test
    public void givenCorrectObject_whenCorrectJsonRequest_thenResponseCodeCreated() {
        Employee emp = new Employee(6, "Harry");

        Response response = client.createJsonEmployee(emp);

        assertEquals(response.getStatus(), HTTP_CREATED);
    }

    @Test
    public void givenCorrectId_whenCorrectJsonRequest_thenCorrectEmployeeRetrieved() {
        int employeeId = 1;

        Employee emp = client.getJsonEmployee(employeeId);

        assertEquals(emp.getFirstName(), "Lara");
    }

}
