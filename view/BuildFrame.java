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

	BuildListener buildListener;
	private JPanel contentPane;
	private JButton house;
	private JButton cinema;
	private JButton restaurant;
	private JButton policeStation;
	private JButton trainStation;
	private JButton airport;
	private JButton arcade;
	private JButton casino;
	private JButton factory;
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
		house.addActionListener(l);
		cinema.addActionListener(l);
		restaurant.addActionListener(l);
		policeStation.addActionListener(l);
		trainStation.addActionListener(l);
		airport.addActionListener(l);
		arcade.addActionListener(l);
		casino.addActionListener(l);
		factory.addActionListener(l);
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
		house = new JButton("House");
		house.setFont(new Font("Tahoma", Font.PLAIN, 17));
		house.setBounds(10, 10, 121, 29);
		getContentPane().add(house);
		
		cinema = new JButton("Cinema");
		cinema.setFont(new Font("Tahoma", Font.PLAIN, 17));
		cinema.setBounds(141, 10, 121, 29);
		getContentPane().add(cinema);
		
		restaurant = new JButton("Restaurant");
		restaurant.setFont(new Font("Tahoma", Font.PLAIN, 17));
		restaurant.setBounds(272, 10, 121, 29);
		getContentPane().add(restaurant);
		
		policeStation = new JButton("Police station");
		policeStation.setFont(new Font("Tahoma", Font.PLAIN, 17));
		policeStation.setBounds(10, 49, 176, 29);
		getContentPane().add(policeStation);
		
		trainStation = new JButton("Train station");
		trainStation.setFont(new Font("Tahoma", Font.PLAIN, 17));
		trainStation.setBounds(196, 49, 176, 29);
		getContentPane().add(trainStation);
		
		airport = new JButton("Airport");
		airport.setFont(new Font("Tahoma", Font.PLAIN, 17));
		airport.setBounds(10, 87, 115, 29);
		getContentPane().add(airport);
		
		arcade = new JButton("Arcade");
		arcade.setFont(new Font("Tahoma", Font.PLAIN, 17));
		arcade.setBounds(141, 87, 115, 29);
		getContentPane().add(arcade);
		
		casino = new JButton("Casino");
		casino.setFont(new Font("Tahoma", Font.PLAIN, 17));
		casino.setBounds(269, 87, 85, 29);
		getContentPane().add(casino);
		
		factory = new JButton("Factory");
		factory.setFont(new Font("Tahoma", Font.PLAIN, 17));
		factory.setBounds(10, 124, 102, 29);
		getContentPane().add(factory);
		
		supermarket = new JButton("Supermarket");
		supermarket.setFont(new Font("Tahoma", Font.PLAIN, 17));
		supermarket.setBounds(131, 124, 155, 29);
		getContentPane().add(supermarket);
	}
	
	public JPanel getContentPane() {
		return contentPane;
	}
	public JButton getHouse() {
		return house;
	}
	public JButton getCinema() {
		return cinema;
	}
	public JButton getRestaurant() {
		return restaurant;
	}
	public JButton getPoliceStation() {
		return policeStation;
	}
	public JButton getTrainStation() {
		return trainStation;
	}
	public JButton getAirport() {
		return airport;
	}
	public JButton getArcade() {
		return arcade;
	}
	public JButton getCasino() {
		return casino;
	}
	public JButton getFactory() {
		return factory;
	}
	public JButton getSupermarket() {
		return supermarket;
	}
}