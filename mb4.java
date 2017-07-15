
import java.awt.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
public class mb4 extends JFrame implements ActionListener 
{	
	JLabel jl,jl3;
	JButton jb;
	JComboBox jx,jx1;

	mb4()
	{
		
	jl3=new JLabel("Mobile World");
	jb=new JButton("back");
	jl=new JLabel("Please select your preference before proceeding"); 
	jx=new JComboBox();
	jx1=new JComboBox();
	
	JPanel container = new JPanel();
	JScrollPane scrPane = new JScrollPane(container);
	
	add(jl3);
	add(jl);
	add(jx);
	add(jx1);
	add(jb);
	setLayout(null);

	jx.addItem("Category");
	jx.addItem("upcoming");
	jx.addItem("latest");
	jx.addItem("discounts");
	jx.addItem("special offers");
	jx.setBounds(850,400,150,30);
	jx1.addItem("Range");
	jx1.addItem("upto 5000");
	jx1.addItem("5000 to 15000");
	jx1.addItem("above 15000");
	jx1.setBounds(1020,400,150,30);
	
	add(scrPane);
	
	jl.setBounds(200,390,700,40);
	jl.setFont(new Font("Forte",Font.PLAIN,30));
	
	jl3.setBounds(350,1,1000,300);
	jl3.setFont(new Font("Bernard MT",Font.PLAIN,120));
	jb.setBounds(620,600,120,40);
	jb.addActionListener(this);

	scrPane.setLayout(new ScrollPaneLayout());
	
	setVisible(true);
	setSize(200,200);
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
	        	mb4 mm=new mb4();
		}
}