package com.rohanmorris.nova;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import com.rohanmorris.nova.Model.Account;
import com.rohanmorris.nova.Model.ExtraCurricularActivity;
import com.rohanmorris.nova.Service.AccountService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AccountTest {

    final AccountService srv;

    @Autowired
    AccountTest(AccountService srv) {
        this.srv = srv;
    }

    @Test
    void accountSaveTests() {

        Account acc = new Account();
        long accId = 8;
        acc.setFirstname(" Fname ");
        acc.setMiddlename("Middlename");
        acc.setLastname("Last name");
        acc.setEmail("test@testing.com");
        acc.setStreet("101 lucus drv");
        acc.setCity_town("outter rim");
        acc.setZip_code("00000");
        acc.setPhone_home("123");
        acc.setPhone_mobile("555");
        acc.setCountry_id(108);
        acc.setParish_id(1645);
        acc.setGender("M");
        acc.setDob("1980-10-10");
        acc.setAccount_type(3);
        acc.setUsername("username");

        /*
         * AccountSchool accountSchool = new AccountSchool();
         * accountSchool.setSchool_id(1201103719); acc.setAccountschool(accountSchool);
         * 
         * HouseColor housecolor = new HouseColor(); housecolor.setHouse_color_id(7);
         * acc.setHousecolor(housecolor);
         * 
         * ClassRoomStudent classRoomStudent = new ClassRoomStudent();
         * classRoomStudent.setClass_room_id(17); acc.setClassroom(classRoomStudent);
         * List<ExtraCurricularActivity> exList = new ArrayList<>();
         * ExtraCurricularActivity ex = new ExtraCurricularActivity(); ex.setId(16);
         * ex.setName("ttt"); exList.add(ex); acc.setExtra_curricular_activity(exList);
         */

        long id = srv.create(acc);
        assertEquals(id, accId);
    }
}