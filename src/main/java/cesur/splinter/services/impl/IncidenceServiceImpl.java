package cesur.splinter.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cesur.splinter.models.Incidence;
import cesur.splinter.models.dto.incidenceDTO;
import cesur.splinter.repositry.IncidenceRepository;
import cesur.splinter.services.IncidenceService;
import java.time.LocalDateTime;

@Service
public class IncidenceServiceImpl  implements IncidenceService {

    @Autowired
    IncidenceRepository incidenceRepository;

    @Override
    public incidenceDTO getIncidenceById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIncidenceById'");
    }

    @Override
    public List<incidenceDTO> getIncidenceByUserName(String username) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIncidenceByUserName'");
    }

    @Override
    public boolean storeIncidence(incidenceDTO datos) {        
        Incidence incidence = new Incidence();
        incidence.setCategory(datos.getCategory());
        incidence.setPriority(datos.getPriority());
        incidence.setDescription(datos.getDescription());
        incidence.setCreatedAt(LocalDateTime.now());
        incidence.setUserCreated(null);

        Incidence response = incidenceRepository.save(incidence);
        if(response == null){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void deleteIncidence(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteIncidence'");
    }

}
