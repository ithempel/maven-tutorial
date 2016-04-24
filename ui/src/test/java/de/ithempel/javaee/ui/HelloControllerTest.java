package de.ithempel.javaee.ui;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.text.IsEmptyString.isEmptyString;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

import de.ithempel.javaee.business.WelcomeService;

public class HelloControllerTest {
	
	@Test
	public void setName_getWelcomeMessage_messageWithName() {
		String name = "Hans";

		WelcomeService service = mock(WelcomeService.class);
		when(service.createMessage(name)).thenReturn(name);
		
		HelloController controller = new HelloController(service);
		controller.setName(name);
		String message = controller.getWelcomeMessage();
		
		assertThat(message, not(isEmptyString()));
		verify(service).createMessage(name);
	}

}
