package cesur.splinter.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cesur.splinter.models.Incidence;

@Repository
public interface IncidenceRepository extends JpaRepository<Incidence, Long> {

}
