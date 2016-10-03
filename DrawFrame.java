import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


import javax.swing.JFrame;

public class DrawFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6767569465332593561L;
	
	
	public DrawFrame() 
	{
		setTitle("Sketch App!");
		setSize(600, 400);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
		Container contentPane = getContentPane();
		
		MyCanvas drawingCanvas = new MyCanvas();
        contentPane.add(drawingCanvas, BorderLayout.CENTER);
        
        ClearButton cb = new ClearButton();
        contentPane.add(cb, BorderLayout.SOUTH);
		
	}


	
}
