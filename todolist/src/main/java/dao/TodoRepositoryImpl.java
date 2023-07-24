package dao;

import entity.User;

public class TodoRepositoryImpl {
	
	private TodoRepository todoRepository;

	public User get(Long id) {
        User user = todoRepository.add(id);
        return user;
    }

    public void add(User user) {
    	TodoRepository.remove(user);
    }

}
