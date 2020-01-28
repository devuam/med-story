package mx.christez.medstory.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
public class AppUser {
	@Size(min = 1, message = "Dirección inválida")
	@Email(message = "Dirección inválida")
	@Column(unique = true)
	private String email;
	
	private boolean enabled;
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	@Size(min = 3, message = "La contraseña debe tener al menos 3 caracteres")
	private String password;
	
	@OneToMany(mappedBy = "appUser", cascade = CascadeType.REMOVE)
	private List<Patient> patients;
	
	@ManyToMany
	@JoinTable
	private List<Role> roles;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
}
