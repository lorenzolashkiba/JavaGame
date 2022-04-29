package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.BuildListener;

public class BuildFrame extends JFrame {

	private JPanel contentPane;
	BuildListener buildListener;
	private JButton condominio;
	private JButton cinema;
	private JButton ristorante;
	private JButton stazionePolizia;
	private JButton stazioneTreni;
	private JButton aereoporto;
	private JButton salaGiochi;
	private JButton casino;
	private JButton fabbrica;
	private JButton supermarket;
	/**
	 * Launch the application.
	 */
	/*public static void build() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuildFrame frame = new BuildFrame();
					buildListener.setListener()
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/
	public void setBuildListener(BuildListener l) {
		buildListener = l;
	}
	public void btnBuildListener(BuildListener l) {
		condominio.addActionListener(l);
		cinema.addActionListener(l);
		ristorante.addActionListener(l);
		stazionePolizia.addActionListener(l);
		stazioneTreni.addActionListener(l);
		aereoporto.addActionListener(l);
		salaGiochi.addActionListener(l);
		casino.addActionListener(l);
		fabbrica.addActionListener(l);
		supermarket.addActionListener(l);
		
	}
	/**
	 * Create the frame.
	 */
	public BuildFrame() {
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		condominio = new JButton("Condominio");
		condominio.setFont(new Font("Tahoma", Font.PLAIN, 17));
		condominio.setBounds(10, 10, 121, 29);
		getContentPane().add(condominio);
		
		cinema = new JButton("Cinema");
		cinema.setFont(new Font("Tahoma", Font.PLAIN, 17));
		cinema.setBounds(141, 10, 121, 29);
		getContentPane().add(cinema);
		
		ristorante = new JButton("Restaurant");
		ristorante.setFont(new Font("Tahoma", Font.PLAIN, 17));
		ristorante.setBounds(272, 10, 121, 29);
		getContentPane().add(ristorante);
		
		stazionePolizia = new JButton("Police station");
		stazionePolizia.setFont(new Font("Tahoma", Font.PLAIN, 17));
		stazionePolizia.setBounds(10, 49, 176, 29);
		getContentPane().add(stazionePolizia);
		
		stazioneTreni = new JButton("Train station");
		stazioneTreni.setFont(new Font("Tahoma", Font.PLAIN, 17));
		stazioneTreni.setBounds(196, 49, 176, 29);
		getContentPane().add(stazioneTreni);
		
		aereoporto = new JButton("Aereoporto");
		aereoporto.setFont(new Font("Tahoma", Font.PLAIN, 17));
		aereoporto.setBounds(10, 87, 115, 29);
		getContentPane().add(aereoporto);
		
		salaGiochi = new JButton("Sala giochi");
		salaGiochi.setFont(new Font("Tahoma", Font.PLAIN, 17));
		salaGiochi.setBounds(141, 87, 115, 29);
		getContentPane().add(salaGiochi);
		
		casino = new JButton("Casino");
		casino.setFont(new Font("Tahoma", Font.PLAIN, 17));
		casino.setBounds(269, 87, 85, 29);
		getContentPane().add(casino);
		
		fabbrica = new JButton("Fabbrica");
		fabbrica.setFont(new Font("Tahoma", Font.PLAIN, 17));
		fabbrica.setBounds(10, 124, 102, 29);
		getContentPane().add(fabbrica);
		
		supermarket = new JButton("Supermarket");
		supermarket.setFont(new Font("Tahoma", Font.PLAIN, 17));
		supermarket.setBounds(122, 124, 140, 29);
		getContentPane().add(supermarket);
		
	}
	public JButton getCinema() {
		return cinema;
	}
	public JPanel getContentPane() {
		return contentPane;
	}
	public JButton getStazioneTreni() {
		return stazioneTreni;
	}
	public JButton getAereoporto() {
		return aereoporto;
	}
	public JButton getSalaGiochi() {
		return salaGiochi;
	}
	public JButton getCasino() {
		return casino;
	}
	public JButton getFabbrica() {
		return fabbrica;
	}
	public JButton getSupermarket() {
		return supermarket;
	}
	public JButton getRistorante() {
		return ristorante;
	}
	public JButton getStazionePolizia() {
		return stazionePolizia;
	}
	public JButton getCondominio() {
		return condominio;
	}
	

}