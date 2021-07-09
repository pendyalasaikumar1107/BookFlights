package com.FlightDemo.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightController {
	
	@RequestMapping("/")
    @ResponseBody
    public String helloHandler () {
        return "<h1>Hello World!</h1>"; 
        
	}
	@Autowired
	FlightServices flightservices;
	
	@PostMapping("/flights")
	private int saveFlight(@RequestBody Flights flights) 
	{
	flightservices.saveOrUpdate(flights);
	return flights.getFlightid();
	}
	
	//creating a get mapping that retrieves all the books detail from the database 
	@GetMapping("/flightList")
	private List<Flights> getAllFlights() 
	{
	return flightservices.getAllFlights();
	}
}
