import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventosCarrito {
	private Carrito carrito;
	
	public EventosCarrito(Carrito carrito) {
		this.carrito=carrito;
		
		carrito.getBtnReturn().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//VOLVER A COMPONENTES
				carrito.getGestionInformatikAlmi().getCards().show(carrito.getGestionInformatikAlmi().getContentPane(), "componentes");
				
			}
		});
		
		
		
		
		carrito.getBtnPlaceOrder().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// IR A CLIENTE
				carrito.getGestionInformatikAlmi().getCards().show(carrito.getGestionInformatikAlmi().getContentPane(), "cliente");
				
			}
		});
		
	}
}
