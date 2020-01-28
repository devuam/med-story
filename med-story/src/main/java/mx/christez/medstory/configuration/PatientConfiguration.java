package mx.christez.medstory.configuration;

import java.util.Date;

public class PatientConfiguration {
	private Date birthday;
	private String fatherName;
	private Integer id;
	private String motherName;
	private String name;

	public PatientConfiguration(Date birthday, String fatherName, Integer id, String motherName, String name) {
		this.birthday = birthday;
		this.fatherName = fatherName;
		this.id = id;
		this.motherName = motherName;
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
