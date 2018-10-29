package com.example.client.rest;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.example.server.model.Employee;

public class RestClient {

    private static final String REST_URI = "http://localhost:8080/spring-jersey/resources/employees";
    private Client client = ClientBuilder.newClient();

    public Response createJsonEmployee(Employee emp) {
        return client.target(REST_URI).request(MediaType.APPLICATION_JSON).post(Entity.entity(emp, MediaType.APPLICATION_JSON));
    }

    public Employee getJsonEmployee(int id) {
        return client.target(REST_URI).path(String.valueOf(id)).request(MediaType.APPLICATION_JSON).get(Employee.class);
    }

}
