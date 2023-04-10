import javax.swing.*;
import java.awt.*;
public class 게임view extends JPanel{
	Image back,air;
	int x=600,y=100;
	public 게임view()
	{
		back=Toolkit.getDefaultToolkit().getImage()
	    air= Toolkit.getDefaultToolkit().getImage()
	}
	public void paint(Graphics g)
	{
		g.drawImage(back,0,0,getWidth(),getHeight
	}

}
