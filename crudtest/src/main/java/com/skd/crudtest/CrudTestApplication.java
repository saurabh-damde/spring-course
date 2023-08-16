package com.skd.crudtest;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

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
			// readStudent(studentDAO);

			// System.out.println("\nQuery to retrieve all Students...");
			// readAllStudents(studentDAO);
			// System.out.println("\nQuery to retrieve Students by Last Name...");
			// readStudentsByLastName(studentDAO);

			// updateStudent(studentDAO);
			// deleteStudent(studentDAO);
			// deleteAllStudents(studentDAO);
		};
	}

	private void deleteAllStudents(StudentDAO studentDAO) {
		System.out.println("Deleting All Students...");
		int rows = studentDAO.deleteAll();
		System.out.println(rows + " Rows Deleted...");
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int id = 2;
		System.out.println("Deleting Student with ID: " + id);
		studentDAO.delete(id);
	}

	private void updateStudent(StudentDAO studentDAO) {
		int id = 2;
		System.out.println("Getting Student with ID: " + id);
		Student student = studentDAO.findById(id);
		System.out.println("Updating Student...");
		student.setFirstName("Dane");
		studentDAO.update(student);
		System.out.println("Updated Student: " + student);
	}

	private void readStudentsByLastName(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findByLastName("Duck");
		students.stream().forEach(System.out::println);
	}

	private void readAllStudents(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findAll();
		students.stream().forEach(System.out::println);
	}

	private void readStudent(StudentDAO studentDAO) {
		// System.out.println("Creating student object...");
		// Student student = new Student("Daffy", "Duck", "daffyduck@email.com");
		// System.out.println("Saving the student...");
		// studentDAO.save(student);
		// System.out.println("Saved Student ID: " + student.getId());
		int id = new Random().nextInt(5);
		System.out.println("Retrieving Student with ID: " + id);
		Student stud = studentDAO.findById(id);
		System.out.println("Found Student: " + stud);
	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		System.out.println("Creating Students...");
		List<Student> students = Arrays.asList(
				new Student("John", "Doe", "johndoe@email.com"),
				new Student("Jane", "Doe", "janedoe@email.com"),
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
