
package mycale_01;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MyCalc extends JFrame {
	
	private String exp = "";
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalc frame = new MyCalc();
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
	public MyCalc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 751, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.PLAIN, 15));
		textField.setText("0");
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setEditable(false);
		panel.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("Status");
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(4, 4, 10, 5));
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "7";
				textField.setText(exp);
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 15));
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_5 = new JButton("8");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "8";
				textField.setText(exp);
			}
		});
		btnNewButton_5.setFont(new Font("Dialog", Font.PLAIN, 15));
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton_4 = new JButton("9");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "9";
				textField.setText(exp);
			}
		});
		btnNewButton_4.setFont(new Font("Dialog", Font.PLAIN, 15));
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_6 = new JButton("/");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "/";
				textField.setText(exp);
			}
		});
		btnNewButton_6.setFont(new Font("Dialog", Font.PLAIN, 15));
		panel_2.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("4");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "4";
				textField.setText(exp);
			}
		});
		btnNewButton_7.setFont(new Font("Dialog", Font.PLAIN, 15));
		panel_2.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("5");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "5";
				textField.setText(exp);
			}
		});
		btnNewButton_8.setFont(new Font("Dialog", Font.PLAIN, 15));
		panel_2.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("6");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "6";
				textField.setText(exp);
			}
		});
		btnNewButton_9.setFont(new Font("Dialog", Font.PLAIN, 15));
		panel_2.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("X");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "*";
				textField.setText(exp);
			}
		});
		btnNewButton_10.setFont(new Font("Dialog", Font.PLAIN, 15));
		panel_2.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("1");
		btnNewButton_11.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "1";
				textField.setText(exp);
			}
		});
		panel_2.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("2");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "2";
				textField.setText(exp);
			}
		});
		btnNewButton_12.setFont(new Font("Dialog", Font.PLAIN, 15));
		panel_2.add(btnNewButton_12);
		
		JButton btnNewButton_3 = new JButton("3");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "3";
				textField.setText(exp);
			}
		});
		btnNewButton_3.setFont(new Font("Dialog", Font.PLAIN, 15));
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_13 = new JButton("-");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "-";
				textField.setText(exp);
			}
		});
		btnNewButton_13.setFont(new Font("Dialog", Font.PLAIN, 15));
		panel_2.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("0");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "0";
				textField.setText(exp);
			}
		});
		btnNewButton_14.setFont(new Font("Dialog", Font.PLAIN, 15));
		panel_2.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("C");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = "";
				textField.setText(exp);
			}
		});
		btnNewButton_15.setFont(new Font("Dialog", Font.PLAIN, 15));
		panel_2.add(btnNewButton_15);
		
		JButton btnNewButton_1 = new JButton("=");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String postfix = Infix2Postfix.convert(exp);
				double value = Calc.eval(postfix);
				textField.setText(String.valueOf(value));
			}
		});
		btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("+");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "+";
				textField.setText(exp);
			}
		});
		btnNewButton_2.setFont(new Font("Dialog", Font.PLAIN, 15));
		panel_2.add(btnNewButton_2);
	}

}
