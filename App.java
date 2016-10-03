import java.awt.Graphics;

import javax.swing.JFrame;

public class App {

	private static JFrame frame;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frame = new DrawFrame();
        // The window size is set in the constructor for DrawFrame
        frame.setVisible(true);
	}

	public static void clearTheDrawings() {
		
		Graphics g = frame.getGraphics();
		g.clearRect(0, 0, 600, 400);
		frame.repaint();
		
		
		/*
		System.out.println("clearing");
		frame.dispose();
		frame = new DrawFrame();
		frame.setVisible(true);
		*/
	}

}
