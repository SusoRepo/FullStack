package cesur.splinter.models.dto;

import cesur.splinter.models.utils.enums.Priorities;
import cesur.splinter.models.utils.enums.Scopes;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class incidenceDTO {
    private String description;
    private Priorities priority;
    private Scopes scope;
    private String userCreated;    
}




