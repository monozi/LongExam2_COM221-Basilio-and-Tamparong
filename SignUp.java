import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SignUp{

	JFrame frame;
	private JTextField textUsernameField;
	private JTextField textEmailSignUp;
	private JPasswordField passwordField;

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp window = new SignUp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public SignUp() {
		initialize();
	}

//To be used for checkbox checking later if user wants to show password or not.	
private	boolean passwordVisible = false;

	private void initialize() {
			
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(9, 9, 9));
		frame.getContentPane().setLayout(null);
		
		JLabel lblIUserNameLabel = new JLabel("Username");
		lblIUserNameLabel.setFont(new Font("Fira Code", Font.BOLD, 14));
		lblIUserNameLabel.setForeground(new Color(255, 255, 255));
		lblIUserNameLabel.setBounds(184, 155, 109, 14);
		frame.getContentPane().add(lblIUserNameLabel);
		
		textUsernameField = new JTextField();
		textUsernameField.setBounds(184, 172, 206, 20);
		frame.getContentPane().add(textUsernameField);
		textUsernameField.setColumns(10);
		
		JLabel lblEmailSignUp = new JLabel("Email");
		lblEmailSignUp.setForeground(Color.WHITE);
		lblEmailSignUp.setFont(new Font("Fira Code", Font.BOLD, 14));
		lblEmailSignUp.setBounds(184, 203, 109, 14);
		frame.getContentPane().add(lblEmailSignUp);
		
		textEmailSignUp = new JTextField();
		textEmailSignUp.setColumns(10);
		textEmailSignUp.setBounds(184, 220, 206, 20);
		frame.getContentPane().add(textEmailSignUp);
		
		JLabel lblPasswordSignUp = new JLabel("Password");
		lblPasswordSignUp.setForeground(Color.WHITE);
		lblPasswordSignUp.setFont(new Font("Fira Code", Font.BOLD, 14));
		lblPasswordSignUp.setBounds(184, 251, 109, 14);
		frame.getContentPane().add(lblPasswordSignUp);
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.setFont(new Font("Fira Code", Font.BOLD, 12));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Registration Successfully! \nWelcome to GitHub");
				LoginPage window = new LoginPage();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setBackground(new Color(0, 166, 0));
		btnNewButton.setBounds(184, 310, 206, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.setFont(new Font("Fira Code", Font.BOLD, 12));
		btnSignIn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginPage window = new LoginPage();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnSignIn.setBackground(new Color(192, 192, 192));
		btnSignIn.setBounds(184, 369, 206, 23);
		frame.getContentPane().add(btnSignIn);
		
		JLabel lblWithAccount = new JLabel("Already have an Account?");
		lblWithAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblWithAccount.setForeground(new Color(255, 255, 255));
		lblWithAccount.setFont(new Font("Fira Code", Font.BOLD, 12));
		lblWithAccount.setBounds(184, 355, 206, 14);
		frame.getContentPane().add(lblWithAccount);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(184, 268, 188, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel lblSignUp = new JLabel("Welcome to GitHub!");
		lblSignUp.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignUp.setForeground(Color.WHITE);
		lblSignUp.setFont(new Font("Fira Code", Font.BOLD, 15));
		lblSignUp.setBounds(184, 124, 206, 20);
		frame.getContentPane().add(lblSignUp);
		
		JRadioButton rdbtnShowPass = new JRadioButton("");
		rdbtnShowPass.setBackground(new Color(255, 255, 255));
		rdbtnShowPass.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				        passwordVisible = !passwordVisible;
				        passwordField.setEchoChar(passwordVisible ? '\u0000' : '\u2022');
				    }
				});
		rdbtnShowPass.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnShowPass.setBounds(370, 268, 20, 20);
		frame.getContentPane().add(rdbtnShowPass);

		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblGitHub = new JLabel("New label");
		Image img = new ImageIcon(this.getClass().getResource("SMALLGITHUB.jpg")).getImage();
		lblGitHub.setIcon(new ImageIcon(img));
		Dimension size = lblGitHub.getPreferredSize();
		lblGitHub.setBounds(27, 0, 415, 579);
		frame.getContentPane().add(lblGitHub);
	}
}
