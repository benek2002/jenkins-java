package com.example.benek;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class BenekApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void helloTest() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/"))
				.andExpect(status().isOk())
				.andExpect(content().string("Hello Kubernates User!"));
	}

	@Test
	public void additionTest() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/addition/{a}/{b}", 2, 2))
				.andExpect(status().isOk())
				.andExpect(content().string("4.0"));
	}
	@Test
	public void substractionTest() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/substraction/{a}/{b}", 8, 2))
				.andExpect(status().isOk())
				.andExpect(content().string("6.0"));
	}
	@Test
	public void multiplicationTest() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/multiplication/{a}/{b}", 3, 3))
				.andExpect(status().isOk())
				.andExpect(content().string("9.0"));
	}
	@Test
	public void divisionTest() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/division/{a}/{b}", 10, 2.5))
				.andExpect(status().isOk())
				.andExpect(content().string("4.0"));
	}

}
