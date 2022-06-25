package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
	JTextField txtInput = new JTextField(10);
	JLabel label = new JLabel();
	ArrayList<String> arrList = new ArrayList<String>();
	
	public void run() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		
		if(buttonPressed == addNamesButton ) {
			label.add(txtInput);
		} else if (buttonPressed == viewNamesButton) {
			label.add(arrList.iterator());
		}
		
	}
	
}
