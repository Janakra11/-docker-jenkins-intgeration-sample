package com.janakraj.docker;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DockerJenkinsIntgerationSampleApplicationTests {

	private static final Logger logger = LogManager.getLogger(DockerJenkinsIntgerationSampleApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test executed...");
		logger.info("Test executing second log statements...");
		Assertions.assertEquals(true,true);
	}

}
