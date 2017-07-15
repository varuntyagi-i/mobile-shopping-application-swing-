import java.awt.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
public class mb14 extends JFrame implements ActionListener
{
	JLabel jl;
	JButton jb;

	mb14()
	{
	
	jl=new JLabel("");
	jb=new JButton("Exit");

	add(jb);
	add(jl);

	setLayout(null);

	jb.setBounds(1150,20,120,30);
	jb.addActionListener(this);

	jl.setBounds(350,20,621,617);
	jl.setIcon(new ImageIcon("0.jpg"));

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
	
		
		public static void main(String args[])
		{
			mb14 mm=new mb14();
		
		}
}