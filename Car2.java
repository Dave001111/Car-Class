public class Car2 {

    public static void main(String[] args) {

        Car car1 = new Car("Lamborghini urus", "2026", 12000000);
        Car car2 = new Car("Mercedes Amg", "2025", 15000000);

        
        System.out.println("Original Prices");
        System.out.printf("%s: %,.2f%n", car1.getModel(), car1.getPrice());
        System.out.printf("%s: %,.2f%n", car2.getModel(), car2.getPrice());

        
        car1.setPrice(car1.getPrice() - (car1.getPrice() * 0.05));
        car2.setPrice(car2.getPrice() - (car2.getPrice() * 0.07));

        
        System.out.println("\nPrices After Discount");
        System.out.printf("%s: %,.2f%n", car1.getModel(), car1.getPrice());
        System.out.printf("%s: %,.2f%n", car2.getModel(), car2.getPrice());

    }
}