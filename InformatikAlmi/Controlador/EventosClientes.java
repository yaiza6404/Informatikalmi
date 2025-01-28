import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventosClientes {
	private GestionClientes gestionClientes;
	private BaseDatos bd;

	public EventosClientes(GestionClientes gestionClientes) {
		this.gestionClientes = gestionClientes;

		gestionClientes.getBtnReturnCarrito().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				gestionClientes.getGestionInformatikAlmi().getCards().show(gestionClientes.getGestionInformatikAlmi().getContentPane(),"carrito");

			}
		});

		//GUARDAR CLIENTE NUEVO
		gestionClientes.getBtnSaveNew().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				bd=new BaseDatos();
				//String id,String nombre,String apellido1,String apellido2,String telefono,
				// provincia,String ciudad,String calle,String numero,String cp	
				bd.InsertarCliente(gestionClientes.getTxtId().getText(), gestionClientes.getTxtNombre().getText(), 
						gestionClientes.getTxtApellido1().getText(),gestionClientes.getTxtApellido2().getText(), 
						gestionClientes.getTxtTelefono().getText(),gestionClientes.getTxtProvincia().getText(), 
						gestionClientes.getTxtCiudad().getText(),gestionClientes.getTxtCalle().getText() , 
						gestionClientes.getTxtNumero().getText(),gestionClientes.getTxtCodigoPostal().getText());
			
		
				gestionClientes.getGestionInformatikAlmi().getCards().show(gestionClientes.getGestionInformatikAlmi().getContentPane(),"componentes");
				vaciarCampos();
						
					
			}
		}); 

	}

	public void vaciarCampos() {
		gestionClientes.getTxtId().setText("");
		gestionClientes.getTxtNombre().setText("");
		gestionClientes.getTxtApellido1().setText("");
		gestionClientes.getTxtApellido2().setText("");
		gestionClientes.getTxtTelefono().setText("");
		gestionClientes.getTxtCiudad().setText("");
		gestionClientes.getTxtCalle().setText("");
		gestionClientes.getTxtProvincia().setText("");
		gestionClientes.getTxtCodigoPostal().setText("");
		gestionClientes.getTxtNumero().setText("");
	
	}

}
