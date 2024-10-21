package cesur.splinter.models.dto;

import java.time.LocalDateTime;

import cesur.splinter.models.utils.enums.Roles;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private String password;
    private Roles rol;
    private Boolean active;
    private LocalDateTime lastConnection;
    //
    private LocalDateTime createdAt;
    private LocalDateTime deletedAt;
    private LocalDateTime updateAt;
}
