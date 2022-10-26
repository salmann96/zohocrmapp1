package com.marketapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketapp.entities.Lead;
import com.marketapp.entities.contacts;
import com.marketapp.repository.ContactRepository;
import com.marketapp.services.LeadService;

@Controller
public class LeadController {

	@Autowired
	private LeadService leadService;
	
	@Autowired
	private ContactRepository contactRepo;
	
	@RequestMapping("/viewleadPage2")
	public String viewleadPage2() {
		return "create_lead" ;
	}
	
	@RequestMapping("/saveLead")
	public String saveOneLead(@ModelAttribute("lead")Lead lead , ModelMap model) {
		leadService.saveOneLead(lead);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	@RequestMapping("/composeEmail")
	public String composeEmail(@RequestParam("email") String email , ModelMap model) {
		model.addAttribute("email", email);
		return "compose_email";
		
	}
	@RequestMapping("/ConvertLead")
	public String ConvertLead(@RequestParam("id")long id) {
		Lead lead = leadService.getOneLead(id);
		
		contacts con = new contacts();
		con.setFirstname(lead.getFirstname());
		con.setLastname(lead.getLastname());
		con.setEmail(lead.getEmail());
		con.setMobile(lead.getMobile());
		con.setSource(lead.getSource());
		
		contactRepo.save(con);
		
		leadService.deleteOneLead(id);
		
		return "lead_info";
		
	}
	@RequestMapping("/ListAll")
	public String getAllLeads( ModelMap model) {
		List<Lead> leads=leadService.getAllLeads();
		model.addAttribute("leads", leads);
		return "list_leads";
	}
	
	@RequestMapping("/findById")
	public String findById(@RequestParam("id") long id , ModelMap model) {
		Lead lead = leadService.getOneLead(id);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
}


















