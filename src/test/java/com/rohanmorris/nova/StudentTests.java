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
	void studentCountTests() {
		assertEquals(srv.read().size(), srv.getCount());
	}

	@Test
	void studentSaveTests() {
		//srv.create(new Student(1, "userName", "firstName", "middleName", "lastName", "dob", "formClass"));
		//assertEquals(srv.getCount(), 5);
	}

	@Test
	void studentCreateTests() {
		//Student newStudent = new Student(1, "new", "new", "newer", "newest", "1/1/2020", "1b");
		//srv.create(newStudent);
		// assertEquals(srv.read().contains(newStudent), true);
	}

	@Test
	void studentReadTests() {
		assertEquals(srv.read().size(), 4);
	}

	@Test
	void studentUpdateTests() {
		//Student newStudent = new Student(1, "new", "new", "newer", "newest", "M", "1b");
		//srv.update(0, newStudent);
		//assertEquals(srv.read().get(0), newStudent);
	}

	@Test
	void studentDeleteTests() {
		assertEquals(srv.delete(0), true);
	}
}
