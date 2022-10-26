package com.marketapp.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.marketapp.entities.contacts;
import com.marketapp.repository.ContactRepository;

public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepo;
	
	@Override
	public void saveOneContact(contacts con) {
		contactRepo.save(con);
	}

}
