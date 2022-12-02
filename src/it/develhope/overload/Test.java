package it.develhope.overload;

public class Test {
    public static void main(String[] args) {

        Shape undefined = new Shape();
        Shape circle = new Shape(6.2);
        Shape square = new Shape(4, 12.5);
        Shape rectangle = new Shape(4,10.5,12);
        Shape triangle = new Shape(3,9,5.5,7);

        String shapeUndefined = undefined.getShapeDetails();
        String shapeCircle = circle.getShapeDetails();
        String shapeSquare = square.getShapeDetails();
        String shapeRectangle = rectangle.getShapeDetails();
        String shapeTriangle = triangle.getShapeDetails();

        System.out.println(shapeUndefined);
        System.out.println(shapeCircle);
        System.out.println(shapeSquare);
        System.out.println(shapeRectangle);
        System.out.println(shapeTriangle);






    }
}
