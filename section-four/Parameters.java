public class Parameters {
    public static void main(String[] args){
        calculateArea(2.3, 3.5); 
        calculateArea(8.5, 1.7); 
        calculateArea(5.2, 6.2); 
    }

    public static void calculateArea(double length, double width){
        double area = length * width; 
        System.out.println("Area: " + area);
    }
}
