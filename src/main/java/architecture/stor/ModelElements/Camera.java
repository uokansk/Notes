package architecture.stor.ModelElements;

public class Camera {
    public void rotate(Angele3D newAngle) {
        this.angle = newAngle;
    }

    public void move(Point3D newLocation) {
        this.location = newLocation;
    }

    //endregion


    //region Constructors

    public Camera(Point3D location, Angele3D angle) {
        this.location = location;
        this.angle = angle;
    }

    //endregion


    //region Public Properties

    public Point3D getLocation() {
        return location;
    }

    public Angele3D getAngle() {
        return angle;
    }

    //endregion


    //region Private Fields

    private Point3D location;
    private Angele3D angle;

    //endregion


}
