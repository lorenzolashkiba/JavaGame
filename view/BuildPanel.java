package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class BuildPanel extends JPanel {

	private JPanel contentPane;
	private JButton btnAddHouse;
	private JButton btnAddCinema;
	private JButton btnAddRestaurant;
	private JButton btnAddPoliceStation;
	private JButton btnAddTrainStation;
	private JButton btnAddAirport;
	private JButton btnAddArcade;
	private JButton btnAddCasino;
	private JButton btnAddFactory;
	private JButton btnAddSupermarket;

	/**
	 * Launch the application.
	 */
	public static void build()
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					BuildPanel frame = new BuildPanel();
					frame.setVisible(true);
//					setContentPane(this);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		);
	}

	/**
	 * Create the frame.
	 */
	public BuildPanel()
	{
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
//		setContentPane(this);
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
		
		btnAddPoliceStation = new JButton("Police station");
		btnAddPoliceStation.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAddPoliceStation.setBounds(10, 49, 176, 29);
		add(btnAddPoliceStation);
		
		btnAddTrainStation = new JButton("Train station");
		btnAddTrainStation.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAddTrainStation.setBounds(196, 49, 176, 29);
		add(btnAddTrainStation);
		
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
	}
}