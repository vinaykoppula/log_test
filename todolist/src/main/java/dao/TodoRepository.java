package dao;

import entity.User;

public interface TodoRepository {

	User get(Long id);
    User add(Long id);
    void update(User user);
    static void remove(User user) {
		// TODO Auto-generated method stub
		
	}
}
