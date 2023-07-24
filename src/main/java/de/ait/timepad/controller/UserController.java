package de.ait.timepad.controller;

import de.ait.timepad.DTO.NewUserDTO;
import de.ait.timepad.DTO.UserDTO;
import de.ait.timepad.models.User;
import de.ait.timepad.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {

  private final UsersService usersService;


  @PostMapping("/users")
  @ResponseStatus (HttpStatus.CREATED)
  @ResponseBody
  public UserDTO addUser(@RequestBody NewUserDTO newUser) {

    return usersService.addUser(newUser);

  }
}
