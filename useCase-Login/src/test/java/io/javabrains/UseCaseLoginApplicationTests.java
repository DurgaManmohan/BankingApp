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
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.context.WebApplicationContext;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import java.time.LocalDateTime;
import java.util.UUID;

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
		String id=UUID.randomUUID().toString();
		String date=LocalDateTime.now().toString();
		when(userMock.findByUserName(any(String.class))).thenReturn(new User(101,"vikram","password","vikram@gmail.com","ee56re567772","tier-1","VALID","4/23/2020"));
		  mockMvc.perform(post("/authenticate")
		           .contentType(MediaType.APPLICATION_JSON)
		           .content("{\"userName\":\"vikram\", \"password\":\"password\" }")
		           .accept(MediaType.APPLICATION_JSON))
		           .andExpect(status().isOk())
		           .andDo(print())
		           .andExpect(jsonPath("$.customername").value("vikram"))
		           .andExpect(jsonPath("$.customertype").value("tier-1"))
		           .andExpect(jsonPath("$.lastlogindate").value("date"+date))
		           .andExpect(jsonPath("$.sessionid").value("id"+id))
		           .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8));
		  
		   Mockito.verify(userMock.findByUserName(any(String.class)));
		            
	}
	
	@Test
	public void testSessionId() throws Exception {
		this.setUp();
		System.out.print("second test case mocking");
		when(userMock.findByCustomerSessionId(any(String.class))).thenReturn(new User(101,"vikram","password","vikram@gmail.com","deef13f6-01ca-43d9-97e3-2a11a5365fc5","tier-1","VALID","4/23/2020"));
		 MediaType applicationJsonUtf8 = APPLICATION_JSON_UTF8;
		mockMvc.perform((RequestBuilder) (((ResultActions) delete("/bank/user/authenticate")
		           .contentType(MediaType.APPLICATION_JSON)
		           .content("{ \"sessionid\":\"deef13f6-01ca-43d9-97e3-2a11a5365fc5\"}"))
		           .andExpect(status().isOk())
		           .andExpect(jsonPath("$.loginStatus").value("Invalid"))
		           .andExpect(content().contentType(applicationJsonUtf8))));
		           
		 Mockito.verify(userMock.findByCustomerSessionId(any(String.class)));
		
	}
	
	

}
