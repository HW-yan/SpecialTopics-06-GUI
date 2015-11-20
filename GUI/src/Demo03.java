//Demo01：下方的Button變成兩個

import java.awt.*;
import javax.swing.*;//javax擴充的


public class Demo03 {
	public static void main (String[] args){
		JFrame demo = new JFrame();
		demo.setSize(400,300);
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		//class test的元件，理論上應該放在外面
		JCheckBox checkBox = new JCheckBox ("JCheckBox");
		JRadioButton radioButton = new JRadioButton("JRadioButton");
		
		JButton button0 = new JButton("JButton0");
		JButton button1 = new JButton("JButton1");
		
		JLabel label = new JLabel("JLabel");
		JTextArea textarea = new JTextArea("JTextArea");
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		//有順序性
		panel.add(button0);
		panel.add(button1);
		
		
		demo.getContentPane().add(BorderLayout.EAST,checkBox);
		demo.getContentPane().add(BorderLayout.WEST,radioButton);
		demo.getContentPane().add(BorderLayout.SOUTH,panel);
		demo.getContentPane().add(BorderLayout.NORTH,label);
		demo.getContentPane().add(BorderLayout.CENTER,textarea);
		
		demo.setVisible(true);
		
	}
	
}
