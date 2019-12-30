package exercise21;

import java.util.Date;


public abstract class GeometricObject {
    // fields
    private String color;
    private boolean filled;
    private Date dateCreated;

    // constructors
    public GeometricObject() {
        this("white", false);
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }

    // getters
    public String getColor() {
        return color;
    }

    // setters
    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return getArea() + "";

    }
}

