import controller.Controller;
import view.Finestra;

public class Main
{
	
	public static void main(String[] args)
	{
		Finestra f=new Finestra();
		Controller controller = new Controller(f.getPannello());
	}
}