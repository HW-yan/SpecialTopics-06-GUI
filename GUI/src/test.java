//Demo01�G�U�Ӥ���űƪ�����¦����

import java.awt.*;
import javax.swing.*;//javax�X�R��


public class test {
	public static void main (String[] args){
		JFrame demo = new JFrame();
		demo.setSize(400,300);
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		//class test������A�z�פW���ө�b�~��
		JCheckBox checkBox = new JCheckBox ("JCheckBox");
		JRadioButton radioButton = new JRadioButton("JRadioButton");
		JButton button = new JButton("JButton");
		JLabel label = new JLabel("JLabel");
		JTextArea textarea = new JTextArea("JTextArea");
		
		//						     �����ϰ�̤j
		demo.getContentPane().add(BorderLayout.EAST,checkBox);
		demo.getContentPane().add(BorderLayout.WEST,radioButton);
		demo.getContentPane().add(BorderLayout.SOUTH,button);
		demo.getContentPane().add(BorderLayout.NORTH,label);
		demo.getContentPane().add(BorderLayout.CENTER,textarea);
		
		demo.setVisible(true);
		
	}
	
}
