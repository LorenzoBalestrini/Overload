package it.develhope.overload;

public class Shape {

    private String shapeName;
    private int numberOfEdges;

    public Shape() {
        System.out.println("An undefined shape has been created");
        shapeName = "Undefined shape";
    }

    public Shape(double radius){
        System.out.println("A circle has been created");
        shapeName = "Circle";
    }
    public Shape(int edges, double edgeLength){
        System.out.println("A square has been created");
        numberOfEdges = 4;
        shapeName = "Square";
    }
    public Shape(int edges, double e1, double e2){
        System.out.println("A rectangle has been created");
        numberOfEdges = 4;
        shapeName = "Rectangle";
    }

    public Shape(int edges, double e1, double e2, double e3){
        System.out.println("A triangle has been created");
        numberOfEdges = 3;
        shapeName = "Triangle";
    }

    public String getShapeDetails(){
        return ("The shape is a " + shapeName + " and it has " + numberOfEdges + " edges");
    }
}
