package cesur.splinter.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChatDTO {
    private String message;
    private String idUser;
    private String idIncidence;

}
