package com.rohanmorris.nova;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import com.rohanmorris.nova.Model.StudentBehavior;
import com.rohanmorris.nova.Repo.StudentBehaviorRepo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentBehaviorTest {
    final StudentBehaviorRepo repo;

    @Autowired
    StudentBehaviorTest(StudentBehaviorRepo re) {
        this.repo = re;
    }

    @Test
    void StudentBehaviorTestReadTests() {
        List<StudentBehavior> list = repo.read();
        assertEquals(1, list.size());
	}
}