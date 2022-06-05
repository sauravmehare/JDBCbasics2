import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpDAO {





	Connection connection;
	PreparedStatement ps;
	int res;
	public int addEmp(Employee employee) {

		connection=DbConnection.getConnection();

		try {	 
			
		ps=connection.prepareStatement("insert into emp values(?,?,?,?,?)");


		ps.setInt(1, employee.getEmpId());
		ps.setString(2,employee.getEmpName());
		ps.setFloat(3, employee.getEmpSal());
		ps.setString(4,employee.getMobile());
		ps.setString(5, employee.getPassword());

		res=ps.executeUpdate();

		if(res>0) {


			System.out.println("emp inserted");
		}

		}
		catch(SQLException s) {


			System.out.println(s);
		}


		return res;
	}

}
