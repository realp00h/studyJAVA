package Week04;

import java.awt.*;
import javax.swing.*;

class BusinessCard extends JPanel {
	private ImageIcon imageIcon;
	
	public BusinessCard() {
	imageIcon = new ImageIcon("증명사진.jpg");
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(imageIcon.getImage(), 20, 20, 80, 80, this);		
		g.drawString("최수빈", 150, 40);
		g.drawString("대학생", 150, 60);
		g.drawString("덕성여자대학교", 150, 80);
	}
}
class MyFrame extends JFrame{
	public MyFrame(){
		setSize(600,180);
		setTitle("BusinessCard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new BusinessCard());
		setVisible(true);
	}
}
public class Card {
	public static void main(String[] arge){
		MyFrame F = new MyFrame();
	}

}
