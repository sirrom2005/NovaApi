package com.rohanmorris.nova.Repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import com.rohanmorris.nova.Interface.IPerson;
import com.rohanmorris.nova.Model.FormList;
import com.rohanmorris.nova.Model.Student;
import com.rohanmorris.nova.Model.StudentInfo;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonRepo implements IPerson {

    private SessionFactory sessionFactory;

    public Session getDbSession() {
        return this.sessionFactory.getCurrentSession();
    }

    private static final String _constr = "jdbc:mysql://localhost:3306/lyn_sys?user=root";
    private List<Student> list = new ArrayList<>();
    private HashMap<String, List<Student>> map = new HashMap<String, List<Student>>();

    public PersonRepo(SessionFactory sf) {
        this.sessionFactory = sf;

        /*
         * Query q =
         * sessionFactory.getCurrentSession().createQuery("SELECT * from view_formlist"
         * );
         * 
         * String sql = "SELECT * from view_formlist WHERE school_id = 1201103719;";
         * ResultSet rs; try { rs = execQuery(sql); while (rs.next()) { list.add(new
         * Student(rs.getInt("student_id"), rs.getString("username"),
         * rs.getString("firstname"), rs.getString("middlename"),
         * rs.getString("lastname"), rs.getString("gender"),
         * rs.getString("formclass"))); } } catch (ClassNotFoundException | SQLException
         * e1) { e1.printStackTrace(); }
         * 
         * List<String> grade =
         * list.stream().map(Student::getFormClass).distinct().collect(Collectors.toList
         * ()); grade.forEach(T -> { map.put(T, list.stream().filter(p ->
         * p.getFormClass().equals(T)).collect(Collectors.toList())); });
         */
    }

    private ResultSet execQuery(String sql) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connect = DriverManager.getConnection(_constr);
        Statement statement = connect.createStatement();
        return statement.executeQuery(sql);
    }

    @Override
    public int create(Student student) {
        list.add(student);
        return 1;
    }

    @Override
    public StudentInfo findById(int id) {
        String sql = "select * from view_student_list where student_id = " + id;
        ResultSet rs;
        try {
            rs = execQuery(sql);
            while (rs.next()) {
                return new StudentInfo(rs.getInt("student_id"), rs.getString("username"), rs.getString("firstname"),
                        rs.getString("middlename"), rs.getString("lastname"), rs.getString("gender"),
                        rs.getString("email"), rs.getString("street"), rs.getString("city_town"),
                        rs.getString("zip_code"), rs.getString("parish_id"), rs.getString("country_id"),
                        rs.getString("phone_home"), rs.getString("phone_mobile"), rs.getString("dob"),
                        rs.getString("active"), rs.getString("house_color_id"), rs.getString("house_color"));
            }
        } catch (ClassNotFoundException | SQLException e1) {
            e1.printStackTrace();
        }
        return null;
    }

    @Override
    public HashMap<String, List<Student>> read() {
        List<Student> student = getDbSession().createQuery("FROM Student WHERE school_id = 1201103719").list();
        List<String> grade = student.stream().map(Student::getFormclass).distinct().collect(Collectors.toList());

        grade.forEach(T -> { 
            map.put(T, student.stream().filter(p -> p.getFormclass().equals(T)).collect(Collectors.toList())); 
        });

        return map;
    }

    @Override
    public int count() {
        Object q = getDbSession().createSQLQuery("SELECT count(*) as cnt from view_formlist").uniqueResult();
        return Integer.parseInt(String.valueOf(q));
    }

    @Override
    public boolean delete(int id) {
        return false;//list.remove(id).getUserName().equals("tboswell5696") ? true : false;
    }

    @Override
    public Student update(int id, Student student) {
        return list.set(id, student);
    }
}