package mx.christez.medstory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.christez.medstory.entity.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Integer>{
	AppUser findByEmail(String email);
}
