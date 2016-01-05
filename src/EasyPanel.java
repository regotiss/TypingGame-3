import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EasyPanel extends JPanel implements ActionListener
{
	int width,height;
	Game l;
	JButton lower,upper,digit,all;
	public EasyPanel(Game l)
	{
		this.l=l;
		width=250;
		height=300;
		setLayout(new GridLayout(4,0,0,10));
		setFont(new Font("Forte",Font.BOLD,48));

		setBackground(Color.yellow);
		lower=new JButton("lower");
		upper=new JButton("upper");
		digit=new JButton("digit");
		all=new JButton("all");

		lower.setFont(new Font("Forte",Font.BOLD,48));
		upper.setFont(new Font("Forte",Font.BOLD,48));
		digit.setFont(new Font("Forte",Font.BOLD,48));
		all.setFont(new Font("Forte",Font.BOLD,48));

		lower.setBackground(Color.green);
		upper.setBackground(Color.green);
		digit.setBackground(Color.green);
		all.setBackground(Color.green);

		lower.setForeground(Color.yellow);
		upper.setForeground(Color.yellow);
		digit.setForeground(Color.yellow);
		all.setForeground(Color.yellow);

		lower.addActionListener(this);
		upper.addActionListener(this);
		digit.addActionListener(this);
		all.addActionListener(this);

		add(lower);
		add(upper);
		add(digit);
		add(all);

	}
	public void actionPerformed(ActionEvent e)
	{
		setVisible(false);
		JButton b=(JButton)e.getSource();
		if(b==lower)
		Easy.create(97,l);
		else if(b==upper)
		Easy.create(65,l);
		else if(b==digit)
		Easy.create(48,l);
		else
		Easy.create(47,l);

	}
	public ImageIcon creatImage(String path)
	{
		java.net.URL url=Game.class.getResource(path);
		return new ImageIcon(url);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
