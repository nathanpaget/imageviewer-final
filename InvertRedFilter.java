import java.awt.Color;

/**
 * An image filter to remove color from an image.
 * 
 * @author Michael Kölling and David J. Barnes.
 * @version 1.0
 */
public class InvertRedFilter extends Filter
{
	/**
	 * Constructor for objects of class GrayScaleFilter.
	 * @param name The name of the filter.
	 */
	public InvertRedFilter(String name)
    {
        super(name);
	}

    /**
     * Apply this filter to an image.
     * 
     * @param  image  The image to be changed by this filter.
     */
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                Color pix = image.getPixel(x, y);
                int red=pix.getRed();
                int green=pix.getGreen();
                int blue=pix.getBlue();
                
                image.setPixel(x, y, new Color((255-red), green, blue));
            }
        }
    }
}
