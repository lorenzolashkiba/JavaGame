package view;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

public class Finestra extends JFrame implements WindowListener
{
	private Pannello p;
	
	public Finestra()
	{
		p=new Pannello();
		this.setContentPane(p);
		this.setResizable(false);
		this.setBounds(10, 10, 900, 660);
		this.setVisible(true);
		this.setTitle("miiari ace");
	}
	//TODO: fai chiudere definitivamente il processo dopo aver chiuso la finestra
	@Override
	public void windowOpened(WindowEvent e)
	{
		
	}
	
	@Override
	public void windowClosing(WindowEvent e)
	{
		
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