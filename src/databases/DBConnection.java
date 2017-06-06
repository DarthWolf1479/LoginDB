package databases;

import java.sql.*;

public class DBConnection {
	public static void main(String args[]){
		System.out.println("Hoooo");
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			System.out.println("Registro completo");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}

		Connection con = null;
		PreparedStatement consulta;
		ResultSet resultado;
		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "amarok149");

			// Otros y operaciones sobre la base de datos...
			consulta = con.prepareStatement("SELECT * FROM user");
			resultado = consulta.executeQuery();
			while (resultado.next()) {
				System.out.println(resultado.getInt(1) + " " + resultado.getString(2) + " " + resultado.getString(3));
			}

			// con.close();

		} catch (SQLException ex) {

			// Mantener el control sobre el tipo de error
			System.out.println("SQLException: " + ex.getMessage());

		}
	}
}
