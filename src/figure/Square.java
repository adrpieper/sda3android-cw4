package figure;

/**
 * Created by Adrian on 2017-03-01.
 */
public class Square implements Figure{
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double countArea(){
        return a * a;
    }

    public double countCircumference(){
        return a *4;
    }
}
