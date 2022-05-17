package Interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFormattedTextField;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double firstnum;
    double result;
    String operation;
    double answer;
    private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 235, 205));
		frame.setBounds(100, 100, 477, 589);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField();
		textField.setBounds(10, 75, 430, 76);
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField.setFont(new Font("Arial", Font.BOLD, 23));
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(10, 188, 70, 70);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setBackground(Color.LIGHT_GRAY);
		btn7.setForeground(Color.BLACK);
		btn7.setFont(new Font("Arial", Font.BOLD, 25));
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(10, 256, 70, 70);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setForeground(Color.BLACK);
		btn4.setFont(new Font("Arial", Font.BOLD, 25));
		btn4.setBackground(Color.LIGHT_GRAY);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(10, 325, 70, 70);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setForeground(Color.BLACK);
		btn1.setFont(new Font("Arial", Font.BOLD, 25));
		btn1.setBackground(Color.LIGHT_GRAY);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(77, 188, 70, 70);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setForeground(Color.BLACK);
		btn8.setFont(new Font("Arial", Font.BOLD, 25));
		btn8.setBackground(Color.LIGHT_GRAY);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(146, 188, 70, 70);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setForeground(Color.BLACK);
		btn9.setFont(new Font("Arial", Font.BOLD, 25));
		btn9.setBackground(Color.LIGHT_GRAY);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(77, 256, 70, 70);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setForeground(Color.BLACK);
		btn5.setFont(new Font("Arial", Font.BOLD, 25));
		btn5.setBackground(Color.LIGHT_GRAY);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(146, 256, 70, 70);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setForeground(Color.BLACK);
		btn6.setFont(new Font("Arial", Font.BOLD, 25));
		btn6.setBackground(Color.LIGHT_GRAY);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(77, 325, 70, 70);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setForeground(Color.BLACK);
		btn2.setFont(new Font("Arial", Font.BOLD, 25));
		btn2.setBackground(Color.LIGHT_GRAY);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(146, 325, 70, 70);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setForeground(Color.BLACK);
		btn3.setFont(new Font("Arial", Font.BOLD, 25));
		btn3.setBackground(Color.LIGHT_GRAY);
		
		JButton btnZero = new JButton("0");
		btnZero.setBounds(10, 392, 70, 70);
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnZero.getText();
				textField.setText(number);
			}
		});
		btnZero.setForeground(Color.BLACK);
		btnZero.setFont(new Font("Arial", Font.BOLD, 25));
		btnZero.setBackground(Color.LIGHT_GRAY);
		
		JButton btnPoint = new JButton(".");
		btnPoint.setBounds(77, 392, 70, 70);
		btnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnPoint.getText();
				textField.setText(number);
			}
		});
		btnPoint.setForeground(Color.BLACK);
		btnPoint.setFont(new Font("Arial", Font.BOLD, 25));
		btnPoint.setBackground(Color.LIGHT_GRAY);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setBounds(146, 392, 70, 70);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operation=="+") {
					answer = firstnum + Double.parseDouble(textField.getText());
					textField.setText(Double.toString(answer));
				}
				
				else if (operation=="-"){
					answer = firstnum - Double.parseDouble(textField.getText());
					textField.setText(Double.toString(answer));
				}
				
				else if (operation=="*") {
					answer = firstnum * Double.parseDouble(textField.getText());
					textField.setText(Double.toString(answer));
				}
				
				else if (operation=="/") {
					double secondnum = Double.parseDouble(textField.getText());
					if (secondnum == 0.0) {
						try {
							throw new ArithmeticException("Demo");
						}
						
						catch(ArithmeticException ex){
							JOptionPane.showMessageDialog(btnEqual, "Can't devided by zero...");
						}
					}
					
					else {
						answer = firstnum /secondnum;
						textField.setText(Double.toString(answer));
					}
						
				}
			}
		});
		btnEqual.setForeground(Color.BLACK);
		btnEqual.setFont(new Font("Arial", Font.BOLD, 25));
		btnEqual.setBackground(Color.LIGHT_GRAY);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setBounds(213, 188, 70, 70);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					firstnum = Double.parseDouble(textField.getText());
					textField.setText("");
					operation = "+";
				}
				
				catch(NumberFormatException ex){
					JOptionPane.showMessageDialog(btnAdd, "No numbers to add...");
				}
					
				
			}
		});
		btnAdd.setForeground(Color.BLACK);
		btnAdd.setFont(new Font("Arial", Font.BOLD, 25));
		btnAdd.setBackground(Color.LIGHT_GRAY);
		
		JButton btnSubtract = new JButton("-");
		btnSubtract.setBounds(213, 256, 70, 70);
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					firstnum = Double.parseDouble(textField.getText());
					textField.setText("");
					operation = "-";
				}
				
				catch(NumberFormatException ex) {
					JOptionPane.showMessageDialog(btnSubtract, "No numbers to substrct...");
				}
				
			}
		});
		btnSubtract.setForeground(Color.BLACK);
		btnSubtract.setFont(new Font("Arial", Font.BOLD, 25));
		btnSubtract.setBackground(Color.LIGHT_GRAY);
		
		JButton btnmultiply = new JButton("*");
		btnmultiply.setBounds(213, 325, 70, 70);
		btnmultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					firstnum = Double.parseDouble(textField.getText());
					textField.setText("");
					operation = "*";
				}
				
				catch(NumberFormatException ex){
					JOptionPane.showMessageDialog(btnmultiply, "No numbers to mutiply..");
				}
				
			}
		});
		btnmultiply.setForeground(Color.BLACK);
		btnmultiply.setFont(new Font("Arial", Font.BOLD, 25));
		btnmultiply.setBackground(Color.LIGHT_GRAY);
		
		JButton btndevide = new JButton("/");
		btndevide.setBounds(213, 392, 70, 70);
		btndevide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					firstnum = Double.parseDouble(textField.getText());
					textField.setText("");
					operation = "/";
				}
				
				catch(NumberFormatException ex) {
					JOptionPane.showMessageDialog(btndevide, "No numbers to devide...");
				}
				
					
				
			}
		});
		btndevide.setForeground(Color.BLACK);
		btndevide.setFont(new Font("Arial", Font.BOLD, 25));
		btndevide.setBackground(Color.LIGHT_GRAY);
		
		JButton btnDelete = new JButton("DEL");
		btnDelete.setBounds(326, 188, 114, 70);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String delete = null;
				if (textField.getText().length()>0) {
					StringBuilder s = new StringBuilder(textField.getText());
					s.deleteCharAt(textField.getText().length()-1);
					delete = s.toString();
					textField.setText(delete);
				}
				
				else {
					JOptionPane.showMessageDialog(btnDelete, "No numbers to delete..",delete, JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnDelete.setForeground(new Color(128, 0, 0));
		btnDelete.setFont(new Font("Arial", Font.BOLD, 25));
		btnDelete.setBackground(new Color(51, 255, 102));
		
		JButton btnClear = new JButton("AC");
		btnClear.setBounds(326, 341, 114, 70);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().length()>0) {
					textField.setText("");
				}
				
				else {
					JOptionPane.showMessageDialog(btnClear, "No numbers to clear...",operation, JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnClear.setForeground(new Color(128, 0, 0));
		btnClear.setFont(new Font("Arial", Font.BOLD, 25));
		btnClear.setBackground(new Color(51, 255, 102));
		
		JRadioButton rdbtnOFF = new JRadioButton("OFF");
		buttonGroup.add(rdbtnOFF);
		rdbtnOFF.setBounds(337, 487, 103, 48);
		rdbtnOFF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setEnabled(false);
				btnZero.setEnabled(false);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btnPoint.setEnabled(false);
				btnEqual.setEnabled(false);
				btnAdd.setEnabled(false);
				btnSubtract.setEnabled(false);
				btnmultiply.setEnabled(false);
				btndevide.setEnabled(false);
				btnDelete.setEnabled(false);
				btnClear.setEnabled(false);
				
				
			}
		});
		rdbtnOFF.setFont(new Font("Arial", Font.BOLD, 22));
		rdbtnOFF.setForeground(new Color(0, 0, 0));
		rdbtnOFF.setBackground(new Color(255, 0, 0));
		
		JRadioButton rdbtnON = new JRadioButton("ON");
		buttonGroup.add(rdbtnON);
		rdbtnON.setBounds(10, 487, 103, 48);
		rdbtnON.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setEnabled(true);
				btnZero.setEnabled(true);
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btnPoint.setEnabled(true);
				btnEqual.setEnabled(true);
				btnAdd.setEnabled(true);
				btnSubtract.setEnabled(true);
				btnmultiply.setEnabled(true);
				btndevide.setEnabled(true);
				btnDelete.setEnabled(true);
				btnClear.setEnabled(true);
			}
		});
		rdbtnON.setForeground(Color.BLACK);
		rdbtnON.setFont(new Font("Arial", Font.BOLD, 22));
		rdbtnON.setBackground(Color.RED);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(textField);
		frame.getContentPane().add(btn7);
		frame.getContentPane().add(btn4);
		frame.getContentPane().add(btn1);
		frame.getContentPane().add(btn8);
		frame.getContentPane().add(btn9);
		frame.getContentPane().add(btn5);
		frame.getContentPane().add(btn6);
		frame.getContentPane().add(btn2);
		frame.getContentPane().add(btn3);
		frame.getContentPane().add(btnZero);
		frame.getContentPane().add(btnPoint);
		frame.getContentPane().add(btnEqual);
		frame.getContentPane().add(btnAdd);
		frame.getContentPane().add(btnSubtract);
		frame.getContentPane().add(btnmultiply);
		frame.getContentPane().add(btndevide);
		frame.getContentPane().add(btnDelete);
		frame.getContentPane().add(btnClear);
		frame.getContentPane().add(rdbtnOFF);
		frame.getContentPane().add(rdbtnON);
		
		JLabel lblInfo = new JLabel("Operate 2 numbers");
		lblInfo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 22));
		lblInfo.setBounds(257, 0, 206, 36);
		frame.getContentPane().add(lblInfo);
	}
}
