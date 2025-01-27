import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventosComponentes {
	private Componentes componentes;
	
	public EventosComponentes(Componentes componentes) {
		this.componentes=componentes;
		
		componentes.getBtnBuy().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// IR AL CARRITO
				   componentes.getGestionInformatikAlmi().getCards().show(componentes.getGestionInformatikAlmi().getContentPane(), "carrito");
				
			}
		});
		
	}
}
