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
         p.product(2, 3);
         p.product(2, 3, 4);
         p.product(2.5, 3.5);
    }
}
