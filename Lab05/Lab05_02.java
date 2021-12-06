// package Lab04;

// import java.beans.Statement;
// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.util.*;

// import javax.naming.spi.DirStateFactory.Result;

// public class Lab04_02 {
//     public static void main(String[] args) throws ClassNotFoundException, SQLException {
//         Class.forName("com.mysql.cj.jdbc.Driver");
//         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/2A", "root", "");
//         Statement s = (Statement) con.createStatement();
//         Result rs = (Result) ((java.sql.Statement) s).executeQuery("select * from stu");
//         while(((ResultSet) rs).next()){
//             System.out.println(((ResultSet) rs).getInt("rollno")+ "  "+((ResultSet) rs).getString("name")));
//         }
//         con.close();
//     }
// }



import javax.sound.midi.InvalidMidiDataException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//create database internalmarks;
//use internalmarks;
//create table phone int(10),name varchar(40);
//import java.sql.*;
public class Lab04_02 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc.mysql://localhost:3306/internalmarks", "root", "root");
            Statement str = con.createStatement();
            ResultSet rs = str.executeQuery("select * from query");
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2));
            con.close();
        }
        catch(InvalidMidiDataException e)
        {
            System.out.println(e);
        }
    }
}