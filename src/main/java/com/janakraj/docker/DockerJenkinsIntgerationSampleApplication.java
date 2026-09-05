package com.janakraj.docker;

import jakarta.annotation.PostConstruct;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerJenkinsIntgerationSampleApplication {

	private static final Logger logger = LogManager.getLogger(DockerJenkinsIntgerationSampleApplication.class);

	@PostConstruct
	public void init(){
		logger.info("Application started");
	}

	public static void main(String[] args) {
		logger.info("Application executed");
		SpringApplication.run(DockerJenkinsIntgerationSampleApplication.class, args);
	}

}
