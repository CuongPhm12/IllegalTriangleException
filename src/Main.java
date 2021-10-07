public class Main {
    public static void main(String[] args) {
        try{
            Triangle triangle = new Triangle(-1.0, 4.0, 5.0);
        } catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }
    }
}
