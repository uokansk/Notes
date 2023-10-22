package architecture.stor.ModelElements;

import java.util.Collection;

public class Poligon {

    public Poligon(Collection<Point3D> points) {
        this.points = points;
    }

    public Collection<Point3D> getPoints() {
        return points;
    }


    private Collection<Point3D> points;

    public Poligon(){}


}
