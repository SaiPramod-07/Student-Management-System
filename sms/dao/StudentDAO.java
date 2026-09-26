package com.sms.dao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saipr
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.sms.util.DBConnection;
import com.sms.model.Student;
public class StudentDAO {
    public void addStudent(Student s) {

        try {

            Connection con = DBConnection.getConnection();

            String query = "INSERT INTO student(stdName, stdFatherName, stdBlood, stdPhone, stdCity, class) VALUES (?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, s.getStdName());
            ps.setString(2, s.getStdFatherName());
            ps.setString(3, s.getStdBlood());
            ps.setString(4, s.getStdPhone());
            ps.setString(5, s.getStdCity());
            ps.setString(6, s.getStudentClass());

            System.out.println("Executing insert");
            
            ps.executeUpdate();

            System.out.println("Student Added Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void viewStudents()
{
    try
    {
        Connection con = DBConnection.getConnection();

        String query = "SELECT * FROM student";

        PreparedStatement ps = con.prepareStatement(query);

        ResultSet rs = ps.executeQuery();

        while(rs.next())
        {
            int id = rs.getInt("id");
            String name = rs.getString("stdName");
            String father = rs.getString("stdFatherName");
            String blood = rs.getString("stdBlood");
            String phone = rs.getString("stdPhone");
            String city = rs.getString("stdCity");
            String studentClass = rs.getString("class");

            System.out.println("ID:"+id + ", " +"Name:"+ name + ", " +"FatherName:"+ father + ", " +"Blood Group:"+ blood + ", " +"Phone No:"+ phone + ", " +"City:"+ city + ", " +"Class:"+ studentClass);
        }

    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}
    public void deleteStudent(int id)
{
    try
    {
        Connection con = DBConnection.getConnection();

        String query = "DELETE FROM student WHERE id = ?";

        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, id);

        ps.executeUpdate();

        System.out.println("Student deleted successfully!");

    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}
    public void updateStudent(Student s, int id)
{
    try
    {
        Connection con = DBConnection.getConnection();

        String query = "UPDATE student SET stdName=?, stdFatherName=?, stdBlood=?, stdPhone=?, stdCity=?, class=? WHERE id=?";

        PreparedStatement ps = con.prepareStatement(query);

        ps.setString(1, s.getStdName());
        ps.setString(2, s.getStdFatherName());
        ps.setString(3, s.getStdBlood());
        ps.setString(4, s.getStdPhone());
        ps.setString(5, s.getStdCity());
        ps.setString(6, s.getStudentClass());

        ps.setInt(7, id);

        ps.executeUpdate();

        System.out.println("Student updated successfully!");

    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}
}
