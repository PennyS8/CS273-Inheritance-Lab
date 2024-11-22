
/**
 * CenteredPolygon - A specialized subclass of Polygon2 designed for
 * creating and positioning polygons centered relative to a bounding box.
 * 
 * Features:
 *   A crescentPercent contructor defines this object as a CenteredPolygon when the 
 *      constructor is called with a double (as opposed to a Polygon2)
 *   
 *   An @Override for the Polygon2 fitIn method that uses the center of the polygon
 *      instead of the top left like a Polygon2 does
 *
 * @author Penny Silliman
 * @version 11/20/24
 */
public class CenteredPolygon extends Polygon2
{
    public CenteredPolygon(double crescentPercent){
        super(crescentPercent); // Initialize a crescent-shaped polygon
    }
    
    /**
     * @param left      The x-coordinate of the rectangle's left edge
     * @param top       The y-coordinate of the rectangle's top edge.
     * @param width     The width of the bounding rectangle.
     * @param height    The height of the bounding rectangle.
     * @return A new Polygon2 object scaled and positioned inside the rectangle.
     */
    @Override
    public Polygon2 fitIn(int left, int top, int width, int height){
        // Adjust the bounding box coordinates to ensure centering
        Polygon2 p = super.fitIn(left-(width/2), top-(height/2), width, height);
        return p;
    }
}
