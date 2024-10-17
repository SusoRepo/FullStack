package cesur.splinter.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cesur.splinter.models.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
