import controller.InterControl;
import view.BuildFrame;
import view.Frame;

public class Main
{
	
	public static void main(String[] args)
	{
		Frame f=new Frame();
		BuildFrame buildFrame = new BuildFrame();
		InterControl controller = new InterControl(f,buildFrame);
	}
}