package com.vega.springit;

import org.ocpsoft.prettytime.PrettyTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.thymeleaf.extras.springsecurity5.dialect.SpringSecurityDialect;

import com.vega.springit.domain.Comment;
import com.vega.springit.domain.Link;
import com.vega.springit.repository.CommentRepository;
import com.vega.springit.repository.LinkRepository;

@SpringBootApplication
@EnableJpaAuditing
public class SpringitApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringitApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringitApplication.class, args);
	}

	@Bean
	PrettyTime PrettyTime() {
		return new PrettyTime();
	}

	// TODO * Configuring this bean should not be needed once Spring Boot's
	// Thymeleaf starter includes configuration
	// TODO for thymeleaf-extras-springsecurity5 (instead of
	// thymeleaf-extras-springsecurity4)
	@Bean
	public SpringSecurityDialect securityDialect() {
		return new SpringSecurityDialect();
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