package peliculas_principal;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Peliculas_Agregar extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private JComboBox<Categoria> cbxGenero;
	private JButton btnAceptar;

	/**
	 * Create the panel.
	 */
	public Peliculas_Agregar() {
		setLayout(null);
		int Id_pelicula;
		Id_pelicula = Pelicula.ID_autonumerico();
		
		JLabel lblID = new JLabel("ID :");
		lblID.setBounds(74, 29, 70, 14);
		add(lblID);
		
		
		JLabel lblIDPelicula = new JLabel("");
		lblIDPelicula.setBounds(180, 29, 46, 14);
		add(lblIDPelicula);
		lblIDPelicula.setText(Integer.toString(Id_pelicula));
		
		JLabel lblNombre = new JLabel("Nombre :");
		lblNombre.setBounds(74, 86, 86, 14);
		add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(180, 83, 171, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblGenero = new JLabel("Genero :");
		lblGenero.setBounds(74, 136, 96, 14);
		add(lblGenero);
		
	    cbxGenero = new JComboBox<Categoria>();
		cbxGenero.setBounds(180, 132, 171, 22);
		add(cbxGenero);		
		cbxGenero.addItem(new Categoria(0,"--Seleccionar--"));
		cbxGenero.addItem(new Categoria(1,"Terror"));
		cbxGenero.addItem(new Categoria(2,"Accion"));
		cbxGenero.addItem(new Categoria(3,"Suspenso"));
		cbxGenero.addItem(new Categoria(4,"Rommantica"));
		cbxGenero.setSelectedIndex(0);
		
		
		
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(71, 188, 89, 23);
		add(btnAceptar);

	}
}
