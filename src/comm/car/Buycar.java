package comm.car;


import java.sql.*;

public class Buycar {

	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password="root";
		String sql="SELECT * FROM car";
	
		Connection connection=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection=DriverManager.getConnection(url, username, password);
			
			Statement statement=connection.createStatement();
			
			ResultSet result=statement.executeQuery(sql);
			while(result.next())
			{
				System.out.print(result.getInt(1)+" ");
				System.out.print(result.getString(2)+" ");
				System.out.print(result.getString(3)+" ");
				System.out.println();
			}
				
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			connection.close();
		}
		
	}

	}


