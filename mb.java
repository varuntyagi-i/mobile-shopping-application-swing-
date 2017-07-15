import java.awt.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
public class mb extends JFrame implements ActionListener
{
	JTextField jt,jt1;
	JButton jb,jb1;
	JLabel jl,jl1,jl2,jl3;
	
	mb()
	{
	jt=new JTextField(10);
	//jt1=new JTextField(10);
	jt1=new JPasswordField(10);
	jl=new JLabel("Usser id:");
	jl1=new JLabel("Password:");
	jl2=new JLabel("Mobile World");
	jl3=new JLabel("");
	jb=new JButton("login");
	jb1=new JButton("refresh");
	
	add(jl);
	add(jl1);
	add(jl2);
	add(jt);
	add(jt1);
	add(jl3);
	add(jb);
	add(jb1);	
	setLayout(null);
	jl.setBounds(20,300,200,20);
	jl.setFont(new Font("Bernard MT",Font.PLAIN,25));	
	jl1.setBounds(20,380,200,20);	
	jl1.setFont(new Font("Bernard MT",Font.PLAIN,25));
	jl2.setBounds(20,1,600,150);
	jl2.setFont(new Font("Bernard MT",Font.PLAIN,100));
	jl3.setBounds(650,430,220,30);
	jl3.setFont(new Font("Corbel",Font.PLAIN,20));
	jl3.setForeground(Color.RED);	
	jt.setBounds(250,280,350,50);
	jt1.setBounds(250,360,350,50);
	jb.setBounds(250,500,150,50);
	jb.addActionListener(this);
	jb1.setBounds(450,500,150,50);
	jb1.addActionListener(this);
	
	setVisible(true);
	setSize(1368,750);
	}
		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==jb)
		{
				if(jt.getText().equals("varun")&&jt1.getText().equals("xyz"))
				{
					//jl2.setText("welcome");
					mb1 mm=new mb1();
					setVisible(false);
				}
				else
					jl3.setText("Wrong Password/User id");
					//mb mm=new mb();
					
		}
			if(ae.getSource()==jb1)
			{
				jt.setText("");
				jt1.setText("");
			}
		}
		public static void main(String cp[])
		{
		mb m=new mb();
		}
}