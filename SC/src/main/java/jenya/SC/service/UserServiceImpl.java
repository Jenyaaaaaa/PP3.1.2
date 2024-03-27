package jenya.SC.service;

import jenya.SC.model.User;
import jenya.SC.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

//    public UserService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    @Transactional(readOnly = true)
    public User findById (Long id) {
        return userRepository.getOne(id);
    }
    @Override
    @Transactional(readOnly = true)
    public List<User> findAll(){
        return userRepository.findAll();
    }

//    @Override
//    public User saveUser(User user) {
//        return null;
//    }
@Override
    public User saveUser (User user){
        return userRepository.save(user);
    }
    @Override
    public void deleteById (Long id){
        userRepository.deleteById(id);
    }
}

