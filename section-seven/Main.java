public class Main {
    public static void main(String[] args){

        Car nissan = new Car("Nissan", 10000, 2020, "Green", new String[] {"Tires", "Keys"});
        Car dodge = new Car("Dodge", 11000, 2019, "Blue", new String[] {"Tires", "Keys"});
//        String[] carParts = nissan.getParts();
//        carParts[0] = "Filter";
//        System.out.println(carParts[0]);
//        System.out.println(dodge.getParts()[0]);
//        System.out.println(nissan.getParts()[0]);

        Car nissan2 = new Car(nissan);
        nissan2.setColor("Teal");
//        System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice() +
//                ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + ".\n");
//        System.out.println("This " + dodge.getMake() + " is worth $" + dodge.getPrice() +
//                ". It was built in " + dodge.getYear() + ". It is " + dodge.getColor() + ".\n");
        nissan2.setColor("Yellow");
        nissan2.drive();
    }
}
