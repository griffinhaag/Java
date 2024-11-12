package shapeProcess;

import shapePack.Square;
import shapePack.SemiCircle;

public class ShapeExecute {
    public static void main(String[] args) {
        Square square = new Square();
        SemiCircle semicircle = new SemiCircle();

        // Using square object to call methods
        square.printSquare();
        square.printRectangle();
        square.printShape();

        // Using semicircle object to call methods
        semicircle.printSemiCircle();
        semicircle.printCircle();
        semicircle.printShape();
    }
}
