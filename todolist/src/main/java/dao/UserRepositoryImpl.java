package dao;

import entity.User;

public class UserRepositoryImpl implements UserRepository{
	private UserRepository userRepository;

	@Override
    public User get1(Long id) {
        User user = userRepository.read(id);
        return user;
    }

    @Override
    public void add1(User user) {
    	userRepository.create(user);
    }

	@Override
	public User get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User read(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
