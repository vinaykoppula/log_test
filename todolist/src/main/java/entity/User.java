package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

	@Id
	private Long id;
    private String userName;
    private String firstName;
    private String email;
	public static Object getId() {
		// TODO Auto-generated method stub
		return null;
	}
}
