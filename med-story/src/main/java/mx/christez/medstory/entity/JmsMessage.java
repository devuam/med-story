package mx.christez.medstory.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class JmsMessage {
	private String email;
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String password;
	
	private String queue;

	public JmsMessage(String email, String password, String queue) {
		this.email = email;
		this.password = password;
		this.queue = queue;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getQueue() {
		return queue;
	}

	public void setQueue(String queue) {
		this.queue = queue;
	}
}
