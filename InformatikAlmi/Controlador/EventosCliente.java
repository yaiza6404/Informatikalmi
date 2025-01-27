import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventosCliente {
	private Cliente cliente;
	
	public EventosCliente(Cliente cliente) {
		this.cliente=cliente;
		
		cliente.getBtnReturnCarrito().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cliente.getGestionInformatikAlmi().getCards().show(cliente.getGestionInformatikAlmi().getContentPane(),"carrito");
			
			}
		});
		
	}
}
