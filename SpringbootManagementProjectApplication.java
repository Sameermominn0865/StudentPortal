package com.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javaguides.sms.entity.Student;
import com.javaguides.sms.repository.StudentRepository;

@SpringBootApplication
public class SpringbootManagementProjectApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootManagementProjectApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Sameer", "Momin", "sameermomin@123.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Madara", "Uchiha", "sharingan@1123.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("pervy", "sage", "pervysage@106.com");
//		studentRepository.save(student3);
	}
}
