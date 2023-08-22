package notepadProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import java.awt.Button;

public class notepd extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					notepd frame = new notepd();
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
	public notepd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1041, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
		
		JButton btnNewButton = new JButton("Ac");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JPanel buttonPanel = new JPanel( new GridLayout(0, 3, 6, 5) );
	    buttonPanel.setBorder( new EmptyBorder(338, 233, 0, 0) );

	    buttonPanel.setOpaque( false );


	    //for (int i = 0; i < 7; i++)
	    {
	        JButton button = new JButton("Button");
	        JButton button1 = new JButton("Button");
	        JButton button2 = new JButton("Button");
	        JButton button3 = new JButton("Button");
	        JButton button4 = new JButton("Button");
	        JButton button5 = new JButton("Button");

	        button.setPreferredSize( new Dimension(160, 45) );
	        buttonPanel.add(button);
	        buttonPanel.add(button1);
	        buttonPanel.add(button2);
	        buttonPanel.add(button3);
	        buttonPanel.add(button4);
	        buttonPanel.add(button5);

	         button.addActionListener(new Action());
	    }
		
		JButton btnNewButton_1 = new JButton("Kapat");
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Kaydet");
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Farkl\u0131 Kaydet");
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Bul");
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Geri Al");
		contentPane.add(btnNewButton_5);
		
		textField = new JTextField();
		contentPane.add(textField);
		textField.setColumns(10);
	}

}
