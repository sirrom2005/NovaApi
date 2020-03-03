package com.rohanmorris.nova;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.rohanmorris.nova.Model.ClassRoom;
import com.rohanmorris.nova.Model.StudentBehavior;
import com.rohanmorris.nova.Model.StudentConduct;
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
    void StudentBehaviorSaveTests() {
        StudentBehavior obj = new StudentBehavior();
        obj.setStudent_id(1154040);
        obj.setComments("The comment");
        obj.setTeacher_id(4444);

        ClassRoom cRoom = new ClassRoom();
        cRoom.setId(42);
        obj.setClass_room(cRoom);
        
        StudentConduct conduct = new StudentConduct();
        conduct.setId(11);
		obj.setConduct(conduct);

        long id = repo.create(obj);
        assertEquals(true, id > 0 ? true : false);
    }
}