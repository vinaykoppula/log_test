package service;

import java.util.List;

import dao.UserRepository;
import entity.User;

public class UserServiceImpl {
	private User user;
	private UserRepository userRepository;

	public User addUser(User user) throws UserAlreadyExistsException {
        if(UserRepository.existsById(User.getId())){
            throw new UserAlreadyExistsException();
        }
        return userRepository.save(user);
    }
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

}
