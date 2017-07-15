import java.awt.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
public class mb2 extends JFrame implements ActionListener
{	
	JLabel jl,jl1,jl2,jl3,jl4,jl5,jl6,jl7;
	JButton jb,jb1,jb2;
	JComboBox jx,jx1;
	
	mb2()
	{
		
	jl1=new JLabel("");
	jl2=new JLabel("");
	jl3=new JLabel("");
	jl4=new JLabel("");
	jl5=new JLabel("");
	jl6=new JLabel("");
	jl7=new JLabel("");
	
	jb=new JButton("Back");
	jb1=new JButton("Search");
	jb2=new JButton("Refresh");
	jx=new JComboBox();
	jx1=new JComboBox();
	jl=new JLabel("Filter Results"); 

	add(jl);
	add(jx);
	add(jx1);
	add(jl7);
	add(jb);
	add(jb1);
	add(jb2);
	add(jl1);
	add(jl2);
	add(jl3);
	add(jl4);
	add(jl5);
	add(jl6);

	setLayout(null);

	jx.addItem("Category");
	jx.addItem("latest");
	jx.addItem("upcoming");
	jx.addItem("special offers");
	jx.setBounds(20,70,150,30);
	jx1.addItem("Range");
	jx1.addItem("below 15000");
	jx1.addItem("above 15000");
	jx1.setBounds(20,110,150,30);
	jl.setBounds(20,20,400,40);
	jl.setFont(new Font("Corbel",Font.PLAIN,30));
	
	jl1.setBounds(20,240,300,300);
	jl2.setBounds(330,240,300,300);
	jl3.setBounds(640,240,300,300);
	jl4.setBounds(20,240,300,300);
	jl5.setBounds(20,240,725,329);
	jl6.setBounds(20,240,300,300);
	
	jb.setBounds(1215,10,120,30);
	jb.addActionListener(this);
	
	jb1.setBounds(20,150,120,30);
	jb1.addActionListener(this);

	jl7.setIcon(new ImageIcon("01.jpg"));
	jl7.setBounds(200,10,1000,210);

	jb2.setBounds(20,190,120,30);
	jb2.addActionListener(this);

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

			if(ae.getSource()==jb1)
				{
					if(jx.getSelectedItem().equals("latest")&&jx1.getSelectedItem().equals("below 15000"))
					{
					jl1.setIcon(new ImageIcon("1.png"));
					jl2.setIcon(new ImageIcon("2.png"));
					jl3.setIcon(new ImageIcon("3.png"));
					}
					
					if(jx.getSelectedItem().equals("latest")&&jx1.getSelectedItem().equals("above 15000"))
					{
					jl4.setIcon(new ImageIcon("4.png"));
					}
					
					if(jx.getSelectedItem().equals("upcoming")&&jx1.getSelectedItem().equals("below 15000"))
					{
					jl5.setIcon(new ImageIcon("02.jpg"));
					
					}
					
					if(jx.getSelectedItem().equals("upcoming")&&jx1.getSelectedItem().equals("above 15000"))
					{
					jl6.setIcon(new ImageIcon("5.png"));
					}	
					
					if(jx.getSelectedItem().equals("special offers")&&jx1.getSelectedItem().equals("below 15000"))
					{
						mb14 mm=new mb14();					
					}
					
					if(jx.getSelectedItem().equals("special offers")&&jx1.getSelectedItem().equals("above 15000"))
					{
						mb14 mm=new mb14();
					}		
	
					
				}
			if(ae.getSource()==jb2)
					{
						mb2 mm=new mb2();
					}
		
			}				

		

				public static void main(String cp[])
			{
	        	mb2 mm=new mb2();
			}
}