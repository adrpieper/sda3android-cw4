package figure;

import static java.lang.Math.*;

/**
 * Created by Adrian on 2017-03-01.
 */
public class Circle implements Figure {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double countArea(){
        return r * r * PI;
    }

    public double countCircumference(){
        return 2 * PI * r ;
    }
}
