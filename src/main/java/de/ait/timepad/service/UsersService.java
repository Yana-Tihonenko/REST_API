package de.ait.timepad.service;

import de.ait.timepad.DTO.NewUserDTO;
import de.ait.timepad.DTO.UserDTO;
import de.ait.timepad.models.User;

public interface UsersService {

  UserDTO addUser(NewUserDTO newUser);

}
