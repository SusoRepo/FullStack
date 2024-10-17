package cesur.splinter.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cesur.splinter.models.Chat;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Long> {

}
