import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.applet.*;
import java.io.*;

public class TwoBtnSong implements ActionListener
{
	JButton rustambtn, citybtn;

	AudioClip ac1,ac2;

	JFrame f=new JFrame();

    public static void main(String [] args)
	{
		new TwoBtnSong();
	}

	public TwoBtnSong()
	{
	    f.setSize(250,70);
	    f.setLocation(490,350);
	    f.setTitle("Usability Demo !!");
	    f.setVisible(true);

		rustambtn = new JButton("Rustam");
		rustambtn.addActionListener(this);

	    citybtn = new JButton("CityLight");
	    citybtn.addActionListener(this);

        Panel p=new Panel();
 	     p.add(rustambtn);
	     p.add(citybtn);
         f.add(p);

	}
		public void actionPerformed(ActionEvent e)
		{
			if (e.getSource() == rustambtn)
			{
			  try
			  {
				ac1 = Applet.newAudioClip(new File("./rustam.wav").toURL());
		  	    ac1.play();
//		  	    ac2.stop();

		      }
		      catch(Exception e1){}
			}
			else if (e.getSource() == citybtn)
			{
			  try
			  {
 				 ac2 = Applet.newAudioClip(new File("./city.wav").toURL());
		  	     ac2.play();
//		  	     ac1.stop();
		      }
		      catch(Exception e1){}
			}
		}
}




