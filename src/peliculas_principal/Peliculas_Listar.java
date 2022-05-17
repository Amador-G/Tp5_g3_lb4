package peliculas_principal;

import javax.swing.JPanel;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;

public class Peliculas_Listar extends JPanel {

	
	private static final long serialVersionUID = 1L;
	private JList<Pelicula> jList;
	private DefaultListModel<Pelicula> ListModel;
	
	public Peliculas_Listar() {
		setLayout(null);
		
		JLabel lblPeliculas = new JLabel("Peliculas : ");
		lblPeliculas.setBounds(36, 149, 101, 14);
		add(lblPeliculas);
		
	    jList = new JList<Pelicula>();
	    jList.setBounds(147, 46, 293, 243);
		ListModel = new DefaultListModel<Pelicula>();
		jList.setModel(ListModel);
		add(jList);
		
		

	}
	
	public void setDefaultListModel(DefaultListModel<Pelicula> listModel2)
	{
		this.ListModel = listModel2;
		jList.setModel(this.ListModel);
	}
}
