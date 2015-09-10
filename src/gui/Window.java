package gui;

import javax.swing.JFrame;

public class Window extends JFrame {

	private static final long serialVersionUID = 6597860673300167621L;

	public Window() {
		
		this.setTitle("Opzioni");
		this.setSize(500, 500);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ServicePanel panel=new ServicePanel();
		this.setContentPane(panel);
		this.pack();
		this.setVisible(true);

	}
}
