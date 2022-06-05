import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AddEmp {

	public static void main(String[] args) {
		
		EmpDAO dao=new EmpDAO();
		Scanner sc=new Scanner(System.in);
		int empId=Integer.parseInt(sc.nextLine());
		
		dao.addEmp(new Employee(1122, "cscs", 25000, "998877", "cscscs"));
		
	}

}
