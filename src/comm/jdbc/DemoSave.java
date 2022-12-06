package comm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoSave {
public static void main(String[] args) throws SQLException {
	String url="jdbc:mysql://localhost:3306/javabatch";
	String username="root";
	String password="root";
	
	String sql="INSERT INTO product VALUES (&id,&brand,&name)";
	
	
	Connection connection=null;
	try {
		//load register
		Class.forName("com.mysql.cj.jdbc.Driver");
		//To establiched a connection
		connection=DriverManager.getConnection(url, username, password);
		//Creaye statement;
		Statement statement=connection.createStatement();
		//execute statement
		statement.execute(sql);
		//statement.execute(sql1);
		System.out.println("done");
	} 
	catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
	
		connection.close();
	}
}
}
