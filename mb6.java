import java.awt.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
public class mb6 extends JFrame implements ActionListener 
{	
	JLabel jl3;
	JButton jb;
	
	mb6()
	{
	jb=new JButton("back");
	jl3=new JLabel("Mobile World"); 

	add(jl3);
	add(jb);
	setLayout(null);
	
	
	jb.setBounds(620,600,120,40);
	jb.addActionListener(this);
	jl3.setBounds(350,1,1000,300);
	jl3.setFont(new Font("Bernard MT",Font.PLAIN,120));

	setVisible(true);
	setSize(1368,750);
	}
	
		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==jb)
				{
		
					mb1 mm=new mb1();
					setVisible(false);
				}
		
		}
			

			public static void main(String cp[])
		{
	        	mb6 mm=new mb6();
		}
}
