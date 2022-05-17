package peliculas_principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Programa extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static JList Lista_Peliculas;
	private static DefaultListModel<Pelicula> Model_Peliculas;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Programa frame = new Programa();
					Model_Peliculas = new DefaultListModel<Pelicula>();
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
	public Programa() {
		setTitle("Programa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 390);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnPeliculas = new JMenu("Peliculas");
		menuBar.add(mnPeliculas);
		
		JMenuItem miAgregar = new JMenuItem("Agregar");
		miAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				Peliculas_Agregar Pa = new Peliculas_Agregar();
				Pa.setDefaultListModel(Model_Peliculas);
				contentPane.add(Pa);
				contentPane.repaint();
				contentPane.revalidate();				
			}
		});
		mnPeliculas.add(miAgregar);
		
		JMenuItem miListar = new JMenuItem("Listar");
		miListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				Peliculas_Listar Pl = new Peliculas_Listar();
				Pl.setDefaultListModel(Model_Peliculas);
				contentPane.add(Pl);
				contentPane.repaint();
				contentPane.revalidate();
				
				
			}
		});
		mnPeliculas.add(miListar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
