/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nyaga;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
@WebService(serviceName = "GetStudent")
public class GetStudent {

    /**
     * This is a sample web service operation
     */
    
    String Result = "No Records Found";
    
    @WebMethod(operationName = "StudentID")
    public String hello(@WebParam(name = "StudentID") int StudentID) {
        
        try{
        String myDriver = "com.mysql.jdbc.Driver";
        String myUri = "jdbc:mysql://localhost/students";
        Class.forName(myDriver);
        Connection con = DriverManager.getConnection(myUri,"root","");
        String query = "SELECT * FROM students WHERE admission_number = '"+StudentID+"'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next()){
                StudentID = rs.getInt("admission_number");
                String student_name = rs.getString("student_name");
                String course = rs.getString("course");
                String year = rs.getString("year");
                String semester = rs.getString("semester");
                String email = rs.getString("email");
                int phonenumber= rs.getInt("phonenumber");
                int address= rs.getInt("address");
                String code = rs.getString("code");
                int entry_points = rs.getInt("entry_points");
                Result = "Admission Number : "+StudentID+"\n"
                        +"Student Name     : "+student_name+"\n"
                        +"Course           : "+course+"\n"
                        +"Year             : "+year+"\n"
                        +"Semester         : "+semester+"\n"
                        +"Email            : "+email+"\n"
                        +"Phonenumber      : +254 "+phonenumber+"\n"
                        +"Address          : "+address+"\n"
                        +"Code             : "+code+"\n"
                        +"Entry Points     : "+entry_points+"\n";
            }
            st.close();
            con.close();
        }
        catch(Exception ex)
        {
          Result = "ERROR! " + ex.getMessage();
        }
        
        return Result;
    }
    
     @WebMethod(operationName = "insertStudentDetails")
    public String insertStudentDetails(int admission_number,String student_name,String student_course,int student_year,int student_semester,
       String student_email,int student_phonenumber,int student_address,int student_code,int entry_points) {
       String Result = "Failed! Registering Student";
       try{
       String myDriver = "com.mysql.jdbc.Driver";
       String myUrl= "jdbc:mysql://localhost/students";
       Class.forName(myDriver);
       Connection con = DriverManager.getConnection(myUrl,"root","");
       Statement stmt = con.createStatement();
       String sql = "INSERT INTO `students`(`admission_number`, `student_name`, `course`, `year`, `semester`, `email`, `phonenumber`, `address`, `code`, `entry_points`) VALUES ("+admission_number+",'"+student_name+"','"+student_course+"',"+student_year+","+student_semester+",'"+student_email+"',"+student_phonenumber+","+student_address+","+student_code+","+entry_points+")";
       stmt.executeUpdate(sql); 
       Result = "Success";
       }
        catch(Exception ex)
        {   
           Result = "ERROR! " + ex.getMessage();
        }
      
        return Result;
    }
}
