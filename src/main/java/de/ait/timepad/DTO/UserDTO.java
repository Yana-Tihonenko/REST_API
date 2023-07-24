package de.ait.timepad.DTO;

import de.ait.timepad.models.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {
  private Long id;
  private String email;
  private String role;
  private String state;

  public  static UserDTO from (User user){
    return UserDTO.builder()
        .id(user.getId())
        .email(user.getEmail())
        .state(user.getState().name())
        .role(user.getState().name())
        .build();
  }

}
