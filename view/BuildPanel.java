package view;


import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;

public class BuildPanel extends JPanel
{
	public BuildPanel()
	{
		setLayout(null);
		
		JButton btnNewButton = new JButton("Condominio");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(10, 10, 121, 29);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cinema");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_1.setBounds(141, 10, 121, 29);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Restaurant");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_2.setBounds(272, 10, 121, 29);
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Police station");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_3.setBounds(10, 49, 176, 29);
		add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Train station");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_4.setBounds(196, 49, 176, 29);
		add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Aereoporto");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_5.setBounds(10, 87, 115, 29);
		add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Sala giochi");
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_6.setBounds(141, 87, 115, 29);
		add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Casino");
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_7.setBounds(269, 87, 85, 29);
		add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Fabbrica");
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_8.setBounds(10, 124, 102, 29);
		add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Supermarket");
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_9.setBounds(122, 124, 140, 29);
		add(btnNewButton_9);
		this.setVisible(false);
	}
}