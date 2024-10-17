package cesur.splinter.services;

import java.util.List;

import cesur.splinter.models.Incidence;
import cesur.splinter.models.dto.incidenceDTO;


public interface IncidenceService {
    List<Incidence> getAllIncidences();
    List<Incidence> getIncidenceByUserName(String username);    
    void storeIncidence(incidenceDTO datos);
    void deleteIncidence(Long id);

}
