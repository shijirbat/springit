package com.vega.springit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.vega.springit.domain.Comment;
import com.vega.springit.domain.Link;
import com.vega.springit.repository.CommentRepository;
import com.vega.springit.repository.LinkRepository;

@SpringBootApplication
public class SpringitApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringitApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringitApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository) {
		return args -> {

			/*
			 * Link link = new Link("Getting started with Spring Boot 2",
			 * "https://google.com"); linkRepository.save(link);
			 * 
			 * Comment comment = new Comment("Spring boot2 is awesome", link);
			 * commentRepository.save(comment);
			 * 
			 * link.addComment(comment); System.out.println(link.toString());
			 */

//			Link firstLink = linkRepository.findByTitle("Getting started with Spring Boot 2");
//			System.out.println(firstLink.getTitle());
		};
	}

}