import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JList;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Componentes extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private GestionInformatikAlmi gestionInformatikAlmi;
	private EventosComponentes eventosComponentes;
	private JButton btnAdd;
	private JButton btnBuy;

	/**
	 * Create the panel.
	 */
	public Componentes(GestionInformatikAlmi gestionInformatikAlmi) {
		setLayout(new BorderLayout(0, 0));
		this.gestionInformatikAlmi=gestionInformatikAlmi;
		
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("            ");
		panel.add(lblNewLabel, BorderLayout.WEST);
		
		JLabel lblNewLabel_1 = new JLabel("           ");
		panel.add(lblNewLabel_1, BorderLayout.EAST);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JList list = new JList();
		panel_1.add(list);
		
		JLabel lblNewLabel_2 = new JLabel("            ");
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_3.getLayout();
		flowLayout.setAlignment(FlowLayout.LEADING);
		add(panel_3, BorderLayout.NORTH);
		
		JComboBox cbTipo = new JComboBox();
		cbTipo.setFont(new Font("Arial", Font.PLAIN, 12));
		cbTipo.setForeground(new Color(255, 255, 255));
		panel_3.add(cbTipo);
		
		JPanel panel_4 = new JPanel();
		add(panel_4, BorderLayout.SOUTH);
		
		btnAdd = new JButton("Add");
		btnAdd.setFont(new Font("Arial", Font.PLAIN, 15));
		btnAdd.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_4.add(btnAdd);
		
		btnBuy = new JButton("Buy");
		btnBuy.setFont(new Font("Arial", Font.PLAIN, 15));
		panel_4.add(btnBuy);
		
		eventosComponentes=new EventosComponentes(this);

	}
	
	public JButton getBtnAdd() {
		return btnAdd;
	}

	public JButton getBtnBuy() {
		return btnBuy;
	}

	public void setBtnAdd(JButton btnAdd) {
		this.btnAdd = btnAdd;
	}

	public void setBtnBuy(JButton btnBuy) {
		this.btnBuy = btnBuy;
	}

	public GestionInformatikAlmi getGestionInformatikAlmi() {
		return gestionInformatikAlmi;
	}

	public EventosComponentes getEventosComponentes() {
		return eventosComponentes;
	}

	public void setGestionInformatikAlmi(GestionInformatikAlmi gestionInformatikAlmi) {
		this.gestionInformatikAlmi = gestionInformatikAlmi;
	}

	public void setEventosComponentes(EventosComponentes eventosComponentes) {
		this.eventosComponentes = eventosComponentes;
	}

}
