package view;

import controller.Controller;

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
	private static HashMap<String, JLabel> map;
	private JLabel lblTest;
	
	public Frame()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel=new Panel();
		this.setContentPane(panel);
		
		setLbls();
		
//		lblTest= new JLabel("test");
//		lblTest.setBounds(800, 22, 149, 100);
//		lblTest.setIcon(new ImageIcon(Frame.class.getResource("/imgs/supermarket.png")));
//		panel.add(lblTest);
		
		this.setResizable(false);
		this.setBounds(20, 20, 1200, 660);
		this.setVisible(true);
//		this.addWindowListener(this);
		this.setTitle("Sim City replica");
	}
	
	private static void setLbls()
	{
		lbls=new JLabel[10];
		lbls[0]=new JLabel("House");
		lbls[0].setBounds(400, 20, 137, 106);
		lbls[0].setIcon(new ImageIcon(Frame.class.getResource("/imgs/house.png")));
		lbls[0].setVisible(true);
		panel.add(lbls[0]);
		lbls[1]=new JLabel("Cinema");
		lbls[1].setBounds(400, 150, 150, 59);
		lbls[1].setIcon(new ImageIcon(Frame.class.getResource("/imgs/cinema.png")));
		lbls[1].setVisible(true);
		panel.add(lbls[1]);
		lbls[2]=new JLabel("Restaurant");
		lbls[2].setBounds(400, 235, 191, 67);
		lbls[2].setIcon(new ImageIcon(Frame.class.getResource("/imgs/restaurant.png")));
		lbls[2].setVisible(true);
		panel.add(lbls[2]);
		lbls[3]=new JLabel("PoliceStation");
		lbls[3].setBounds(400, 325, 143, 86);
		lbls[3].setIcon(new ImageIcon(Frame.class.getResource("/imgs/police_station.png")));
		lbls[3].setVisible(true);
		panel.add(lbls[3]);
		lbls[4]=new JLabel("TrainStation");
		lbls[4].setBounds(400, 434, 140, 70);
		lbls[4].setIcon(new ImageIcon(Frame.class.getResource("/imgs/train_station.png")));
		lbls[4].setVisible(true);
		panel.add(lbls[4]);
		lbls[5]=new JLabel("Airport");
		lbls[5].setBounds(800, 20, 130, 85);
		lbls[5].setIcon(new ImageIcon(Frame.class.getResource("/imgs/airport.png")));
		lbls[5].setVisible(true);
		panel.add(lbls[5]);
		lbls[6]=new JLabel("Arcade");
		lbls[6].setBounds(800, 135, 130, 87);
		lbls[6].setIcon(new ImageIcon(Frame.class.getResource("/imgs/arcade.png")));
		lbls[6].setVisible(true);
		panel.add(lbls[6]);
		lbls[7]=new JLabel("Casino");
		lbls[7].setBounds(800, 245, 135, 90);
		lbls[7].setIcon(new ImageIcon(Frame.class.getResource("/imgs/casino.png")));
		lbls[7].setVisible(true);
		panel.add(lbls[7]);
		lbls[8]=new JLabel("Factory");
		lbls[8].setBounds(800, 355, 140, 88);
		lbls[8].setIcon(new ImageIcon(Frame.class.getResource("/imgs/factory.png")));
		lbls[8].setVisible(true);
		panel.add(lbls[8]);
		lbls[9]=new JLabel("Supermarket");
		lbls[9].setBounds(800, 465, 149, 100);
		lbls[9].setIcon(new ImageIcon(Frame.class.getResource("/imgs/supermarket.png")));
		lbls[9].setVisible(true);
		panel.add(lbls[9]);
		
		map=new HashMap<String, JLabel>(10);
		
		map.put(keyHouse, lbls[0]);
		map.put(keyCinema, lbls[1]);
		map.put(keyRestaurant, lbls[2]);
		map.put(keyPoliceStation, lbls[3]);
		map.put(keyTrainStation, lbls[4]);
		map.put(keyAirport, lbls[5]);
		map.put(keyArcade, lbls[6]);
		map.put(keyCasino, lbls[7]);
		map.put(keyFactory, lbls[8]);
		map.put(keySupermarket, lbls[9]);
	}
		
	public Panel getPannello() {
		return panel;
	}
	
	public JLabel getLblPutHouse()
	{
		return map.get(keyHouse);
	}
	public JLabel getLblPutCinema()
	{
		return map.get(keyCinema);
	}
	public JLabel getLblPutRestaurant()
	{
		return map.get(keyRestaurant);
	}
	public JLabel getLblPutPoliceStation()
	{
		return map.get(keyPoliceStation);
	}
	public JLabel getLblPutTrainStation()
	{
		return map.get(keyTrainStation);
	}
	public JLabel getLblPutAirport()
	{
		return map.get(keyAirport);
	}
	public JLabel getLblPutArcade()
	{
		return map.get(keyArcade);
	}
	public JLabel getLblPutCasino()
	{
		return map.get(keyCasino);
	}
	public JLabel getLblPutFactory()
	{
		return map.get(keyFactory);
	}
	public JLabel getLblPutSupermarket()
	{
		return map.get(keySupermarket);
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