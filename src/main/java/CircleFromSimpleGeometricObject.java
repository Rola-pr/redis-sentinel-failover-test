/**
 * @author peirongzhang
 */
public class CircleFromSimpleGeometricObject extends SimpleGeometricObject{
    private double raidus;

    public CircleFromSimpleGeometricObject(String color, boolean filled){
        super(color,filled);
    }



    /** Return radius */
    public double getRadius(){
        return raidus;
    }

    /** Set a new radius */
    public void setRaidus(double raidus){
        this.raidus = raidus;
    }

    /** Return area */
    public double getArea(){
        return raidus * raidus * Math.PI;
    }

    /** Return diameter */
    public double getDiameters(){
        return 2 * raidus;
    }

    /** Return perimeter */
    public double getPerimeter(){
        return 2 * raidus * Math.PI;
    }

    /** Print the circle info */
    public void printCircle(){
        System.out.println("The circle is created " + getDateCreated() +
                " and the radius is " + raidus);
    }
}
