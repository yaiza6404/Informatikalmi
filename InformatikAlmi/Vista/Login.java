import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Login extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JButton btnEnter;
	private GestionInformatikAlmi gestionInformatikAlmi;
	private EventosLogin eventosLogin;
	/**
	 * Create the panel.
	 */
	public Login(GestionInformatikAlmi gestionInformatikAlmi) {
		setLayout(new BorderLayout(0, 0));
		this.gestionInformatikAlmi=gestionInformatikAlmi;
		
		
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(6, 0, 0, 0));
		
		JLabel lblNewLabel = new JLabel("");
				panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("enter your employee code");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(null);
		panel.add(panel_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_2.add(textField);
		textField.setColumns(20);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.SOUTH);
		
		btnEnter = new JButton("Enter");
		btnEnter.setFont(new Font("Arial", Font.PLAIN, 15));
		panel_1.add(btnEnter);
		
		JPanel pnImagen = new JPanel();
		add(pnImagen, BorderLayout.NORTH);
		pnImagen.setLayout(new BoxLayout(pnImagen, BoxLayout.X_AXIS));

		eventosLogin=new EventosLogin(this);
		
		
	}
	//GETTERS Y SETTERS
	public JTextField getTextField() {
		return textField;
	}

	public JButton getBtnEnter() {
		return btnEnter;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public void setBtnEnter(JButton btnEnter) {
		this.btnEnter = btnEnter;
	}
	public JComponent getBtnLogin() {
		// TODO Auto-generated method stub
		return null;
	}
	public GestionInformatikAlmi getGestionInformatikAlmi() {
		return gestionInformatikAlmi;
	}
	public void setGestionInformatikAlmi(GestionInformatikAlmi gestionInformatikAlmi) {
		this.gestionInformatikAlmi = gestionInformatikAlmi;
	}
	public EventosLogin getEventosLogin() {
		return eventosLogin;
	}
	public void setEventosLogin(EventosLogin eventosLogin) {
		this.eventosLogin = eventosLogin;
	}
	
	

}
