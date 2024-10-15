package cesur.splinter.services;

import java.util.List;
import cesur.splinter.models.dto.incidenceDTO;


public interface IncidenceService {
    incidenceDTO getIncidenceById(Long id);
    List<incidenceDTO> getIncidenceByUserName(String username);    
    boolean storeIncidence(Integer id);
    void deleteIncidence(Long id);

}
