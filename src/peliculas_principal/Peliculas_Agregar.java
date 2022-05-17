package peliculas_principal;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Peliculas_Agregar extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private JComboBox<Categoria> cbxGenero;
	private JButton btnAceptar;
	private DefaultListModel<Pelicula> ListModel;
	private Categoria cat;
	
	

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
		
		JLabel lblOkey = new JLabel("");
		lblOkey.setVerticalAlignment(SwingConstants.TOP);
		lblOkey.setBounds(180, 188, 234, 101);
		add(lblOkey);
				
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(!txtNombre.getText().equalsIgnoreCase("")) 
					{
						if(cbxGenero.getSelectedIndex() != 0 ) 
						{
							cat = (Categoria) cbxGenero.getSelectedItem();
							Pelicula p = new Pelicula(Id_pelicula,txtNombre.getText(),cat);
							ListModel.addElement(p);
							lblIDPelicula.setText(" ");
							txtNombre.setText(" ");
							cbxGenero.setSelectedIndex(0);
							lblOkey.setText("<html><body>Pelicula agregada con exito, ingrese nuevamente <br> o vaya a lista para ver sur peliculas </body></html>");						
							
																			
						}
						else {
							JOptionPane.showMessageDialog(null, "Todos los campos deben estar completos\n antes de agregar una pelicula"); 
						}						
					}	
					else {
						JOptionPane.showMessageDialog(null, "Todos los campos deben estar completos\n antes de agregar una pelicula"); 
					}
				}catch(Exception e1)
				{
					System.out.println("No se pudo agregar la pelicula");
				}
			}
		});
		btnAceptar.setBounds(71, 188, 89, 23);
		add(btnAceptar);
		
		
	}
	
	public void setDefaultListModel(DefaultListModel<Pelicula> listModelRecibido)
	{
		this.ListModel = listModelRecibido;
	}
}
