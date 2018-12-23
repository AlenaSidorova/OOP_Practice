package Practice1;

public class Ball {
    private String  color;
    private int     diameter;

    public Ball(String color, int diameter)
    {
        this.color = color;
        this.diameter = diameter;
    }
    public Ball(){}

    public String getColor() {
        return color;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Color: " + color + "\n" + "Diameter: " + diameter + "\n";
    }
}
