package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.BuildListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setContentPane(contentPane);
		contentPane.setLayout(null);
		condominio = new JButton("Condominio 3000$");
		
		condominio.setFont(new Font("Tahoma", Font.PLAIN, 17));
		condominio.setBounds(29, 10, 168, 39);
		getContentPane().add(condominio);
		
		cinema = new JButton("Cinema 3000$");
		cinema.setFont(new Font("Tahoma", Font.PLAIN, 17));
		cinema.setBounds(273, 10, 139, 39);
		getContentPane().add(cinema);
		
		ristorante = new JButton("Restaurant 1500$");
		ristorante.setFont(new Font("Tahoma", Font.PLAIN, 17));
		ristorante.setBounds(29, 54, 152, 39);
		getContentPane().add(ristorante);
		
		stazionePolizia = new JButton("Police station 2000$");
		stazionePolizia.setFont(new Font("Tahoma", Font.PLAIN, 17));
		stazionePolizia.setBounds(29, 94, 187, 39);
		getContentPane().add(stazionePolizia);
		
		stazioneTreni = new JButton("Train station 7000$");
		stazioneTreni.setFont(new Font("Tahoma", Font.PLAIN, 17));
		stazioneTreni.setBounds(225, 54, 187, 39);
		getContentPane().add(stazioneTreni);
		
		aereoporto = new JButton("Aereoporto 10000$");
		aereoporto.setFont(new Font("Tahoma", Font.PLAIN, 17));
		aereoporto.setBounds(228, 94, 184, 39);
		getContentPane().add(aereoporto);
		
		salaGiochi = new JButton("Sala giochi 2500$");
		salaGiochi.setFont(new Font("Tahoma", Font.PLAIN, 17));
		salaGiochi.setBounds(29, 134, 165, 39);
		getContentPane().add(salaGiochi);
		
		casino = new JButton("Casino 2000$");
		casino.setFont(new Font("Tahoma", Font.PLAIN, 17));
		casino.setBounds(273, 134, 139, 39);
		getContentPane().add(casino);
		
		fabbrica = new JButton("Fabbrica 5000$");
		fabbrica.setFont(new Font("Tahoma", Font.PLAIN, 17));
		fabbrica.setBounds(29, 180, 152, 39);
		getContentPane().add(fabbrica);
		
		supermarket = new JButton("Supermarket 3500$");
		supermarket.setFont(new Font("Tahoma", Font.PLAIN, 17));
		supermarket.setBounds(225, 181, 187, 37);
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