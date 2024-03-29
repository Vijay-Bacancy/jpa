package com.vijay.jpa;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vijay.jpa.entity.User;
import com.vijay.jpa.service.UserDAOService;
import com.vijay.jpa.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner{

	private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Jill", "Admin");
		userRepository.save(user);
		log.info("New USer is created : "+user);
		
		Optional<User> userWithIdOne = userRepository.findById(1L);
		
		log.info("user is retrieved: "+userWithIdOne);
		
		List<User> users = userRepository.findAll();
		log.info("all users: "+users);
	
		
	}

}
