import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;



public class GestionInformatikAlmi extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private Login login;
	private Componentes componentes;
	private Carrito carrito;
	private GestionClientes gestionClientes;
	private CardLayout cards;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionInformatikAlmi frame = new GestionInformatikAlmi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GestionInformatikAlmi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1101, 675);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		cards=new CardLayout(0, 0);
		contentPane.setLayout(cards);
		
		login= new Login(this);
		componentes=new Componentes(this);
		carrito=new Carrito(this);	
		gestionClientes=new GestionClientes(this);
		
		contentPane.add(login,"login"); 
		contentPane.add(componentes,"componentes");
		contentPane.add(carrito,"carrito");
		contentPane.add(gestionClientes,"cliente"); 
		cards.show(contentPane, "login");
		
		
	}
	
	//GETTERS Y SETTERS
	
	public JPanel getContentPane() {
		return contentPane;
	}

	public Login getLogin() {
		return login;
	}

	public Componentes getComponentes() {
		return componentes;
	}

	public Carrito getCarrito() {
		return carrito;
	}

	public GestionClientes getGestionClientes() {
		return gestionClientes;
	}

	public CardLayout getCards() {
		return cards;
	}
	
	public void setLogin(Login login) {
		this.login = login;
	}

	public void setComponentes(Componentes componentes) {
		this.componentes = componentes;
	}

	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
	}

	public void setGestionClientes(GestionClientes gestionClientes) {
		this.gestionClientes = gestionClientes;
	}

	public void setCards(CardLayout cards) {
		this.cards = cards;
	}

	
}
