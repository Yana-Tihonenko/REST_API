package de.ait.timepad.repositories.iml;

import de.ait.timepad.models.User;
import de.ait.timepad.repositories.UsersRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepositoryListIml implements UsersRepository {
  private  static List<User> users = new ArrayList<>();

  @Override
  public void save(User user) {
    user.setId((long) users.size());
    users.add(user);
  }
}
