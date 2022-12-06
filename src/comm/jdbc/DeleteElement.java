package comm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteElement {
public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306/javabatch";
	String username="root";
	String password="root";
	String sql="INSERT INTO product VALUES (&id,&brand,&name)";
	//load the connection
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//establish the connection
		Connection connection=DriverManager.getConnection(url, username, password);
		//create statement
		Statement statement=connection.createStatement();
		//execute statement
		statement.execute(sql);
		System.out.println("done");
	
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
	

	}
	
	
}
}






///DELETE FROM product where ID=3"