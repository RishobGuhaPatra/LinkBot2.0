import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ConnectBot implements ActionListener{
	static Boolean execute = false;
	static JLabel connectLabel;
	static String connections = "Number of connections: ";
	static JLabel logoLabel;
	ImageIcon logo;
	
	JFrame frame;
	JPanel panel;
	static JButton run;
	JButton stop;
	static JTextField unameEntry;
	static JTextField passEntry;
	static JTextField targetEntry;
	static JTextField pagesEntry;
	static JLabel title;
	
	public ConnectBot() {
		JFrame frame = new JFrame();
		logoLabel = new JLabel("");
		JButton run = new JButton("Run");
		JButton stop = new JButton("Stop");
		JPanel panel = new JPanel();
		JLabel unameLabel = new JLabel("LinkedIn Username:");
		JLabel passLabel = new JLabel("LinkedIn Password:");
		JLabel Message = new JLabel("Note: DO NOT SHARE");
		unameEntry = new JTextField("john@gmail.com");
		passEntry = new JTextField("*****");
		JLabel targetLabel = new JLabel("Search target:");
		JLabel pagesLabel = new JLabel("Pages to process:");
		targetEntry = new JTextField("Business student Atlanta");
		pagesEntry = new JTextField("5");
		connectLabel = new JLabel(connections);
		title = new JLabel("Welcome to ConnectBot!");
		title.setFont(new Font("Serif", Font.PLAIN, 30));
		
		run.addActionListener(this);
//		stop.addActionListener(this);
		Color fg1 = new Color(240, 200, 0);
		Color fg2 = new Color(250, 250, 250);
		Color bg = new Color(30, 30, 30);
		
		panel.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
		panel.setBackground(new Color(50, 50, 50));
		
//		logo = new ImageIcon("logo.png");
//		logoLabel.setIcon(logo);
		
		title.setForeground(fg1);
		title.setBackground(bg);
		unameLabel.setForeground(fg1);
		passLabel.setForeground(fg1);
		targetLabel.setForeground(fg1);
		pagesLabel.setForeground(fg1);
		unameEntry.setBackground(bg);
		passEntry.setBackground(bg);
		targetEntry.setBackground(bg);
		pagesEntry.setBackground(bg);
		unameEntry.setForeground(fg2);
		passEntry.setForeground(fg2);
		targetEntry.setForeground(fg2);
		Message.setForeground(new Color(250, 0, 0));
		pagesEntry.setForeground(fg2);
		pagesLabel.setForeground(fg1);
		
		panel.setLayout(new GridLayout(0,2));
		panel.add(title);
		panel.add(logoLabel);
		panel.add(unameLabel);
		panel.add(unameEntry);
		panel.add(passLabel);
		panel.add(passEntry);
		panel.add(targetLabel);
		panel.add(targetEntry);
		panel.add(pagesLabel);
		panel.add(pagesEntry);
		panel.add(Message);
		panel.add(run);

		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("ConnectBot 1.0");
		frame.pack();
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ConnectBot();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			execute = true;	
			String uname = unameEntry.getText();
			String pass = passEntry.getText();
			String targ = targetEntry.getText();
			String pages = pagesEntry.getText();
			Algo run = new Algo(uname, pass, targ, pages);
			connections = connections + Algo.count;
			connectLabel =  new JLabel(connections);
			panel.add(connectLabel);

	}
	
}
