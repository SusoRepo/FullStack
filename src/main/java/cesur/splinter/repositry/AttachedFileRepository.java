package cesur.splinter.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cesur.splinter.models.AttachedFile;

@Repository
public interface AttachedFileRepository extends JpaRepository<AttachedFile, Long> {

}
