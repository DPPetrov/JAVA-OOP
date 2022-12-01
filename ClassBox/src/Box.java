public class Box {

    private double width;
    private double length;
    private double height;

    public Box(double width, double length, double height) {
        setWidth(width);
        setHeight(height);
        setLength(length);
    }

    public void setWidth(double width) {
        if (width <= 0){

            throw new  IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    public void setLength(double length) {

        if (length <= 0){

            throw new  IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    public void setHeight(double height) {
        if (height <= 0){

            throw new  IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
    }

    public double calculateSurfaceArea(){

        return 2 * width * length + 2 * length * height + 2 * width * height;
    }

    public double calculateLateralSurfaceArea () {

        return 2 * length * height + 2 * width * height;
    }

    public double calculateVolume () {

        return width * height * length;
    }


}
