import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DbConnection {


	static Connection	getConnection(){
		Connection con=null;
		ResourceBundle rb = ResourceBundle.getBundle("oracle");
		String url = rb.getString("db.url");
		String username = rb.getString("db.username");
		String password = rb.getString("db.password");



		try{
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(url,username,password);


		}



		catch(ClassNotFoundException | SQLException s) {

			System.out.println(s);
		}
		return con;	

	}


}
