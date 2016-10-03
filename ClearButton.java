import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ClearButton extends JButton implements ActionListener{

	ClearButton(){
		super("CLEAR");
		addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		App.clearTheDrawings();
	}

}
