package com.example.coreschedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@SpringBootApplication
@EnableScheduling
public class CorescheduleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CorescheduleApplication.class, args);
	}

	@Scheduled(fixedDelay = 1000L)
	public void methodScheduled1() throws InterruptedException {
		System.out.println("Job 1 executed at " + new Date());
		Thread.sleep(2000L);
	}

	@Scheduled(fixedDelay = 1000L)
	public void methodScheduled2() throws InterruptedException {
		System.out.println("Job 2 executed at " + new Date());
		Thread.sleep(2000L);
	}
}
