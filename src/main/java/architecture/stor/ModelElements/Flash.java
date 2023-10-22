package architecture.stor.ModelElements;

public class Flash {
    public void rotate(Angele3D newAngle) {
        this.angele = newAngle;
    }

    public void move(Point3D newLocation) {
        this.location = newLocation;
    }

    //endregion


    //region Constructors

    public Flash(Point3D location, Angele3D angele, Color color, double power) {
        this.location = location;
        this.angele = angele;
        this.color = color;
        this.power = power;
    }

    public Flash(Point3D location, Angele3D angle, double power) {
        this.location = location;
        this.angele = angele;
        this.power = power;
    }

    //endregion


    //region Public Properties

    public Point3D getLocation() {
        return location;
    }

    public Angele3D getAngle() {
        return angele;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    //endregion


    //region Private Fields

    private Point3D location;
    private Angele3D angele;
    private Color color;
    private double power;

    //endregion

}
