package peliculas_principal;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JList;

public class Peliculas_Listar extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Peliculas_Listar() {
		setLayout(null);
		
		JLabel lblPeliculas = new JLabel("Peliculas");
		lblPeliculas.setBounds(36, 149, 46, 14);
		add(lblPeliculas);
		
		JList list = new JList();
		list.setBounds(99, 46, 341, 243);
		add(list);

	}
}
