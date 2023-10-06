package me.dio.Service;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

public interface UseService {
	
 org.apache.catalina.User finById(Long id);
 
 User create(User userToCreate);

User create();
 
}
