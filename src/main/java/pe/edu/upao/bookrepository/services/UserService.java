package pe.edu.upao.bookrepository.services;

import org.springframework.stereotype.Service;
import pe.edu.upao.bookrepository.models.User;

import java.util.List;

@Service
public interface UserService {
    User createUser(User user);
    List<User> getAllUsers();
    User getUserById(Long id);
    User getuserByUsername(String username);
    User addUser(User user);
    User updateUser(Long id, User user);
    void deleteUser(Long id);
    User register(String username, String password, String email);
    User login(String username, String password);
}

