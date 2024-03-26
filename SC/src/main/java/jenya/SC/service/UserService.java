package jenya.SC.service;

import jenya.SC.model.User;
import jenya.SC.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
 private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById (Long id) {
        return userRepository.getOne(id);
    }
    public List<User> findAll(){
return userRepository.findAll();
    }
    public User saveUser (User user){
return userRepository.save(user);
    }
    public void deleteById (Long id){
userRepository.deleteById(id);
    }
}
