package com.sqlite;

import java.sql.*;
import java.util.Scanner;

public class Database {
//    public static void main(String[] args) throws Exception {
//
//        Class.forName("org.sqlite.JDBC");
//        Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
//        PreparedStatement stm = con.prepareStatement("select * from students where deptno=? " );
//        Scanner sc =  new Scanner(System.in);
//        ResultSet rs = stm.executeQuery();
//        System.out.println("Enter Department Number ");
//        int dno = sc.nextInt();
//        stm.setInt(1 , dno);
//
//        while (rs.next()){
//            System.out.print(rs.getInt("roll" ) + " ");
//            System.out.print(rs.getString("name") + " ");
//            System.out.print(rs.getString("city") + " ");
//            System.out.println(rs.getInt(4)+ " ");  //column no
//        }
//        stm.close();
//        con.close();
//    }


    public static void main(String[] args) throws Exception {
//DML
//Insert
//Insert  Using Prepared Statement
//Delete
//Update
//Create
//Drop
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
        Statement stm = con.createStatement();

//        stm.executeUpdate("insert into dept values(60,'Chem')");
//        stm.executeUpdate("delete from dept where deptno >=60 ");
//        stm.executeUpdate("update  dept set dname='Aero' where  deptno = 50" );
        stm.executeUpdate("drop  table Temp"); //deleting table


        stm.close();
        con.close();
    }
}
