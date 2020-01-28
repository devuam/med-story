package mx.christez.medstory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.christez.medstory.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{
	Role findByName(String string);
}
