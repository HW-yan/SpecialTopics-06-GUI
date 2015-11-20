	//ReadFileDemo：下方的Button變成兩個

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ReadFileDemo implements ActionListener{
	JFrame fr = new JFrame ("File Reader");
	JButton b1 = new JButton("Open File");
	JButton b2 = new JButton("Close File");
	JPanel p1 = new JPanel(new FlowLayout());
	JTextArea ta = new JTextArea();
	FileDialog fd;
	
	public ReadFileDemo(){
		b1.addActionListener(this);
		b2.addActionListener(this);
		p1.add(b1);
		p1.add(b2);
		ta.setFont(new Font ("標楷體",Font.PLAIN,20));
		fr.setSize(800,600);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLayout(new BorderLayout());
		fr.add(BorderLayout.NORTH,p1);
		fr.add(BorderLayout.CENTER,ta);
		fr.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1)
		{
			
			fd = new FileDialog(fr,"Open File",FileDialog.LOAD);
			fd .setVisible(true);
			ta.append("目錄名稱："+fd.getDirectory()+"\n");
			ta.append("檔案名稱："+fd.getFile()+"\n");
			ta.append("-------------------------------- \n");
			
		}
		else if (e.getSource()==b2){
			
			fr.dispose();
			
		}
		
	}
	
	
	
		public static void main (String[] args){
		
			ReadFileDemo demo = new ReadFileDemo();
			demo.ta.append("Start...\n");
			
	}
}
