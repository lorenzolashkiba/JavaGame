import controller.Controller;
import view.Frame;

public class Main
{
	
	public static void main(String[] args)
	{
		Frame f=new Frame();
		Controller controller = new Controller(f.getPannello());
	}
}