package OOPs;

public class Polymorphism {

    /* Method Overloading */


}

class Calculator {
    // Overloaded method 1: Accepts two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method 2: Accepts three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method 3: Accepts two doubles
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int one =  calc.add(6,7);
        int two = calc.add(4,5,6);
        double three = calc.add(5.5, 4.5);

        System.out.println(one + ", " + two + ", " + three);
    }

}
