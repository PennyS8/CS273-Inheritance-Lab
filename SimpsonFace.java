////////////////////////////////////////////////////////
// SimpsonFace.java - a face that knows how to draw itself. 
// At the start, it is a placeholder that needs to be updated
// to look like a Simpson face. 
////////////////////////////////////////////////////////

import java.awt.*;

public class SimpsonFace extends Face {
    public SimpsonFace(int w, int h) {
        super((int)(w*0.75), (int)(h*1.25));
    }
    
    @Override
    protected Color mouthColor(){
        return new Color(0, 0, 0);
    }
    
    protected Polygon2 createMouth(){
        Polygon2 mouth = new CenteredPolygon(20.0);
        // mouth = mouth.fitIn(pixelX(50-(70/2)), pixelY(75-(20/2)), distX(70), distY(20));
        mouth = mouth.fitIn(pixelX(50), pixelY(75), distX(70), distY(20));
        return mouth;
    }
    
    protected void drawMouth(Graphics g){
        g.setColor(this.mouthColor());
        Polygon2 mouth = this.createMouth();
        g.fillPolygon(mouth);
        return;
    }
}
