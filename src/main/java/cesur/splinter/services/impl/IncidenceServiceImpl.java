package cesur.splinter.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cesur.splinter.models.Incidence;
import cesur.splinter.models.User;
import cesur.splinter.models.dto.incidenceDTO;
import cesur.splinter.repositry.IncidenceRepository;
import cesur.splinter.repositry.UserRepository;
import cesur.splinter.services.IncidenceService;
import java.time.LocalDateTime;

@Service
public class IncidenceServiceImpl  implements IncidenceService {

    @Autowired
    IncidenceRepository incidenceRepository;
    @Autowired
    UserRepository userRepository;


    @Override
    public List<Incidence> getIncidenceByUserName(String username) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIncidenceByUserName'");
    }

    @Override
    public void storeIncidence(incidenceDTO datos) {  
        Optional<User> user = userRepository.findById(Long.parseLong(datos.getUserCreated()));
        if (user.isPresent()) {
            Incidence incidence = new Incidence();
            incidence.setDescription(datos.getDescription());
            incidence.setCreatedAt(LocalDateTime.now());
            incidence.setPriority(datos.getPriority());
            incidence.setScope(datos.getScope());
            incidence.setUserCreated(user.get());
            incidenceRepository.save(incidence);          
        }
         
    }

    @Override
    public void deleteIncidence(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteIncidence'");
    }

    @Override
    public List<Incidence> getAllIncidences() {
        return incidenceRepository.findAll();
    }

     

}
