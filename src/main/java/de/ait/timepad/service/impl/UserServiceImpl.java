package de.ait.timepad.service.impl;

import de.ait.timepad.DTO.NewUserDTO;
import de.ait.timepad.DTO.UserDTO;
import de.ait.timepad.models.User;
import de.ait.timepad.repositories.UsersRepository;
import de.ait.timepad.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static de.ait.timepad.DTO.UserDTO.from;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UsersService {

  private final UsersRepository usersRepository;

  @Override
  public UserDTO addUser(NewUserDTO newUser) {
    User user = User.builder()
        .email(newUser.getEmail())
        .password(newUser.getPassword())
        .role(User.Role.USER)
        .state(User.State.NOT_CONFIRMED)
        .build();

    usersRepository.save(user);
    return from(user);
  }
}
