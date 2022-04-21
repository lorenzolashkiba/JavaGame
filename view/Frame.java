package view;

import controller.Controller;

import java.awt.Font;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

public class Frame extends JFrame implements WindowListener
{
	private static Panel panel;
	
	private static String keyHouse="House";
	private static String keyCinema="Cinema";
	private static String keyRestaurant="Restaurant";
	private static String keyPoliceStation="PoliceStation";
	private static String keyTrainStation="TrainStation";
	private static String keyAirport="Airport";
	private static String keyArcade="Arcade";
	private static String keyCasino="Casino";
	private static String keyFactory="Factory";
	private static String keySupermarket="Supermarket";
	private static JLabel[] lbls;
	private static JLabel[] nLbls;
	private static HashMap<String, JLabel> mapLbls;
	private static HashMap<String, JLabel> mapNLbls;
	private JLabel lblTest;
	
	public Frame()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel=new Panel();
		this.setContentPane(panel);
		
		setLbls();
		
		this.setResizable(false);
		this.setBounds(20, 20, 1200, 660);
		this.setVisible(true);
//		this.addWindowListener(this);
		this.setTitle("Sim City replica");
	}
	
	private static void setLbls()
	{
		lbls=new JLabel[10];
		nLbls=new JLabel[10];
		
		lbls[0]=new JLabel("House");
		lbls[0].setBounds(400, 20, 137, 106);
		lbls[0].setIcon(new ImageIcon(Frame.class.getResource("/imgs/house.png")));
		lbls[0].setVisible(true);
		
		nLbls[0]=new JLabel("Houses in the city: 250");
		nLbls[0].setBounds(550, 40, 170, 50);
		nLbls[0].setFont(new Font("Tahoma", Font.PLAIN, 17));
		nLbls[0].setVisible(true);
		panel.add(lbls[0]);
		panel.add(nLbls[0]);
		
		lbls[1]=new JLabel("Cinema");
		lbls[1].setBounds(400, 150, 150, 59);
		lbls[1].setIcon(new ImageIcon(Frame.class.getResource("/imgs/cinema.png")));
		lbls[1].setVisible(true);
		
		nLbls[1]=new JLabel("Cinemas in the city: 3");
		nLbls[1].setBounds(560, 157, 170, 50);
		nLbls[1].setFont(new Font("Tahoma", Font.PLAIN, 17));
		nLbls[1].setVisible(true);
		panel.add(lbls[1]);
		panel.add(nLbls[1]);
		
		lbls[2]=new JLabel("Restaurant");
		lbls[2].setBounds(400, 235, 191, 67);
		lbls[2].setIcon(new ImageIcon(Frame.class.getResource("/imgs/restaurant.png")));
		lbls[2].setVisible(true);
		
		nLbls[2]=new JLabel("Restaurants in the city: 6");
		nLbls[2].setBounds(600, 240, 190, 50);
		nLbls[2].setFont(new Font("Tahoma", Font.PLAIN, 17));
		nLbls[2].setVisible(true);
		panel.add(lbls[2]);
		panel.add(nLbls[2]);
		
		lbls[3]=new JLabel("PoliceStation");
		lbls[3].setBounds(400, 325, 143, 86);
		lbls[3].setIcon(new ImageIcon(Frame.class.getResource("/imgs/police_station.png")));
		lbls[3].setVisible(true);
		
		nLbls[3]=new JLabel("Police stations in the city: 6");
		nLbls[3].setBounds(555, 340, 220, 50);
		nLbls[3].setFont(new Font("Tahoma", Font.PLAIN, 17));
		nLbls[3].setVisible(true);
		panel.add(lbls[3]);
		panel.add(nLbls[3]);
		
		lbls[4]=new JLabel("TrainStation");
		lbls[4].setBounds(400, 434, 140, 70);
		lbls[4].setIcon(new ImageIcon(Frame.class.getResource("/imgs/train_station.png")));
		lbls[4].setVisible(true);
		
		nLbls[4]=new JLabel("Train stations in the city: 6");
		nLbls[4].setBounds(555, 440, 220, 50);
		nLbls[4].setFont(new Font("Tahoma", Font.PLAIN, 17));
		nLbls[4].setVisible(true);
		panel.add(lbls[4]);
		panel.add(nLbls[4]);
		
		////////////////////////////////////////////////////////////////////////////////////////////////////
		lbls[5]=new JLabel("Airport");
		lbls[5].setBounds(800, 20, 130, 85);
		lbls[5].setIcon(new ImageIcon(Frame.class.getResource("/imgs/airport.png")));
		lbls[5].setVisible(true);
		
		nLbls[5]=new JLabel("Airports in the city: 6");
		nLbls[5].setBounds(940, 32, 160, 50);
		nLbls[5].setFont(new Font("Tahoma", Font.PLAIN, 17));
		nLbls[5].setVisible(true);
		panel.add(lbls[5]);
		panel.add(nLbls[5]);
		
		lbls[6]=new JLabel("Arcade");
		lbls[6].setBounds(800, 135, 130, 87);
		lbls[6].setIcon(new ImageIcon(Frame.class.getResource("/imgs/arcade.png")));
		lbls[6].setVisible(true);
		
		nLbls[6]=new JLabel("Arcades in the city: 6");
		nLbls[6].setBounds(940, 150, 160, 50);
		nLbls[6].setFont(new Font("Tahoma", Font.PLAIN, 17));
		nLbls[6].setVisible(true);
		panel.add(lbls[6]);
		panel.add(nLbls[6]);
		
		lbls[7]=new JLabel("Casino");
		lbls[7].setBounds(800, 245, 135, 90);
		lbls[7].setIcon(new ImageIcon(Frame.class.getResource("/imgs/casino.png")));
		lbls[7].setVisible(true);
		
		nLbls[7]=new JLabel("Casinos in the city: 6");
		nLbls[7].setBounds(945, 265, 160, 50);
		nLbls[7].setFont(new Font("Tahoma", Font.PLAIN, 17));
		nLbls[7].setVisible(true);
		panel.add(lbls[7]);
		panel.add(nLbls[7]);
		
		lbls[8]=new JLabel("Factory");
		lbls[8].setBounds(800, 355, 140, 88);
		lbls[8].setIcon(new ImageIcon(Frame.class.getResource("/imgs/factory.png")));
		lbls[8].setVisible(true);
		
		nLbls[8]=new JLabel("Factorys in the city: 6");
		nLbls[8].setBounds(945, 370, 180, 50);
		nLbls[8].setFont(new Font("Tahoma", Font.PLAIN, 17));
		nLbls[8].setVisible(true);
		panel.add(lbls[8]);
		panel.add(nLbls[8]);
		
		lbls[9]=new JLabel("Supermarket");
		lbls[9].setBounds(800, 465, 149, 100);
		lbls[9].setIcon(new ImageIcon(Frame.class.getResource("/imgs/supermarket.png")));
		lbls[9].setVisible(true);
		
		nLbls[9]=new JLabel("Supermarket in the city: 6");
		nLbls[9].setBounds(955, 485, 200, 50);
		nLbls[9].setFont(new Font("Tahoma", Font.PLAIN, 17));
		nLbls[9].setVisible(true);
		panel.add(lbls[9]);
		panel.add(nLbls[9]);
		
		mapLbls=new HashMap<String, JLabel>(10);
		mapLbls.put(keyHouse, lbls[0]);
		mapLbls.put(keyCinema, lbls[1]);
		mapLbls.put(keyRestaurant, lbls[2]);
		mapLbls.put(keyPoliceStation, lbls[3]);
		mapLbls.put(keyTrainStation, lbls[4]);
		mapLbls.put(keyAirport, lbls[5]);
		mapLbls.put(keyArcade, lbls[6]);
		mapLbls.put(keyCasino, lbls[7]);
		mapLbls.put(keyFactory, lbls[8]);
		mapLbls.put(keySupermarket, lbls[9]);
		
		mapNLbls=new HashMap<String, JLabel>(10);
		mapNLbls.put(keyHouse, nLbls[0]);
		mapNLbls.put(keyCinema, nLbls[1]);
		mapNLbls.put(keyRestaurant, nLbls[2]);
		mapNLbls.put(keyPoliceStation, nLbls[3]);
		mapNLbls.put(keyTrainStation, nLbls[4]);
		mapNLbls.put(keyAirport, nLbls[5]);
		mapNLbls.put(keyArcade, nLbls[6]);
		mapNLbls.put(keyCasino, nLbls[7]);
		mapNLbls.put(keyFactory, nLbls[8]);
		mapNLbls.put(keySupermarket, nLbls[9]);
	}
		
	public Panel getPannello()
	{
		return panel;
	}
	
	public JLabel getLblPutHouse()
	{
		return mapLbls.get(keyHouse);
	}
	public JLabel getLblPutCinema()
	{
		return mapLbls.get(keyCinema);
	}
	public JLabel getLblPutRestaurant()
	{
		return mapLbls.get(keyRestaurant);
	}
	public JLabel getLblPutPoliceStation()
	{
		return mapLbls.get(keyPoliceStation);
	}
	public JLabel getLblPutTrainStation()
	{
		return mapLbls.get(keyTrainStation);
	}
	public JLabel getLblPutAirport()
	{
		return mapLbls.get(keyAirport);
	}
	public JLabel getLblPutArcade()
	{
		return mapLbls.get(keyArcade);
	}
	public JLabel getLblPutCasino()
	{
		return mapLbls.get(keyCasino);
	}
	public JLabel getLblPutFactory()
	{
		return mapLbls.get(keyFactory);
	}
	public JLabel getLblPutSupermarket()
	{
		return mapLbls.get(keySupermarket);
	}
	////////////////////////////////////////////////////////////////////////////
	public JLabel getNLblPutHouse()
	{
		return mapNLbls.get(keyHouse);
	}
	public JLabel getNLblPutCinema()
	{
		return mapNLbls.get(keyCinema);
	}
	public JLabel getNLblPutRestaurant()
	{
		return mapNLbls.get(keyRestaurant);
	}
	public JLabel getNLblPutPoliceStation()
	{
		return mapNLbls.get(keyPoliceStation);
	}
	public JLabel getNLblPutTrainStation()
	{
		return mapNLbls.get(keyTrainStation);
	}
	public JLabel getNLblPutAirport()
	{
		return mapNLbls.get(keyAirport);
	}
	public JLabel getNLblPutArcade()
	{
		return mapNLbls.get(keyArcade);
	}
	public JLabel getNLblPutCasino()
	{
		return mapNLbls.get(keyCasino);
	}
	public JLabel geNtLblPutFactory()
	{
		return mapNLbls.get(keyFactory);
	}
	public JLabel getNLblPutSupermarket()
	{
		return mapNLbls.get(keySupermarket);
	}
	
	@Override
	public void windowOpened(WindowEvent e)
	{
		
	}
	
	@Override
	public void windowClosing(WindowEvent e)
	{
		int control=JOptionPane.showConfirmDialog(this, "Sei sicuro di uscire", "Conferma", JOptionPane.YES_NO_OPTION);
		if(control==JOptionPane.YES_OPTION){
			System.exit(0);
		}		
		else{
			this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		}
	}
	
	@Override
	public void windowClosed(WindowEvent e)
	{
		
	}
	
	@Override
	public void windowIconified(WindowEvent e)
	{
		
	}
	
	@Override
	public void windowDeiconified(WindowEvent e)
	{
		
	}
	
	@Override
	public void windowActivated(WindowEvent e)
	{
		
	}
	
	@Override
	public void windowDeactivated(WindowEvent e)
	{
		
	}	
}