package mx.christez.medstory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.christez.medstory.entity.AppUser;
import mx.christez.medstory.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer>{
	Patient findByNameAndFatherNameAndMotherName(String name, String fatherName, String motherName);

	List<Patient> findByAppUser(AppUser appUser);
}
