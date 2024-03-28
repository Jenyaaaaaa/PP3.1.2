package jenya.SC.service;

import jenya.SC.model.User;
import jenya.SC.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

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

@Override
@Transactional(readOnly = true)
    public User saveUser (User user){
        return userRepository.save(user);
    }
    @Override
    @Transactional(readOnly = true)
    public void deleteById (Long id){
        userRepository.deleteById(id);
    }
}

