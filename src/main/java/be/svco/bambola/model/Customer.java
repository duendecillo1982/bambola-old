package be.svco.bambola.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="customers")
@EntityListeners(AuditingEntityListener.class)
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String lastName;
	
		public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Customer() {
		
	}

	public Customer(Long id, String firstName, String lastName) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
		}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
