package me.dio.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.domain.model.User;

@Repository
public interface UseRepository extends JpaRepository<User, Long> {
 
	boolean existsByAccountNumber(String accountNumber);
}
