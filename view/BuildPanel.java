package view;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;

import controller.Controller;

public class BuildPanel extends JPanel
{
	private JButton btnAddHouse;
	private JButton btnAddCinema;
	private JButton btnAddRestaurant;
	private JButton btnAddPolice;
	private JButton btnAddTrain;
	private JButton btnAddAirport;
	private JButton btnAddArcade;
	private JButton btnAddCasino;
	private JButton btnAddFactory;
	private JButton btnAddSupermarket;
	
	public BuildPanel()
	{
		setLayout(null);
		
		btnAddHouse = new JButton("House");
		btnAddHouse.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAddHouse.setBounds(10, 10, 121, 29);
		add(btnAddHouse);
		
		btnAddCinema = new JButton("Cinema");
		btnAddCinema.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAddCinema.setBounds(141, 10, 121, 29);
		add(btnAddCinema);
		
		btnAddRestaurant = new JButton("Restaurant");
		btnAddRestaurant.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAddRestaurant.setBounds(272, 10, 121, 29);
		add(btnAddRestaurant);
		
		btnAddPolice = new JButton("Police station");
		btnAddPolice.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAddPolice.setBounds(10, 49, 176, 29);
		add(btnAddPolice);
		
		btnAddTrain = new JButton("Train station");
		btnAddTrain.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAddTrain.setBounds(196, 49, 176, 29);
		add(btnAddTrain);
		
		btnAddAirport = new JButton("Airport");
		btnAddAirport.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAddAirport.setBounds(10, 87, 115, 29);
		add(btnAddAirport);
		
		btnAddArcade = new JButton("Arcade");
		btnAddArcade.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAddArcade.setBounds(141, 87, 115, 29);
		add(btnAddArcade);
		
		btnAddCasino = new JButton("Casino");
		btnAddCasino.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAddCasino.setBounds(269, 87, 85, 29);
		add(btnAddCasino);
		
		btnAddFactory = new JButton("Factory");
		btnAddFactory.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAddFactory.setBounds(10, 124, 102, 29);
		add(btnAddFactory);
		
		btnAddSupermarket = new JButton("Supermarket");
		btnAddSupermarket.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAddSupermarket.setBounds(122, 124, 140, 29);
		add(btnAddSupermarket);
		this.setVisible(false);
	}
	
	public void btnAddListener(Controller c)
	{
		btnAddAirport.addActionListener(c);
		btnAddArcade.addActionListener(c);
		btnAddCasino.addActionListener(c);
		btnAddCinema.addActionListener(c);
		btnAddFactory.addActionListener(c);
		btnAddHouse.addActionListener(c);
		btnAddPolice.addActionListener(c);
		btnAddRestaurant.addActionListener(c);
		btnAddSupermarket.addActionListener(c);
		btnAddTrain.addActionListener(c);
	}
	
	public JButton getBtnAddHouse()
	{
		return btnAddHouse;
	}
	public JButton getBtnAddCinema()
	{
		return btnAddCinema;
	}
	public JButton getBtnAddRestaurant()
	{
		return btnAddRestaurant;
	}
	public JButton getBtnAddPolice()
	{
		return btnAddPolice;
	}
	public JButton getBtnAddTrain()
	{
		return btnAddTrain;
	}
	public JButton getBtnAddAirport()
	{
		return btnAddAirport;
	}
	public JButton getBtnAddArcade()
	{
		return btnAddArcade;
	}
	public JButton getBtnAddCasino()
	{
		return btnAddCasino;
	}
	public JButton getBtnAddFactory()
	{
		return btnAddFactory;
	}
	public JButton getBtnAddSupermarket()
	{
		return btnAddSupermarket;
	}
}