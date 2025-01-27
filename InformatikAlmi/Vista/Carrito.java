import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;

public class Carrito extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton btnEliminate;
	
	private GestionInformatikAlmi gestionInformatikAlmi;
	private EventosCarrito eventosCarrito;
	private JButton btnReturn;
	private JButton btnPlaceOrder;

	/**
	 * Create the panel.
	 */
	public Carrito(GestionInformatikAlmi gestionInformatikAlmi) {
		setLayout(new BorderLayout(0, 0));
		this.gestionInformatikAlmi=gestionInformatikAlmi;
		
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		add(panel, BorderLayout.SOUTH);
		
		btnReturn = new JButton("Return");
		btnReturn.setFont(new Font("Arial", Font.PLAIN, 15));
		panel.add(btnReturn);
		
		JLabel lblNewLabel_2 = new JLabel("                   ");
		panel.add(lblNewLabel_2);
		
		btnEliminate = new JButton("Eliminate");
		btnEliminate.setFont(new Font("Arial", Font.PLAIN, 15));
		panel.add(btnEliminate);
		
		JLabel lblNewLabel_3 = new JLabel("                  ");
		panel.add(lblNewLabel_3);
		
		btnPlaceOrder = new JButton("Place Order");
		btnPlaceOrder.setFont(new Font("Arial", Font.PLAIN, 15));
		panel.add(btnPlaceOrder);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JList list = new JList();
		list.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_1.add(list, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("                                          ");
		panel_1.add(lblNewLabel, BorderLayout.WEST);
		
		JLabel lblNewLabel_1 = new JLabel("                                         ");
		panel_1.add(lblNewLabel_1, BorderLayout.EAST); 
		
		JLabel lblNewL = new JLabel("Productos en cesta");
		lblNewL.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewL.setFont(new Font("Arial", Font.BOLD, 30));
		panel_1.add(lblNewL, BorderLayout.NORTH);

		eventosCarrito=new EventosCarrito(this);
		
	}

	public JButton getBtnEliminate() {
		return btnEliminate;
	}

	public void setBtnEliminate(JButton btnEliminate) {
		this.btnEliminate = btnEliminate;
	}

	public GestionInformatikAlmi getGestionInformatikAlmi() {
		return gestionInformatikAlmi;
	}

	public EventosCarrito getEventosCarrito() {
		return eventosCarrito;
	}

	public void setGestionInformatikAlmi(GestionInformatikAlmi gestionInformatikAlmi) {
		this.gestionInformatikAlmi = gestionInformatikAlmi;
	}

	public void setEventosCarrito(EventosCarrito eventosCarrito) {
		this.eventosCarrito = eventosCarrito;
	}

	public JButton getBtnReturn() {
		return btnReturn;
	}

	public JButton getBtnPlaceOrder() {
		return btnPlaceOrder;
	}

	public void setBtnReturn(JButton btnReturn) {
		this.btnReturn = btnReturn;
	}

	public void setBtnPlaceOrder(JButton btnPlaceOrder) {
		this.btnPlaceOrder = btnPlaceOrder;
	}

}
