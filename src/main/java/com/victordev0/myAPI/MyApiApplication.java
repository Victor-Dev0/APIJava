package com.victordev0.myAPI;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.victordev0.myAPI.entities.Comment;
import com.victordev0.myAPI.entities.User;
import com.victordev0.myAPI.repositories.CommentRepository;
import com.victordev0.myAPI.repositories.UserRepository;

@SpringBootApplication
public class MyApiApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CommentRepository commentRepositorie;
	
	public static void main(String[] args) {
		SpringApplication.run(MyApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User cat1 = new User(1L, "usuarioVictor", "victorSenha123");
		User cat2 = new User(2L, "usuarioHannele", "hanneleSenha123");

		Comment p1 = new Comment(1L, "Bom dia a todos!", cat1);
		Comment p2 = new Comment(2L, "Brigada volte sempre", cat2);
		Comment p3 = new Comment(3L, "Nu a arena do galo ta top !!!", cat1);
		Comment p4 = new Comment(4L, "Não aguento mais essa vida de pobre", cat2);

		cat1.getComments().addAll(Arrays.asList(p1, p3));
		cat2.getComments().addAll(Arrays.asList(p2, p4));
		
		userRepository.save(cat1);
		userRepository.save(cat2);
		
		commentRepositorie.save(p1);
		commentRepositorie.save(p2);
		commentRepositorie.save(p3);
		commentRepositorie.save(p4);
		
		
	}

}
