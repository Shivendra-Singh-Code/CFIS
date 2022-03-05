/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHIVA
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event. *;

public class FaceMenu extends JFrame implements ActionListener
{
	
	JLabel l1=new JLabel();
	//JToolBar j1=new JToolBar();
	JButton b1,b2,b3,b4;
	
	ImageIcon i=new ImageIcon("Icons\\New.gif");
	JMenuItem fileNew=new JMenuItem("New",i);
	
	ImageIcon j=new ImageIcon("Icons\\Show Details.gif");
	JMenuItem fileShow=new JMenuItem("Show details",j);
	JMenuItem fileExit=new JMenuItem("Exit");

	ImageIcon Co1=new ImageIcon("Icons\\Construct.gif");
	JMenuItem editClip=new JMenuItem("Clipping",Co1);
	
	ImageIcon Up=new ImageIcon("Icons\\Update.gif");
	JMenuItem editUpdate=new JMenuItem("Update details",Up);

	ImageIcon Co=new ImageIcon("Icons\\Construct.gif");
	JMenuItem identificationConstruct=new JMenuItem("Construct Face",Co);
	
	ImageIcon Fi=new ImageIcon("C:\\Users\\SHIVA\\Desktop\\CFIS\\Icons\\find face.jpeg");
	JMenuItem identificationFind=new JMenuItem("Find Face");

	ImageIcon pr=new ImageIcon("C:\\Users\\SHIVA\\Desktop\\");
	JMenuItem helpAbout=new JMenuItem("About Face",pr);

	public FaceMenu()
		{

		super(" Face Identification Main Screen");
		Container c=getContentPane();

		b1=new JButton("New");
		b1.setToolTipText("New");
                b1.setBounds(40,50,150,150);

		b2=new JButton("Show");
		b2.setToolTipText("ShowsDetails");
                b2.setBounds(210,50,150,150);

		b3=new JButton("Construct");
		b3.setToolTipText("Construct Image");
                b3.setBounds(40,220,150,150);

		b4=new JButton("Find Face");
		b4.setToolTipText("Find Face");
                b4.setBounds(210,220,150,150);
                
                
                //b4=new JButton(new ImageIcon("Icons\\Find.gif"));
		//b4.setToolTipText("Find Face");
                //b4.setBounds(40,100,50,50);

		//j1.setBounds(0,0,200,50);
		//c.add(j1);

		c.add(b1);
		//j1.addSeparator();
		c.add(b2);
		//j1.addSeparator();
		c.add(b3);
		//j1.addSeparator();
		c.add(b4);

		JMenu fileMenu=new JMenu("File");
		JMenu editMenu=new JMenu("Edit");
		JMenu identificationMenu=new JMenu("Identification");
		JMenu helpMenu=new JMenu("Help");

		l1.setText("FACE IDENTIFICATION SYSTEM ");
		l1.setFont(new Font("Times New Roman",Font.BOLD/Font.ITALIC,25));
		l1.setBounds(30,10,400,30);

		c.setLayout(null);
		c.add(l1);

		fileMenu.add(fileNew);
		fileMenu.add(fileShow);
		fileMenu.addSeparator();
		fileMenu.add(fileExit);

		editMenu.add(editClip);
		editMenu.add(editUpdate);

		identificationMenu.add(identificationConstruct);
		identificationMenu.add(identificationFind);

		helpMenu.add(helpAbout);

		JMenuBar menubar=new JMenuBar();
		menubar.add(fileMenu);
		menubar.add(editMenu);
		menubar.add(identificationMenu);
		menubar.add(helpMenu);

		setJMenuBar(menubar);
		setSize(500,500);

		java.awt.Dimension screen=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		java.awt.Rectangle frame=getBounds();
		this.setLocation((screen.width-frame.width)/2,(screen.height-frame.height)/2);


		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

		fileNew.addActionListener(this);
		fileShow.addActionListener(this);
		fileExit.addActionListener(this);
		
		editClip.addActionListener(this);
		editUpdate.addActionListener(this);
		
		identificationConstruct.addActionListener(this);
		identificationFind.addActionListener(this);

		helpAbout.addActionListener(this);
		
	}

		public void actionPerformed(ActionEvent ae)
			{
			if((ae.getSource()==b1)||(ae.getSource()==fileNew))
			{
					new New().show();
			}
			
			if((ae.getSource()==b2)||(ae.getSource()==fileShow))
				{
					new Show1().show();
				}
			
			if(ae.getSource()==fileExit)
				{
					System.exit(0);
				}
		
			if(ae.getSource()==editClip)
			{
				new ClipImageAnand().show();
			}
			
			if(ae.getSource()==editUpdate)
				{
					new Update().show();
				}
			
			if((ae.getSource()==b3)||(ae.getSource()==identificationConstruct))
				{
					new Construct().show();
				}
			if((ae.getSource()==b4)||(ae.getSource()==identificationFind))
				{
					new FindFace().show();
				}

			if(ae.getSource()==helpAbout)
				{
					new Help().show();
				}
			}
			
	public static void main(String ar[])
	{	
	new FaceMenu().show();
	new FaceMenu().addWindowListener(new WindowAdapter()
	{
		public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
      });
}
}

