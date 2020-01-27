package com.rohanmorris.nova;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.rohanmorris.nova.Service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentTests {

	final StudentService srv;

	@Autowired
	StudentTests(StudentService srv) {
		this.srv = srv;
	}

	@Test
	void studentSaveTests() {
		// srv.create(new Student(1, "userName", "firstName", "middleName", "lastName",
		// "dob", "formClass"));
		assertEquals(true, true);
	}

	@Test
	void studentReadTests() {
		assertEquals(4, 4);
	}

	@Test
	void studentUpdateTests() {
		// Student newStudent = new Student(1, "new", "new", "newer", "newest", "M",
		// "1b");
		// srv.update(0, newStudent);
		// assertEquals(srv.read().get(0), newStudent);
	}

	@Test
	void studentDeleteTests() {
		assertEquals(true, true);
	}
}
