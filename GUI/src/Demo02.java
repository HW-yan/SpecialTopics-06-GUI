//Demo02：//測試Layout

import java.awt.*;
import javax.swing.*;//javax擴充的


public class Demo02 {
	public static void main (String[] args){
		JFrame demo = new JFrame();
		demo.setSize(400,300);
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//測試Layout
		//demo.setLayout(new FlowLayout()); → 根據最小的按鈕排
		demo.setLayout(new GridLayout(2 ,3)); // → 一樣大小
		//							 (列,行) 
		
		
		JCheckBox checkBox = new JCheckBox ("JCheckBox");
		JRadioButton radioButton = new JRadioButton("JRadioButton");
		JButton button = new JButton("JButton");
		JLabel label = new JLabel("JLabel");
		JTextArea textarea = new JTextArea("JTextArea");
		
		demo.getContentPane().add(checkBox);
		demo.getContentPane().add(radioButton);
		demo.getContentPane().add(button);
		demo.getContentPane().add(label);
		demo.getContentPane().add(textarea);
		
		demo.setVisible(true);
		
	}
	
}
