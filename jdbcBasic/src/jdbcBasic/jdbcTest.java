package jdbcBasic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcTest {
	public static void main(String[] args) {
		System.out.println("JDBC Test");
		try (Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","root");
			Statement statement =conn.createStatement();
			ResultSet rs =statement.executeQuery("Select * from account ");)
		
		{
			
			//insert(C)
//			for (int i=0;i<5;i++)
//				{
//				int result = statement.executeUpdate("insert into account values(1,'Carter','John',15000)");
//			};
//			
			//update(U)
//			int result = statement.executeUpdate("update account set balance=3000 where accno=1");

			//delete(D)
//			int result = statement.executeUpdate("delete from account where accno=2");

			//read(R)
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" . "+rs.getString(2)+ " "+rs.getString(3)+" Balance"+rs.getInt(4));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//no need of closing as try is auto closable
//		finally {
//			try {
//				if (rs != null)
//					rs.close();
//				if (statement != null)
//					statement.close();
//				if (conn!= null)
//					conn.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//			
//		}
	}
}
