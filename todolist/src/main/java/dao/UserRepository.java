package dao;

import entity.User;

public interface UserRepository {
	
	User get(Long id);
    void add(User user);
    void update(User user);
    void remove(User user);
	void add1(User user);
	void create(User user);
	User get1(Long id);
	User read(Long id);

}
