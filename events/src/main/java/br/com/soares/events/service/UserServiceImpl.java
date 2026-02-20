package br.com.soares.events.service;

import br.com.soares.events.entity.User;
import br.com.soares.events.exception.NotFoundException;
import br.com.soares.events.repo.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService{

    private UserRepo repo;

    public UserServiceImpl(UserRepo repo) {
        this.repo = repo;
    }

    @Override
    public User addUser(User user) {
        return repo.save(user);
    }

    @Override
    public User getUserById(Integer id) {
        return repo.findById(id).orElseThrow(()-> new NotFoundException("Id " + id + " not found."));
    }


    @Override
    public List<User> getAllUsers() {
        return repo.findAll();
    }
}
