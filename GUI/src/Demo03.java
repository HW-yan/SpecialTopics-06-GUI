//Demo01�G�U�誺Button�ܦ����

import java.awt.*;
import javax.swing.*;//javax�X�R��


public class Demo03 {
	public static void main (String[] args){
		JFrame demo = new JFrame();
		demo.setSize(400,300);
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		//class test������A�z�פW���ө�b�~��
		JCheckBox checkBox = new JCheckBox ("JCheckBox");
		JRadioButton radioButton = new JRadioButton("JRadioButton");
		
		JButton button0 = new JButton("JButton0");
		JButton button1 = new JButton("JButton1");
		
		JLabel label = new JLabel("JLabel");
		JTextArea textarea = new JTextArea("JTextArea");
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		//�����ǩ�
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
