package de.ithempel.javaee.business;

import javax.ejb.Stateless;

@Stateless
public class WelcomeService {

	public String createMessage(String name) {
		return "Welcome " + name;
	}
	
}
