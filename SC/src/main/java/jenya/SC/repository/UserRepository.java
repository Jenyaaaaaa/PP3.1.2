package jenya.SC.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import jenya.SC.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
  //  List<User> findByLastName(String lastName);

}
