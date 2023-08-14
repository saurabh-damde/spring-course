package com.skd.crudtest;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.skd.crudtest.dao.StudentDAO;
import com.skd.crudtest.entity.Student;

@SpringBootApplication
public class CrudTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudTestApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			// createStudent(studentDAO);
			createMultipleStudents(studentDAO);
		};
	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		System.out.println("Creating Students...");
		List<Student> students = Arrays.asList(
				new Student("Jane", "Doe", "janedoe@email.com"),
				new Student("Gane", "Doe", "ganedoe@email.com"),
				new Student("Shane", "Doe", "shanedoe@email.com"));

		System.out.println("Saving Students...");
		students.stream().forEach(s -> studentDAO.save(s));
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating Student...");
		Student student = new Student("John", "Doe", "johndoe@email.com");

		System.out.println("Saving Student...");
		studentDAO.save(student);

		System.out.println("Saved Student, ID: " + student.getId());
	}
}
