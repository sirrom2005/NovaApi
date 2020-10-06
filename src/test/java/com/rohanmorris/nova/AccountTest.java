package com.rohanmorris.nova;

import com.rohanmorris.nova.Model.ExtraCurricularActivity;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import com.rohanmorris.nova.Model.Account;
import com.rohanmorris.nova.Model.AccountSchool;
import com.rohanmorris.nova.Service.AccountService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AccountTest {

    private final AccountService srv;

    @Autowired
    AccountTest(AccountService srv) {
        this.srv = srv;
    }

    @Test
    void accountCreateTests() {
        Account acc = new Account();
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
      
        AccountSchool accountSchool = new AccountSchool();
        accountSchool.setSchool_id(1201103719);
        acc.setAccountschool(accountSchool);

        // HouseColor housecolor = new HouseColor();
        // housecolor.setHouse_color_id(7);
        // acc.setHousecolor(housecolor);

        //ClassRoom classRoomStudent = new ClassRoom();
        //classRoomStudent.setId(17);
        //acc.setClassroom(classRoomStudent);

        List<ExtraCurricularActivity> exList = new ArrayList<>();
        ExtraCurricularActivity ex1 = new ExtraCurricularActivity();
        ExtraCurricularActivity ex2 = new ExtraCurricularActivity();
        ex1.setId(1);
        exList.add(ex1);
        ex2.setId(5);
        exList.add(ex2);
        //acc.setExtra_curricular_activity(exList);

        long id = srv.create(acc);
        assertEquals(true, id > 1001000 ? true : false);
    }

    @Test
    void accountUpdateTests() {
        Account acc = new Account();
        acc.setFirstname("update");
        acc.setMiddlename("update");
        acc.setLastname("update");
        acc.setEmail("update@update.com");
        acc.setStreet("update");
        acc.setCity_town("update");
        acc.setZip_code("00000");
        acc.setPhone_home("123");
        acc.setPhone_mobile("555");
        acc.setCountry_id(108);
        acc.setParish_id(1645);
        acc.setGender("M");
        acc.setDob("1980-10-10");
        acc.setAccount_type(3);
     
        // HouseColor housecolor = new HouseColor();
        // housecolor.setHouse_color_id(3);
        // acc.setHousecolor(housecolor);

        //ClassRoom classRoomStudent = new ClassRoom();
        //classRoomStudent.setId(3);
        //acc.setClassroom(classRoomStudent);

        List<ExtraCurricularActivity> exList = new ArrayList<>();
        ExtraCurricularActivity ex1 = new ExtraCurricularActivity();
        ExtraCurricularActivity ex2 = new ExtraCurricularActivity();
        ex1.setId(3);
        exList.add(ex1);
        ex2.setId(6);
        exList.add(ex2);
        //acc.setExtra_curricular_activity(exList);

        Account rs = srv.update(1580000, acc);
        assertEquals(1580000, rs.getAcconut_id());
        assertEquals(acc.getEmail(), rs.getEmail());
    }
}