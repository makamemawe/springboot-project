package Project.Spring.Project.UserService;

import Project.Spring.Project.models.Users;
import Project.Spring.Project.userRepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<Users> getAllUsers() {

        return userRepository.findAll();
    }
    public Users addUsers(Users users){

        return userRepository.save(users);
    }
    public Optional <Users> getById(Integer userId){

        return userRepository.findById(userId);
    }
    public void deleteMe( Integer userId){
        userRepository.deleteById(userId);
    }
    }

