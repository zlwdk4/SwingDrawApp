import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MyCanvas extends JPanel implements MouseMotionListener, MouseListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = -97877940086810319L;
	
	private int oldX,oldY, newX, newY;
	
	
	public MyCanvas() {
        addMouseMotionListener(this);
        addMouseListener(this);
    }
	
	// This method is responsible for painting the component.
    public void paintComponent(Graphics g) {
        // This will repaint the background
        // Java uses double buffering by default so the following call
        // repaints the off screen buffer.
        super.paintComponent(g);

        // Draw the last oval recorded
        //g.drawOval(x, y, 70, 70);
        //g.drawLine(oldX, oldY, oldX + 10, oldY + 10);


        Graphics2D g2d = (Graphics2D) g;

        BasicStroke bs = new BasicStroke (20.0F, BasicStroke.CAP_ROUND, 
            BasicStroke.JOIN_BEVEL);
        g2d.setStroke(bs);
    }

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		newX = e.getX();
		newY = e.getY();
		
		Graphics g = getGraphics();
		g.drawLine(oldX, oldY, newX, newY);
		
		oldX = newX;
		oldY = newY;
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		oldX = e.getX();
		oldY = e.getY();
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	

}
