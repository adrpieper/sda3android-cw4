package figure;

/**
 * Created by Adrian on 2017-03-01.
 */
public class Circle {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double countArea(){
        return r * r * Math.PI;
    }

    public double countCircumference(){
        return 2 * Math.PI * r ;
    }
}
