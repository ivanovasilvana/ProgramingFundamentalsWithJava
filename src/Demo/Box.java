package Demo;

public class Box {
    private double height;
    private double width;
    private double length;

    public Box(double height, double width, double length) {
        this.setHeight(height);
        this.setLength(length);
        this.setWidth(width);
    }

    private void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
    }

    private void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    private void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    //2lw + 2lh + 2wh
    public double calculateSurfaceArea() {
        return 2 * this.length * this.width + 2 * this.length * this.height + 2 * this.width * this.height;
    }

    public double calculateSurfaceVolume() {
        return this.length * this.width * this.height;
    }

    //2lh + 2wh
    public double calculateLateralSurfaceArea() {
        return 2 * this.length * this.height + 2 * this.width * this.height;
    }


}
