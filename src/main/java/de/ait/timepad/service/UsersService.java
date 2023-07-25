package de.ait.timepad.service;

import de.ait.timepad.DTO.NewUserDTO;
import de.ait.timepad.DTO.UserDTO;

public interface UsersService {

  UserDTO addUser(NewUserDTO newUser);

}
