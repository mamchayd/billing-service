package ma.enset.model;
import javax.persistence.Entity;

import lombok.Data;

@Data
public class Customer {
	private Long id;
	private String name;
	private String email;

}
