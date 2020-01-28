package mx.christez.medstory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.christez.medstory.entity.JmsMessage;

public interface JmsMessageRepository extends JpaRepository<JmsMessage, Integer>{
}
