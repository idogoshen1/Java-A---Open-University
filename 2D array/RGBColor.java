package RGBColor;


/**
 * Write a description of class RGBColor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RGBColor
{
     private final int MAX_COLOR=255;
    private int red;
    private int green;
    private int blue;
    
    public RGBColor () {
        this.red = 0;
        this.green = 0;
        this.blue = 0;
    }
    
    public RGBColor(int red, int green, int blue) {
        if (red < 0 || red > 255 || green < 0 
            || green > 255 || blue < 0 ||blue > 255) {
        this.red = 0;
        this.green = 0;
        this.blue = 0;
        }
        else {
        this.red = red;
        this.green = green;
        this.blue = blue;
        }
    }
    
    public RGBColor(RGBColor other) {
        this.red = other.red;
        this.green = other.green;
        this.blue = other.blue;
    }
        
    public int getRed() {
        return this.red;
    }
    
    public int getGreen() {
      return this.green;
    }
    
    public int getBlue() {
        return this.blue;
    }
    
    public void setRed(int r) {
        this.red= r;
    }
    
    public void setGreen( int g) {
        this.green = g;
    }
    
    public void setBlue( int b) {
        this.blue = b;
    }
    
    public String toString() {
        return "("  + this.red + " , " +   this.green
            + " , "  +  this.blue + ")";
    }
    
    public boolean equals (RGBColor other) {
        return this.red== other.red && this.green==
            other.green && this.blue == other.blue; 
    }
    
    public void mix(RGBColor other) {
        this.red =  (this.red+ other.red)/2;
        this.green = (this.green+ other.green)/2;
        this.blue =  (this.blue+ other.blue)/2;
    }
    
    public double convertToGrayscale() {
        return this.red*0.3 + this.green*0.59 + this.blue*0.11;
    }
    
    public void  invert() {
        this.red= MAX_COLOR- this.red;
        this.green= MAX_COLOR- this.green;
        this.blue = MAX_COLOR - this.blue;
    }
        
}
