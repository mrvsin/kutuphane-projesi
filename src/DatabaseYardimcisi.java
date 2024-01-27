import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseYardimcisi {
	public Connection getConnection()
	{
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kutuphane-db?user=root&password=root");
			System.out.println("Baglanti basarili :)");
		}
		catch(SQLException e){
			System.out.println("Baglanti hatali :(");
			e.printStackTrace();
		}
		
		return connection;
	}
}
