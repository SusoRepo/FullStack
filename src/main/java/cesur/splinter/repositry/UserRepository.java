package cesur.splinter.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cesur.splinter.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
