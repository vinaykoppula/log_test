package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

	@Id
	private Integer id;
	private String fName;
	private String lName;
	
}
