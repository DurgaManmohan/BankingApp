package io.javabrains;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import io.javabrains.controller.WelcomeController;
import io.javabrains.entity.User;
import io.javabrains.repository.LoginRepository;



@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class UseCaseLoginApplicationTests {

	

	  protected MockMvc mockMvc;
	  @Autowired
	  private WebApplicationContext webApplicationContext;
	  
	  @MockBean
	  protected LoginRepository userMock;
	  

	  @BeforeClass
	  public void setUp() {
	    System.out.println("Hi this is user");
	    this.mockMvc = webAppContextSetup(webApplicationContext).build();
	    
	  }
	  
	  

	@Test
	void contextLoads() {
		System.out.println("Hello");
	}
	
	@Test
    public void testWelcomeController() throws Exception {
		this.setUp();
		System.out.print("IN test welcome");
		when(userMock.findByUserName(any(String.class))).thenReturn(new User(101,"vikram","password","vikram@gmail.com","ee56re567772","tier-1","VALID","4/23/2020"));
		  mockMvc.perform(post("/authenticate")
		           .contentType(MediaType.APPLICATION_JSON)
		           .content("{ \"userName\":\"vikram\", \"password\":\"password\" }")
		           .accept(MediaType.APPLICATION_JSON))
		           .andExpect(status().isCreated())
		           .andExpect(jsonPath("$.userName").value("vikram"))
		           .andExpect(jsonPath("$.customer_type").value("tier-1"))
		           .andExpect(jsonPath("$.last_login_date").value("4/23/2020"))
		           .andExpect(jsonPath("$.customerSessionId").value("ee56re567772"))
		           .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8));
		  
		   Mockito.verify(userMock.findByUserName(any(String.class)));
		            
	}

}
