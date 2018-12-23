package Practice3;

public class Square extends Rectangle {
    public Square() {
        color = "black";
        filled = false;
        width = 1;
        length = 1;
    }

    public Square (double side) {
        color = "black";
        filled = false;
        width = side;
        length = side;
    }

    public Square (double side, String color, boolean filled) {
        width = side;
        length = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        width = side;
        length = side;
    }

    public void setWidth (double side) {
        width = side;
    }

    public void setLength(double side) {
        length = side;
    }

    public String toString() {
        return "Shape: rectangle, side: " + width + ", color: " + color;
    }
}
