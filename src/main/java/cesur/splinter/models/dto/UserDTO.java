package cesur.splinter.models.dto;

import java.time.LocalDateTime;

import cesur.splinter.models.utils.enums.Roles;
import cesur.splinter.models.utils.validators.StrongPassword;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Long id;
    @NotBlank(message = "Nombre no puede estar vacio")
    @NotNull(message = "Se debe agregar un nombre")
    private String name;
    @Email
    @NotBlank(message = "Email no puede estar vacio")
    @NotNull(message = "Se debe agregar un email")
    @NotEmpty
    private String email;
    @StrongPassword
    private String password;
    private Roles rol;
    private Boolean active;
    private LocalDateTime lastConnection;
    private LocalDateTime createdAt;
    private LocalDateTime deletedAt;
    private LocalDateTime updateAt;
}



