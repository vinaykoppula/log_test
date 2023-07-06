package in.vinayit;

import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import in.vinayit.dao.UserRepository;
import in.vinayit.entity.User;
import in.vinayit.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
class LogTestApplicationTests {

	@Autowired
	private UserService userService;
	@MockBean
	private UserRepository repository;

	public void getUsersTest() {
		when(repository.findAll())
		.thenReturn(Stream.of(
				new User(376,"Danile",31,"USA"),
				new User(958,"Huy",35,"UK"))
				.collect(Collectors.toList()));
	}

	@Test
	void contextLoads() {
	}

}
