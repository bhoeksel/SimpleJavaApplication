package me.bhoeksel.com;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class WindowsBuilder extends JFrame {

	private JPanel contentPane;
	private JTextField txtAddNameHere;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowsBuilder frame = new WindowsBuilder();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WindowsBuilder() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this.setTitle("Welcome Message");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Submit!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String userText = txtAddNameHere.getText();
				lblNewLabel.setText("Hi " + userText + "!");
			}
		});
		btnNewButton.setBounds(156, 65, 89, 23);
		contentPane.add(btnNewButton);
		
		txtAddNameHere = new JTextField();
		txtAddNameHere.setText("Add name here");
		txtAddNameHere.setBounds(115, 8, 210, 20);
		contentPane.add(txtAddNameHere);
		txtAddNameHere.setColumns(10);
		
		JLabel lblEnterYourName = new JLabel("Enter Your Name:");
		lblEnterYourName.setBounds(10, 11, 112, 14);
		contentPane.add(lblEnterYourName);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(26, 127, 372, 105);
		contentPane.add(lblNewLabel);
	}
}
