package view;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JProgressBar;
import java.awt.Color;
import javax.swing.JButton;

import controller.InterControl;

public class Panel extends JPanel
{
	private JLabel lblMoney;
	private JLabel nMoney;
	private JLabel lblValuation;
	private JLabel lblMajorRating;
	private JLabel lblWorkers;
	private JLabel nWorkers;
	private JLabel lblPplSatisfaction;
	private JLabel nPplSatis;
	private JLabel lblPplNum;
	private JLabel nPplNum;
	private JLabel lblCrime;
	private JLabel nCrime;
	private JLabel lblPollution;
	private JLabel nPollution;
	private JLabel lblTraffic;
	private JLabel nTraffic;
	private JLabel lblHour;
	private JProgressBar progressBar;
	private JButton btnBuild;
	private JButton btnWarning;
	
	public Panel()
	{
		setLayout(null);
		
		lblMoney= new JLabel("soldi");
		lblMoney.setBounds(280, 11, 25, 40);
		lblMoney.setIcon(new ImageIcon(Panel.class.getResource("/imgs/soldi.png")));
		add(lblMoney);
		
		lblValuation = new JLabel("City evaluation");
		lblValuation.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblValuation.setBounds(106, 33, 145, 23);
		add(lblValuation);
		
		lblMajorRating = new JLabel("Major rating");
		lblMajorRating.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblMajorRating.setBounds(26, 75, 105, 23);
		add(lblMajorRating);
		
		lblWorkers = new JLabel("Workers");
		lblWorkers.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblWorkers.setBounds(26, 108, 66, 23);
		add(lblWorkers);
		
		lblPplSatisfaction = new JLabel("People satisfaction");
		lblPplSatisfaction.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPplSatisfaction.setBounds(26, 141, 138, 23);
		add(lblPplSatisfaction);
		
		lblPplNum = new JLabel("People");
		lblPplNum.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPplNum.setBounds(26, 174, 59, 23);
		add(lblPplNum);
		
		lblCrime = new JLabel("Crime");
		lblCrime.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCrime.setBounds(26, 207, 59, 23);
		add(lblCrime);
		
		lblPollution = new JLabel("Pollution");
		lblPollution.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPollution.setBounds(26, 240, 70, 23);
		add(lblPollution);
		
		lblTraffic = new JLabel("Traffic");
		lblTraffic.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTraffic.setBounds(26, 273, 59, 23);
		add(lblTraffic);
		
		lblHour = new JLabel("1/1/1970");
		lblHour.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblHour.setBounds(10, 11, 116, 23);
		add(lblHour);
		
		progressBar = new JProgressBar();
		progressBar.setForeground(Color.GREEN);
		progressBar.setBounds(244, 75, 80, 22);
		add(progressBar);
		
		nWorkers = new JLabel("15");
		nWorkers.setFont(new Font("Tahoma", Font.PLAIN, 17));
		nWorkers.setBounds(254, 113, 45, 13);
		add(nWorkers);
		
		nPplSatis = new JLabel("no");
		nPplSatis.setFont(new Font("Tahoma", Font.PLAIN, 17));
		nPplSatis.setBounds(254, 146, 45, 13);
		add(nPplSatis);
		
		nPplNum = new JLabel("10000");
		nPplNum.setFont(new Font("Tahoma", Font.PLAIN, 17));
		nPplNum.setBounds(254, 176, 51, 18);
		add(nPplNum);
		
		nCrime = new JLabel("20%");
		nCrime.setFont(new Font("Tahoma", Font.PLAIN, 17));
		nCrime.setBounds(254, 208, 45, 21);
		add(nCrime);
		
		nPollution = new JLabel("50%");
		nPollution.setFont(new Font("Tahoma", Font.PLAIN, 17));
		nPollution.setBounds(254, 245, 45, 13);
		add(nPollution);
		
		nTraffic = new JLabel("100%");
		nTraffic.setFont(new Font("Tahoma", Font.PLAIN, 17));
		nTraffic.setBounds(254, 275, 70, 18);
		add(nTraffic);
		
		nMoney = new JLabel("10000");
		nMoney.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nMoney.setBounds(307, 11, 58, 40);
		add(nMoney);
		
		btnBuild = new JButton("Build");
		btnBuild.setBackground(Color.GREEN);
		btnBuild.setForeground(Color.BLACK);
		btnBuild.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnBuild.setBounds(52, 322, 109, 37);
		add(btnBuild);
		
		btnWarning= new JButton("Warning");
		btnWarning.setBackground(Color.RED);
		btnWarning.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnWarning.setBounds(190, 322, 109, 37);
		add(btnWarning);
	}
	
	public void btnPanelListener(InterControl c)
	{
		btnBuild.addActionListener(c);
		btnWarning.addActionListener(c);
	}
	
	public JLabel getLblMoney()
	{
		return lblMoney;
	}
	public JLabel getLblValuation()
	{
		return lblValuation;
	}
	public JLabel getLblPplRating()
	{
		return lblMajorRating;
	}
	public JLabel getLblWorkers()
	{
		return lblWorkers;
	}
	public JLabel getLblPplSatisfaction()
	{
		return lblPplSatisfaction;
	}
	public JLabel getLblPplNum()
	{
		return lblPplNum;
	}
	public JLabel getLblCrime()
	{
		return lblCrime;
	}
	public JLabel getLblPollution()
	{
		return lblPollution;
	}	
	public JLabel getLblTraffic()
	{
		return lblTraffic;
	}
	public JLabel getLblHour()
	{
		return lblHour;
	}
	public JProgressBar getLblProgressBar()
	{
		return progressBar;
	}
	public JButton getBtnBuild()
	{
		return btnBuild;
	}
	public JButton getBtnWarnings()
	{
		return btnWarning;
	}
	
	public void setMoney(String lashkiba_metti_qui)
	{
		this.nMoney.setText(lashkiba_metti_qui);
	}
	public void setWorkers(String lashkiba_metti_qui)
	{
		this.nWorkers.setText(lashkiba_metti_qui);
	}
	public void setPplSatis(String lashkiba_metti_qui)
	{
		this.nPplSatis.setText(lashkiba_metti_qui);
	}
	public void setPplNum(String lashkiba_metti_qui)
	{
		this.nPplNum.setText(lashkiba_metti_qui);
	}
	public void setCrime(String lashkiba_metti_qui)
	{
		this.nCrime.setText(lashkiba_metti_qui);
	}
	public void setPollution(String lashkiba_metti_qui)
	{
		this.nPollution.setText(lashkiba_metti_qui);
	}
	public void setTraffic(String lashkiba_metti_qui)
	{
		this.nTraffic.setText(lashkiba_metti_qui);
	}
	public void setHour(String lashkiba_metti_qui)
	{
		this.lblHour.setText(lashkiba_metti_qui);
	}
	public void setProgressBar(int valore)
	{
		this.progressBar.setValue(valore);
	}
}