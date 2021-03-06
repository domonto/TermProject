package tr.edu.ieu.se360;

public class Acquisition {

    private String image_type;
    private float pixelsX;
    private float pixelsY;

    public String getImage_type() {
        return image_type;
    }

    public void setImage_type(String image_type) {
        this.image_type = image_type;
    }

    public float getPixelsX() {
        return pixelsX;
    }

    public void setPixelsX(float pixelsX) {
        this.pixelsX = pixelsX;
    }

    public float getPixelsY() {
        return pixelsY;
    }

    public void setPixelsY(float pixelsY) {
        this.pixelsY = pixelsY;
    }

    public String toString() {
        return "Image Type : " + getImage_type() +
                "\nPixels X : " + getPixelsX() +
                "\nPixels Y :  " + getPixelsY();
    }
}
