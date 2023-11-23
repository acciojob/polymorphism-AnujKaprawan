package com.driver;
public class Main {
    static class Product {
        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        // Step 2: Create an object of Product in Main function called p
        Product p = new Product();

        // Step 3: Call the method public int product(int x, int y) from Main using Product class object p
        int result1 = p.product(2, 3);
        System.out.println("Product of 2 and 3: " + result1); // Prints: Product of 2 and 3: 6

        // Step 4: Call the method public int product(int x, int y, int z) from Main using Product class object p
        int result2 = p.product(2, 3, 4);
        System.out.println("Product of 2, 3, and 4: " + result2); // Prints: Product of 2, 3, and 4: 24

        // Step 5: Call the method public double product(double x, double y) from Main using Product class object p
        double result3 = p.product(2.5, 3.5);
        System.out.println("Product of 2.5 and 3.5: " + result3); // Prints: Product of 2.5 and 3.5: 8.75
    }
}
