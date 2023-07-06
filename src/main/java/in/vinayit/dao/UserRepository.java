package in.vinayit.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.vinayit.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByAddress(String address);
}
