import java.awt.*;
import javax.swing.*;
import java.applet.*;
<applet code=mb0 width=400 height=400></applet>
public class mb0 extends JApplet
{
	JTextField jt,jt1;
	JButton jb,jb1;
	JLabel jl,jl1;
	public void init()
	{
	jt=new JTextField(10);
	jl=new JLabel("user");
	jb=new JButton("login");
	add(jl);
	add(jt);
	add(jb);
	setLayout(null);
	jl.setBounds(30,30,100,30);
	jt.setBounds(50,150,100,30);
	jb.setBounds(150,50,80,50);
		}
	}