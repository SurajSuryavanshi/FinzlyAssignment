package JDBC;
import java.sql.*;

public class SqlOperation{
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection conn= DriverManager.getConnection( "jdbc:mysql://localhost:3306/ABC","root","root");

        //Create Operation
        Statement createStatement= conn.createStatement();
        String createQuery="Insert into employee(empID,empName,empSalary) VALUES (2,'Akash',120000)";
        int rowAffected=createStatement.executeUpdate(createQuery);

        if(rowAffected>0){
            System.out.println("Record inserted successfully");
        }else{
            System.out.println("Record insertion failed");
        }

        //read data

        Statement readStatement= conn.createStatement();
        ResultSet rs=readStatement.executeQuery("Select * from employee");
        while(rs.next()){
            System.out.println(rs.getInt("empID")+" "+rs.getString("empName")+" "+rs.getString("empSalary"));
        }

        //update data
        Statement updateStatement=conn.createStatement();
        String updateQuery="UPDATE emp SET empSalary=30000 WHERE empID=2";
        rowAffected=updateStatement.executeUpdate(updateQuery);
        if(rowAffected>0){
            System.out.println("Record inserted successfully");
        }else{
            System.out.println("Record insertion failed");
        }
        while(rs.next()){
            System.out.println(rs.getInt("empID")+" "+rs.getString("empName")+" "+rs.getString("empSalary"));
        }

        //Delete
        Statement deleteStatement=conn.createStatement();
        String deleteQuery="DELETE FROM emp where empID=2";
        rowAffected=deleteStatement.executeUpdate(deleteQuery);
        if(rowAffected>0){
            System.out.println("Record deleted  successfully");
        }else{
            System.out.println("Record deletion failed");
        }



    }
}