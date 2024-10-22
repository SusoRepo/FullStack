package cesur.splinter.models.dto;

import java.time.LocalDateTime;

import cesur.splinter.models.utils.enums.Roles;
import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Long id;
    @Nonnull
    private String name;
    @Nonnull
    private String email;
    @Nonnull
    private String password;
    @Nonnull
    private Roles rol;
    @Nonnull
    private Boolean active;
    private LocalDateTime lastConnection;
    private LocalDateTime createdAt;
    private LocalDateTime deletedAt;
    private LocalDateTime updateAt;
}



