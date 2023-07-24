package dao;

import entity.TodoItem;
import entity.User;

public interface TodoRepository {

	User get(Long id);
    User add(Long id);
    void update(User user);
    static void remove(User user) {
		// TODO Auto-generated method stub
		
	}
	static boolean existsById(Object id) {
		// TODO Auto-generated method stub
		return false;
	}
	static TodoItem save() {
		// TODO Auto-generated method stub
		return null;
	}
}
