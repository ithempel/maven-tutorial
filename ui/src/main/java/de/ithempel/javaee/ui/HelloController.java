package de.ithempel.javaee.ui;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import de.ithempel.javaee.business.WelcomeService;

@Named
@RequestScoped
public class HelloController {
	
	@EJB
	private WelcomeService welcomeService;
	
	public HelloController() {
		
	}
	
	HelloController(WelcomeService welcomeService) {
		this.welcomeService = welcomeService;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getWelcomeMessage() {
		return welcomeService.createMessage(name);
	}
	
}
