//Demo02�G//����Layout

import java.awt.*;
import javax.swing.*;//javax�X�R��


public class Demo02 {
	public static void main (String[] args){
		JFrame demo = new JFrame();
		demo.setSize(400,300);
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//����Layout
		//demo.setLayout(new FlowLayout()); �� �ھڳ̤p�����s��
		demo.setLayout(new GridLayout(2 ,3)); // �� �@�ˤj�p
		//							 (�C,��) 
		
		
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
