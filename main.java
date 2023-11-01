
import src.*;

public class Main {
    
    public static void main(String[] args) {
        LinearRegression lr = new LinearRegression();

        lr.calculateBeta0();
        lr.calculateBeta1();
        lr.calculateError();
        lr.calculateYHat();

        System.out.println(lr.toString());
    }

}