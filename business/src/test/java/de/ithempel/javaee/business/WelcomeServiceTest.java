package de.ithempel.javaee.business;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class WelcomeServiceTest {
	
	@Test
	public void givenName_createMessage_messageWithName() {
		String name = "Hans";
		
		WelcomeService service = new WelcomeService();
		String message = service.createMessage(name);
		
		assertThat(message, containsString(name));
	}
	
	@Test
	public void givenName_createMessage_messageWithTwoWords() {
		String name = "Hans";
		
		WelcomeService service = new WelcomeService();
		String message = service.createMessage(name);
		
		assertThat(message.split(" ").length, equalTo(2));
	}
	
	@Test
	public void noName_createMessage_welcomeOnly() {
		String name = "";
		
		WelcomeService service = new WelcomeService();
		String message = service.createMessage(name);
		
		assertThat(message, startsWith("Welcome"));
	}

}
