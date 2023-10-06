package me.dio.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import  org.springframework.web.bind.annotation.RestController;

import me.dio.Service.UseService;
import me.dio.domain.model.User;
@RestController
@RequestMapping("/User")
public class UserController {
	
private final UseService useService;

public UserController(UseService useService) {
	this.useService = useService;
}
@GetMapping("/{id}")
public ResponseEntity<org.apache.catalina.User> findById(@PathVariable Long id){
	var user = useService.finById(id);
	return ResponseEntity.ok(user);
}
@PostMapping
public ResponseEntity<org.apache.catalina.User>create(@RequestBody User user){
	 
var userCreated = userService.create(userToCreate);
URI location = ServletUricomponemtsBuilder.fromCurrentRequest()
.path("/{id}")
.buildAndExpand(userCreated.getid())
.toUri();
	return ResponseEntity.created(location).body(userCreated);
}

}
