/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sms.main;

/**
 *
 * @author saipr
 */
import java.util.Scanner;
import com.sms.dao.StudentDAO;
import com.sms.model.Student;
public class MainApp {
//    public static void main(String[] args)
//    {
//        Student s=new Student("Sai","Rambabu","O-","8075187226","Chennai","10");
//        StudentDAO dao=new StudentDAO();
//        dao.addStudent(s);
//        Student s2=new Student("Nirmal","subbarao","B+","8500324667","Chennai","1");
//        dao.addStudent(s2);
//        dao.viewStudents();
//        dao.deleteStudent(3);
//        Student s3=new Student("Charan","Ravi","AB+","8073967116","Guntur","7");
//        dao.updateStudent(s3, 4);
//    }
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while(true)
        {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice)
            {
                case 1:

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Father Name: ");
                    String father = sc.nextLine();

                    System.out.print("Enter Blood Group: ");
                    String blood = sc.nextLine();

                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter City: ");
                    String city = sc.nextLine();

                    System.out.print("Enter Class: ");
                    String studentClass = sc.nextLine();

                    Student s = new Student(name,father,blood,phone,city,studentClass);
                    dao.addStudent(s);

                    break;

                case 2:

                    dao.viewStudents();
                    break;

                case 3:

                    System.out.print("Enter Student ID to update: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    name = sc.nextLine();

                    System.out.print("Enter New Father Name: ");
                    father = sc.nextLine();

                    System.out.print("Enter New Blood Group: ");
                    blood = sc.nextLine();

                    System.out.print("Enter New Phone: ");
                    phone = sc.nextLine();

                    System.out.print("Enter New City: ");
                    city = sc.nextLine();

                    System.out.print("Enter New Class: ");
                    studentClass = sc.nextLine();

                    Student updatedStudent = new Student(name,father,blood,phone,city,studentClass);
                    dao.updateStudent(updatedStudent,id);

                    break;

                case 4:

                    System.out.print("Enter Student ID to delete: ");
                    id = sc.nextInt();

                    dao.deleteStudent(id);

                    break;

                case 5:

                    System.out.println("Exiting program...");
                    System.exit(0);

                default:

                    System.out.println("Invalid choice!");

            }
        }
    }
}
