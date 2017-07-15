
import java.awt.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
public class mb1 extends JFrame implements ActionListener 
{	
	JMenuBar jm;
	JMenu mnu,mnu1,mnu2,mnu3;
	JMenuItem jm1,jm2,jm3,jm4,jm5,jm6,jm7,jm8,jm9,jm10,jm11,jm12,jm13;
	JLabel jl3,jl;
	
	mb1()
	{
		
	jl3=new JLabel("Mobile World");
	jl=new JLabel("");
	jm=new JMenuBar();
	mnu=new JMenu("BRAND NAME");
	mnu1=new JMenu("HELP");
	mnu2=new JMenu("OFFER ZONE");
	mnu3=new JMenu("MY ACCOUNT");
	
	jm1=new JMenuItem("Microsoft");
	jm2=new JMenuItem("Samsung");
	jm3=new JMenuItem("Micromax");
	jm4=new JMenuItem("Lenevo");
	jm5=new JMenuItem("Asus");
	jm6=new JMenuItem("Sony");
	jm7=new JMenuItem("Xiomi");
	jm8=new JMenuItem("Contact no.");
	jm9=new JMenuItem("Details");
	jm10=new JMenuItem("Today's offer");
	jm11=new JMenuItem("Cart");
	jm12=new JMenuItem("Logout");
	jm13=new JMenuItem("Change User id/Password"); 
	setJMenuBar(jm);
	
	jm.add(mnu);
	jm.add(mnu2);
	jm.add(mnu3);
	jm.add(mnu1);
	mnu.add(jm1);
	mnu.add(jm2);
	mnu.add(jm3);
	mnu.add(jm4);
	mnu.add(jm5);

	mnu.add(jm6);
	mnu.add(jm7);
        mnu1.add(jm8);
	mnu1.add(jm9);
	mnu2.add(jm10);
	mnu3.add(jm11);
	mnu3.add(jm13);
	mnu3.add(jm12);
	mnu1.add(jm8);
	mnu1.add(jm9);
	add(jl3);
	add(jl);
	
	jm1.addActionListener(this);
	jm2.addActionListener(this);
	jm3.addActionListener(this);
	jm4.addActionListener(this);
	jm5.addActionListener(this);
	jm8.addActionListener(this);
	jm9.addActionListener(this);
	jm10.addActionListener(this);
	jm11.addActionListener(this);
	jm12.addActionListener(this);
	jm13.addActionListener(this);
	setLayout(null);
	jl3.setBounds(350,1,1000,300);
	jl3.setFont(new Font("Bernard MT",Font.PLAIN,120));
	jl.setBounds(0,0,1368,750);
	jl.setIcon(new ImageIcon("000.jpg"));	

	setVisible(true);
	setSize(1368,750);
	}
	
		
		public void actionPerformed(ActionEvent ae)
	{
			
			
			 if(ae.getSource()==jm1)
		{
			mb2 mm=new mb2();
			setVisible(false);	
		}	
					
			else if(ae.getSource()==jm2)
		{
			mb3 mm=new mb3();
			setVisible(false);	
		}	
			else if(ae.getSource()==jm3)
		{
			mb4 mm=new mb4();
			setVisible(false);	
		}	

			else if(ae.getSource()==jm4)
		{
			mb5 mm=new mb5();
			setVisible(false);	
		}	
			else if(ae.getSource()==jm8)
		{
			mb6 mm=new mb6();
			setVisible(false);	
		}
			else if(ae.getSource()==jm9)
		{
			mb10 mm=new mb10();
			setVisible(false);	
		}
			else if(ae.getSource()==jm10)
		{
			mb7 mm=new mb7();
			setVisible(false);	
		}	
			else if(ae.getSource()==jm11)
		{
			mb8 mm=new mb8();
			setVisible(false);	
		}	
			else if(ae.getSource()==jm12)
		{
			mb mm=new mb();
			setVisible(false);	
		}	
			else if(ae.getSource()==jm13)
		{
			mb9 mm=new mb9();
			setVisible(false);			}	
	

	}				
				public static void main(String cp[])
				{
	        		mb1 mm=new mb1();
				}
}