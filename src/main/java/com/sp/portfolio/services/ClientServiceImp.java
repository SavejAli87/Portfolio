package com.sp.portfolio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sp.portfolio.entites.Client;
import com.sp.portfolio.repositories.ClientRepositories;


@Service
public class ClientServiceImp implements ClientServices {
	
	@Autowired
	private ClientRepositories clientRepository;
    
	@Transactional
	@Override
	public Client createClient(Client client) {
				
		return clientRepository.save(client);
	}

}
