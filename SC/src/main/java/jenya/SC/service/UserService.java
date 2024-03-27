package jenya.SC.service;
import jenya.SC.model.User;

import java.util.List;

public interface UserService {
//    private final UserRepository userRepository;
//
//    public UserServiceImpl(UserRepository userRepository);


    public User findById(Long id);

    public List<User> findAll();

    public User saveUser(User user);

    public void deleteById(Long id);
}

