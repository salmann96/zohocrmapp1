package com.marketapp.services;

import java.util.List;

import com.marketapp.entities.Lead;

public interface LeadService {

	public void saveOneLead(Lead lead);

	public Lead getOneLead(long id);

	public void deleteOneLead(long id);

	public List<Lead> getAllLeads();
}
