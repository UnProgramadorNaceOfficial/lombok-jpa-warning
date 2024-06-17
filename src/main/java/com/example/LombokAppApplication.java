package com.example;

import com.example.persistence.entity.Player;
import com.example.persistence.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class LombokAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokAppApplication.class, args);
	}

	@Autowired
	private PlayerRepository playerRepository;

	@Bean
	CommandLineRunner init(){
		return args -> {
			List<Player> playerList = this.playerRepository.findAll();

			System.out.println(playerList.hashCode());
		};
	}
}
