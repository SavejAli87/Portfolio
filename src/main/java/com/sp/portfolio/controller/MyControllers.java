package com.sp.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sp.portfolio.entites.Client;
import com.sp.portfolio.services.ClientServices;

@CrossOrigin(origins = {"https://denomtech.com", "http://localhost:5173"})
@RestController
public class MyControllers {
	
	@Autowired
	private ClientServices clientServices;

	@PostMapping("/client")
	
	public  Client addClientDetails(@RequestBody Client  client)
	{
		return clientServices.createClient(client);
	}

}
