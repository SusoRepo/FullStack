package cesur.splinter.services;

import java.util.List;
import cesur.splinter.models.dto.incidenceDTO;


public interface IncidenceService {
    incidenceDTO getIncidenceById(Long id);
    List<incidenceDTO> getIncidenceByUserName(String username);    
    void storeIncidence(incidenceDTO datos);
    void deleteIncidence(Long id);

}
