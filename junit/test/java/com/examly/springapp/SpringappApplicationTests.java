package com.examly.springapp;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest(classes = SpringappApplication.class)
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
class SpringappApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	// add user
	@Test
	@Transactional
	public void test_case1() throws Exception {
		String newUser = "{\"email\":\"test@gmail.com\",\"password\":\"Test@123\",\"username\":\"test123\",\"mobileNumber\":\"9876543210\",\"userRole\":\"user\"}";
		mockMvc.perform(MockMvcRequestBuilders.post("/customer/addprofile")
				.contentType(MediaType.APPLICATION_JSON)
				.content(newUser)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();

	}

	// get user
	@Test
	@Transactional
	public void test_case2() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$").isNotEmpty())
				.andReturn();
	}

	// add gift
	@Test
	@Transactional
	public void test_case3() throws Exception {
		String newGift = "{\"giftId\":\"01\",\"giftName\":\"cup\",\"giftDetails\":\"awesome\",\"giftPrice\":\"250\"}";
		mockMvc.perform(MockMvcRequestBuilders.post("/addgift")
				.contentType(MediaType.APPLICATION_JSON)
				.content(newGift)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}

	// get gift
	@Test
	@Transactional
	public void test_case4() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/getgift")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$").isNotEmpty())
				.andReturn();

	}

	// update gift
	@Test
	@Transactional
	public void test_case5() throws Exception {
		String newGift = "{\"giftId\":\"01\",\"giftName\":\"cup\",\"giftDetails\":\"awesome\",\"giftPrice\":\"250\"}";
		mockMvc.perform(MockMvcRequestBuilders.put("/Gift/editGift/01")
				.param("giftId", "01")
				.contentType(MediaType.APPLICATION_JSON)
				.content(newGift)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}

	// delete gift by id
	@Test
	@Transactional
	public void test_case6() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.delete("/Gift/deleteGift/01")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}

	// add theme
	@Test
	@Transactional
	public void test_case7() throws Exception {
		String newGift = "{\"themeId\":\"01\",\"themeName\":\"black\",\"themeDetails\":\"awesome\",\"themePrice\":\"250\"}";
		mockMvc.perform(MockMvcRequestBuilders.post("/addtheme")
				.contentType(MediaType.APPLICATION_JSON)
				.content(newGift)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}

	// get theme
	@Test
	@Transactional
	public void test_case8() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/gettheme")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$").isNotEmpty())
				.andReturn();
	}

}
