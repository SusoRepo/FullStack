package cesur.splinter.repositry;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cesur.splinter.models.Incidence;
import cesur.splinter.models.User;

@Repository
public interface IncidenceRepository extends JpaRepository<Incidence, Long> {
    
    Optional<List<Incidence>> findByUser(User user);

}
