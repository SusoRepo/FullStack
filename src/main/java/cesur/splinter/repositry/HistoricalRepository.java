package cesur.splinter.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cesur.splinter.models.Historical;

@Repository
public interface HistoricalRepository extends JpaRepository<Historical, Long> {

}
