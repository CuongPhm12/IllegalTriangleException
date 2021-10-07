public class Triangle {
    private double side1, side2,side3;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {

        if(side1 <=0 || side2 <=0 || side3<=0){
            throw new IllegalTriangleException("Side of triangle is negative number");
        }

        if(side1+side2<=side3 || side1+side3<=side2 || side3+side2<=side1){
            throw new IllegalTriangleException("these are not Triangle's Sides");
        }

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

}
