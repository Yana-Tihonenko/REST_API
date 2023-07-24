package de.ait.timepad.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {
  @Autowired
  private MockMvc mockMvc;

  @Test
  void addUser() throws Exception {

    mockMvc.perform(post("/api/users")
        .header("Content-type/json", "application/json")
        .content("{\"email\": \"tihonenkoyana@gmail.com\",\"password\": \"123123\"}"))
        .andExpect(status().isCreated());
  }
}
