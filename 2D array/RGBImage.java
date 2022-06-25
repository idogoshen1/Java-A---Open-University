package RGBColor;


/**
 * Write a description of class RGBImage here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RGBImage
{
   private RGBColor [][] _image;
        
    public RGBImage(int rows, int cols) {
      _image = new RGBColor[rows][cols];
        for(int i=0; i<rows; i++) {
            for(int j =0; j<cols; j++) {
              _image[i][j]=new RGBColor();
            }
        }
    }
    
    public RGBImage(RGBColor[][] pixel) {
      _image=new RGBColor[pixel.length][pixel[0].length];
        for(int i=0; i<_image.length; i++) {
            for(int j=0; j<_image[0].length;j++) {
                 _image[i][j]=new RGBColor(pixel[i][j]);
            }
        }
    }
    
    public RGBImage(RGBImage other) {
        this(other._image);
                
   }
    
    public int getHeight() {
        return _image.length;
    }
    
    public int getWidth() {
        return _image[0].length;
    }
    
    public RGBColor getPixel(int row, int col) {
        if(row>0 && row<_image.length && col>0 && col<_image[0].length)
            return new RGBColor(_image[row][col]);
        return new RGBColor();
    }
    
    public void setPixel(int row, int col, RGBColor pixel) {
       _image[row][col]= new RGBColor(pixel);
    }
    
    public boolean equals (RGBImage other) {
        if(getWidth()!= other.getWidth() || getHeight()!= other.getHeight()) {
            return false;
        }
        for (int i =0; i<_image.length; i++) {
            for(int j=0; j<_image[0].length; j++) {
                if(!(_image[i][j].equals(other._image[i][j]))) {
                    return false;
                }
            }            
        }            
                
        return true;
    }       
         
            
    public void vertical() {
        for(int i = 0; i<_image.length/2; i++) {
        RGBColor [] temp = _image[i];
        _image[i] =  _image[_image.length-i-1];
        _image[_image.length-i-1] = temp;
        }
    }
    
    public void flipHorizontal() {
        for(int i = 0; i<_image.length; i++) {
            for(int j = 0; j<_image[i].length; j++) {
            RGBColor temp =_image[i][j];
            _image[i][j] = _image[i][_image.length-j-1];
            _image[i][_image[i].length-j-1] = temp;
            }
        }
    }
    
    public void invertColors() {
        for(int i=0; i<_image.length; i ++) {
            for(int j=0; j<_image[0].length; j++) {
                _image[i][j].invert();
            }
        }
    }
    
    public String toString() {
        String str="";
        for(int i = 0; i<_image.length; i++) {
            for(int j = 0; j<_image[0].length; j++) {
                 str+= _image[i][j].toString() + " "; 
            }  
            str+= "\n";
        }
        return str; 
    }

    public double [][] toGrayscaleArray() {
        double [][] d = new double [_image.length][_image[0].length];
        for(int i =0; i<_image.length; i++) {
            for(int j = 0; j<_image[0].length; j++) {
                d[i][j] = _image[i][j].convertToGrayscale();
            }
        }
        return d;
    }
    
    public RGBColor[][] toRGBColorArray() {
        RGBColor[][] d = new RGBColor [_image.length][_image[0].length];
        for(int i = 0; i<_image.length; i++) {
            for(int j = 0; j<_image[0].length; j++) {
                d[i][j] = new RGBColor(_image[i][j]);
            }
        }
        return d;
    }
}