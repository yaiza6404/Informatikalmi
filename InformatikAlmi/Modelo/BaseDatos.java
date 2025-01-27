import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDatos {
	private Connection cn; 
	private String cadenaConex, usuario,contrasena;


	//CONSTRUCTOR/ES
	public BaseDatos() {
		cadenaConex="jdbc:oracle:thin:@192.168.0.227:1521:ORCLCDB";
		usuario="informatikalmi";
		contrasena="almi123";
		try {
			cn=DriverManager.getConnection(cadenaConex, usuario,contrasena);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public ResultSet obtenerRoles() {
		ResultSet rs=null;
		String consulta;

		PreparedStatement stmt;

		consulta="SELECT * FROM roles";

		//PREPARAR SENTENCIA
		try {
			stmt=cn.prepareStatement(consulta, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			//LANZAR SENTENCIA
			rs=stmt.executeQuery();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
}

//FUNCIONES
//CERRAR LA CONEXION
public void cerrarConexion() {
	try {
		cn.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

//INSERTAR CLIENTE
public int InsertarCliente(String id,String nombre,String apellido1,String apellido2,String telefono,String provincia,String ciudad,String calle,String numero,String cp) {
	String consulta;
	PreparedStatement stmt;

	//CREAR LA SENTENCIA
	consulta="INSERT INTO Clientes VALUES (?,?,?,?,?,?,?,?,?)";
	try {
		stmt=cn.prepareStatement(consulta);
		stmt.setString(1, id);
		stmt.setString(2, nombre);
		stmt.setString(3, apellido1);
		stmt.setString(4, apellido2);
		stmt.setString(5, telefono);
		stmt.setString(6, provincia);
		stmt.setString(7, ciudad);
		stmt.setString(8, calle);
		stmt.setString(9, numero);
		stmt.setString(10, cp);

		return stmt.executeUpdate();

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return 0;
}

                





public Connection getCn() {
	return cn;
}


public String getUsuario() {
	return usuario;
}


public String getContrasena() {
	return contrasena;
}


public void setCn(Connection cn) {
	this.cn = cn;
}


public void setUsuario(String usuario) {
	this.usuario = usuario;
}


public void setContrasena(String contrasena) {
	this.contrasena = contrasena;
}
}


