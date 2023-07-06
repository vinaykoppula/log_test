package in.vinayit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import in.vinayit.dao.UserRepository;
import in.vinayit.entity.User;

public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User addUser(User user) {
		return userRepository.save(user);
	}
	public List<User> getUsers(){
		List<User> users = userRepository.findAll();
		return users;
	}


	public User getUserByAddress(String address){

		return userRepository.findByAddress(address);
	}
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		
	}
}
