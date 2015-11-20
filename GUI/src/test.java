//Demo01：各個元件級排版的基礎概念

import java.awt.*;
import javax.swing.*;//javax擴充的


public class test {
	public static void main (String[] args){
		JFrame demo = new JFrame();
		demo.setSize(400,300);
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		//class test的元件，理論上應該放在外面
		JCheckBox checkBox = new JCheckBox ("JCheckBox");
		JRadioButton radioButton = new JRadioButton("JRadioButton");
		JButton button = new JButton("JButton");
		JLabel label = new JLabel("JLabel");
		JTextArea textarea = new JTextArea("JTextArea");
		
		//						     中間區域最大
		demo.getContentPane().add(BorderLayout.EAST,checkBox);
		demo.getContentPane().add(BorderLayout.WEST,radioButton);
		demo.getContentPane().add(BorderLayout.SOUTH,button);
		demo.getContentPane().add(BorderLayout.NORTH,label);
		demo.getContentPane().add(BorderLayout.CENTER,textarea);
		
		demo.setVisible(true);
		
	}
	
}
