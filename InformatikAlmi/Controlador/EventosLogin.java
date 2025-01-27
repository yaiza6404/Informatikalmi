import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EventosLogin {
	private Login login;
	private BaseDatos bd;
	
	
	public EventosLogin(Login login) {
	
		this.login=login;
		
		login.getBtnEnter().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//METER EL USUARIO
				
				
				//SI EL CODIGO ES CORRECTO
				
				
				//QUE EL BOTON TE LLEVE A "COMPONENTES"
				
				login.getGestionInformatikAlmi().getCards().show(login.getGestionInformatikAlmi().getContentPane(), "componentes");
				
				
				
				/*
				bd=new BaseDatos();
				ResultSet rs;
				rs=bd.obtenerRoles();
				try {
					if(rs.first()) {
						
						do {
							System.out.println(rs.getString("nombre"));
						}while(rs.next());
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}*/	
			}
		});		
	}

}
