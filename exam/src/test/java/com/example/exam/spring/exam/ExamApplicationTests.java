package com.example.exam.spring.exam;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import java.nio.charset.Charset;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ExamApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class ExamApplicationTests {

	private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
					MediaType.APPLICATION_JSON.getSubtype(),
					Charset.forName("utf8"));

	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext webApplicationContext;

	@Before
	public void setup() throws Exception {
		this.mockMvc = webAppContextSetup(webApplicationContext).build();
	}

  @Test
  public void testStatusOkQuizQuestions() throws Exception {
    mockMvc.perform(get("/questions").param("id", "1").param("questions", "What type of dog Barbi has?"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.id", is(1)))
            .andExpect(jsonPath("$.questions", is("What type of dog Barbi has?")));
  }

  @Test
  public void testStatusOkQuizAnweres() throws Exception {
    mockMvc.perform(get("/answere").param("id", "1").param("questions", "What type of dog Barbi has?"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.id", is(1)))
            .andExpect(jsonPath("$.questions", is("What type of dog Barbi has?")));
  }
}
