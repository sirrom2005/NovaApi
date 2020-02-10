package com.rohanmorris.nova;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.rohanmorris.nova.Model.Account;
import com.rohanmorris.nova.Model.AccountSchool;
import com.rohanmorris.nova.Model.ClassRoomStudent;
import com.rohanmorris.nova.Model.HouseColor;
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

        AccountSchool accountSchool = new AccountSchool();
        accountSchool.setSchool_id(1201103719);
        acc.setAccountschool(accountSchool);

        HouseColor housecolor = new HouseColor();
        housecolor.setHouse_color_id(7);
        acc.setHousecolor(housecolor);

        ClassRoomStudent classRoomStudent = new ClassRoomStudent();
        classRoomStudent.setClass_room_id(17);
        acc.setClassroom(classRoomStudent);

        long id = srv.create(acc);
        assertEquals(id, accId);
    }
}