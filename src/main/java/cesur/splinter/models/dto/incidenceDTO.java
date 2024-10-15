package cesur.splinter.models.dto;

import cesur.splinter.models.utils.Priorities;
import cesur.splinter.models.utils.Scopes;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class incidenceDTO {
    private Long id;
    private String description;
    private Priorities priority;
    private Scopes scope;
    private String userCreated;    
}
