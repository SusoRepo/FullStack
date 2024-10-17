package cesur.splinter.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AttachedFileDTO {
    private String name;
    private String mimeType;
    private String route;
    private String idIncidence;
}
