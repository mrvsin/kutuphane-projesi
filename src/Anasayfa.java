import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;

public class Anasayfa extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Anasayfa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Ödünç Ver");
		btnNewButton.setBackground(new Color(128, 128, 128));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Odunc odunc = new Odunc();
				odunc.setVisible(true);
			}
		});
		
		JButton btnNewButton_1 = new JButton("İade ");
		btnNewButton_1.setBackground(new Color(128, 128, 128));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iade ıade = new iade();
				ıade.setVisible(true);
			}
		});
		
		JButton btnNewButton_2 = new JButton("Üye Ol");
		btnNewButton_2.setBackground(new Color(128, 128, 128));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uyeOl uyeol = new uyeOl();
				uyeol.setVisible(true);
			}
		});
		
		JButton btnNewButton_3 = new JButton("Kitap Ekle");
		btnNewButton_3.setBackground(new Color(128, 128, 128));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekleCikar eklecikar = new ekleCikar();
				eklecikar.setVisible(true);
			}
		});
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(156)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
						.addComponent(btnNewButton_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
						.addComponent(btnNewButton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
						.addComponent(btnNewButton_3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
					.addGap(167))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(50)
					.addComponent(btnNewButton)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_3)
					.addContainerGap(101, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
