package br.com.soares.events.service;

import br.com.soares.events.entity.User;

import java.util.List;

public interface IUserService {
    public User addUser(User user);
    public User getUserById(Integer id);
    public List<User> getAllUsers();
}
