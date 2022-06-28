package _02_array_list_guestbook;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuestBook implements ActionListener{
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	JFrame frame = new JFrame("Guest Book");
	JPanel panel = new JPanel();
	JButton addNamesButton = new JButton("Add Name");
	JButton viewNamesButton = new JButton("View Names");
	JTextField txtInput = new JTextField("Add Guest here.", 10);
	JLabel label = new JLabel();
	ArrayList<String> arrList = new ArrayList<String>();
	
	public void run() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		addNamesButton.addActionListener(this);
		viewNamesButton.addActionListener(this);
		
		//txtInput.setBackground(Color.);
		panel.add(txtInput);
		panel.add(addNamesButton);
		panel.add(viewNamesButton);
		frame.add(panel);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		
		if(buttonPressed == addNamesButton ) {
			arrList.add(txtInput.getText());
			txtInput.setText("Add another guest");
		} else if (buttonPressed == viewNamesButton) {
			JOptionPane.showMessageDialog(null, "Guest list: " + arrList.toString(), "Names in list", JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
	
}
