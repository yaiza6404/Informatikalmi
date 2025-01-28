import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.GridBagLayout;

public class GestionClientes extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtId;
	private JTextField txtNombre;
	private JTextField txtApellido1;
	private JTextField txtTelefono;
	private JTextField txtProvincia;
	private JTextField txtCiudad;
	private JTextField txtCalle;
	private JTextField txtNumero;
	private JTextField txtCodigoPostal;

	private GestionInformatikAlmi gestionInformatikAlmi;
	private EventosClientes eventosClientes;
	private JButton btnReturnCarrito;
	private JButton btnSaveNew;
	private JTextField txtApellido2;
	/**
	 * Create the panel.
	 */
	public GestionClientes(GestionInformatikAlmi gestionInformatikAlmi) {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel pnDatosPersonales = new JPanel();
		pnDatosPersonales.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Personal data", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.add(pnDatosPersonales);
		pnDatosPersonales.setLayout(new GridLayout(4, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.LEADING);
		pnDatosPersonales.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("ID:     ");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		panel_1.add(lblNewLabel);
		
		txtId = new JTextField();
		txtId.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_1.add(txtId);
		txtId.setColumns(9);
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) panel_2.getLayout();
		flowLayout_4.setAlignment(FlowLayout.LEADING);
		pnDatosPersonales.add(panel_2);
		
		JLabel lblNewLabel_2 = new JLabel("Name:");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 15));
		panel_2.add(lblNewLabel_2);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_2.add(txtNombre);
		txtNombre.setColumns(20);
		
		JPanel panel_3 = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panel_3.getLayout();
		flowLayout_3.setAlignment(FlowLayout.LEADING);
		pnDatosPersonales.add(panel_3);
		
		JLabel lblNewLabel_3 = new JLabel("Surnames:");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 15));
		panel_3.add(lblNewLabel_3);
		
		txtApellido1 = new JTextField();
		txtApellido1.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_3.add(txtApellido1);
		txtApellido1.setColumns(10);
		
		txtApellido2 = new JTextField();
		txtApellido2.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_3.add(txtApellido2);
		txtApellido2.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_4.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEADING);
		pnDatosPersonales.add(panel_4);
		
		JLabel lblNewLabel_4 = new JLabel("Phone number:");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 15));
		panel_4.add(lblNewLabel_4);
		
		txtTelefono = new JTextField();
		txtTelefono.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_4.add(txtTelefono);
		txtTelefono.setColumns(9);
		
	
	
		JPanel pnDireccion = new JPanel();
		pnDireccion.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Direction", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.add(pnDireccion);
		pnDireccion.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_8 = new JPanel();
		FlowLayout flowLayout_6 = (FlowLayout) panel_8.getLayout();
		flowLayout_6.setAlignment(FlowLayout.LEADING);
		pnDireccion.add(panel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Province:");
		lblNewLabel_9.setFont(new Font("Arial", Font.BOLD, 15));
		panel_8.add(lblNewLabel_9);
		
		txtProvincia = new JTextField();
		txtProvincia.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_8.add(txtProvincia);
		txtProvincia.setColumns(10);
		
		JPanel panel_9 = new JPanel();
		FlowLayout flowLayout_7 = (FlowLayout) panel_9.getLayout();
		flowLayout_7.setAlignment(FlowLayout.LEADING);
		pnDireccion.add(panel_9);
		
		JLabel lblNewLabel_10 = new JLabel("City:");
		lblNewLabel_10.setFont(new Font("Arial", Font.BOLD, 15));
		panel_9.add(lblNewLabel_10);
		
		txtCiudad = new JTextField();
		txtCiudad.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_9.add(txtCiudad);
		txtCiudad.setColumns(15);
		
		JPanel panel_10 = new JPanel();
		FlowLayout flowLayout_8 = (FlowLayout) panel_10.getLayout();
		flowLayout_8.setAlignment(FlowLayout.LEADING);
		pnDireccion.add(panel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Street:");
		lblNewLabel_11.setFont(new Font("Arial", Font.BOLD, 15));
		panel_10.add(lblNewLabel_11);
		
		txtCalle = new JTextField();
		txtCalle.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_10.add(txtCalle);
		txtCalle.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_5.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEADING);
		pnDireccion.add(panel_5);
		
		JLabel lblNewLabel_5 = new JLabel("ZIP Code:");
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 15));
		panel_5.add(lblNewLabel_5);
		
		txtCodigoPostal = new JTextField();
		txtCodigoPostal.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_5.add(txtCodigoPostal);
		txtCodigoPostal.setColumns(5);
		
		JPanel panel_11 = new JPanel();
		FlowLayout flowLayout_9 = (FlowLayout) panel_11.getLayout();
		flowLayout_9.setAlignment(FlowLayout.LEADING);
		pnDireccion.add(panel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Numbrer:");
		lblNewLabel_12.setFont(new Font("Arial", Font.BOLD, 15));
		panel_11.add(lblNewLabel_12);
		
		txtNumero = new JTextField();
		txtNumero.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_11.add(txtNumero);
		txtNumero.setColumns(5);
		
		JLabel lblNewLabel_1 = new JLabel("                              ");
		add(lblNewLabel_1, BorderLayout.WEST);
		
		JLabel lblNewLabel_7 = new JLabel("Customer data");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Arial", Font.BOLD, 20));
		add(lblNewLabel_7, BorderLayout.NORTH);
		
		JPanel panel_6 = new JPanel();
		add(panel_6, BorderLayout.SOUTH);
		
		btnReturnCarrito = new JButton("Return");
		btnReturnCarrito.setFont(new Font("Arial", Font.PLAIN, 15));
		panel_6.add(btnReturnCarrito);
		
		JLabel lblNewLabel_6 = new JLabel("     ");
		panel_6.add(lblNewLabel_6);
		
		btnSaveNew = new JButton("Save");
		btnSaveNew.setFont(new Font("Arial", Font.PLAIN, 15));
		panel_6.add(btnSaveNew);
		
		JLabel lblNewLabel_13 = new JLabel("                ");
		add(lblNewLabel_13, BorderLayout.EAST);
		
		eventosClientes=new EventosClientes(this);
		this.gestionInformatikAlmi=gestionInformatikAlmi;
		
	
		
	

	}
	public GestionInformatikAlmi getGestionInformatikAlmi() {
		return gestionInformatikAlmi;
	}
	public EventosClientes getEventosCliente() {
		return eventosClientes;
	}
	public JButton getBtnReturnCarrito() {
		return btnReturnCarrito;
	}
	public JButton getBtnSaveNew() {
		return btnSaveNew;
	}
	public void setGestionInformatikAlmi(GestionInformatikAlmi gestionInformatikAlmi) {
		this.gestionInformatikAlmi = gestionInformatikAlmi;
	}
	public void setEventosCliente(EventosClientes eventosCliente) {
		this.eventosClientes = eventosClientes;
	}
	public void setBtnReturnCarrito(JButton btnReturnCarrito) {
		this.btnReturnCarrito = btnReturnCarrito;
	}
	public void setBtnSaveNew(JButton btnSaveNew) {
		this.btnSaveNew = btnSaveNew;
	}
	public JTextField getTxtId() {
		return txtId;
	}
	public JTextField getTxtNombre() {
		return txtNombre;
	}
	public JTextField getTxtApellido1() {
		return txtApellido1;
	}
	public JTextField getTxtTelefono() {
		return txtTelefono;
	}
	public JTextField getTxtProvincia() {
		return txtProvincia;
	}
	public JTextField getTxtCiudad() {
		return txtCiudad;
	}
	public JTextField getTxtCalle() {
		return txtCalle;
	}
	public JTextField getTxtNumero() {
		return txtNumero;
	}
	public JTextField getTxtCodigoPostal() {
		return txtCodigoPostal;
	}
	public EventosClientes getEventosClientes() {
		return eventosClientes;
	}
	public void setTxtId(JTextField txtId) {
		this.txtId = txtId;
	}
	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}
	public void setTxtApellido1(JTextField txtApellido1) {
		this.txtApellido1 = txtApellido1;
	}
	public void setTxtTelefono(JTextField txtTelefono) {
		this.txtTelefono = txtTelefono;
	}
	public void setTxtProvincia(JTextField txtProvincia) {
		this.txtProvincia = txtProvincia;
	}
	public void setTxtCiudad(JTextField txtCiudad) {
		this.txtCiudad = txtCiudad;
	}
	public void setTxtCalle(JTextField txtCalle) {
		this.txtCalle = txtCalle;
	}
	public void setTxtNumero(JTextField txtNumero) {
		this.txtNumero = txtNumero;
	}
	public void setTxtCodigoPostal(JTextField txtCodigoPostal) {
		this.txtCodigoPostal = txtCodigoPostal;
	}
	public void setEventosClientes(EventosClientes eventosClientes) {
		this.eventosClientes = eventosClientes;
	}
	public JTextField getTxtApellido2() {
		return txtApellido2;
	}
	public void setTxtApellido2(JTextField txtApellido2) {
		this.txtApellido2 = txtApellido2;
	}

}
