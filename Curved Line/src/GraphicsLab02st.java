// GraphicsLab02st.java
// This is the student, starting version of the GraphicsLab02 assignment.


import java.awt.*;
import java.applet.*;


public class GraphicsLab02st extends Applet
{
	public void paint(Graphics g)
	{
		int width = 980;
		int height = 630;
		g.drawRect(10,10,width,height);	
		int x1 = 10;
		int y1 = 640;
		int x2 = 990;
		int y2 = 640;	
		
		for (x1 = 10; x1 < 990; x1 += 14) {
		g.drawLine(x1, y1, x2, y2);  
		 y2 -= 9; }
		
		
		x1 = 10;
		y1 = 10;
		x2 = 10;
		y2 = 640;
		
		for(y1 = 10; y1 < 640; y1 += 14) {
			g.drawLine(x1, y1, x2, y2);
			x2 += 22; }
		
		x1 = 10;
		y1 = 10;
		x2 = 10;
		y2 = 640;
		
		for (x1 = 10; x1 < 990; x1 += 14){
			g.drawLine(x1, y1, x2, y2);
			y2 -= 9 ;
		}
		x1 = 10;
		y1 = 640;
		x2 = 10;
		y2 = 10;
		
		for (y1 = 10; y1 < 640; y1 += 14){
			g.drawLine(x1, y1, x2, y2);
			x2 +=22 ;
	
		}
		
	    //MEMES
	    
	    
	    
		// Draw top-right corner
		
				
		// Draw top-left corner

	}}
	    
	    