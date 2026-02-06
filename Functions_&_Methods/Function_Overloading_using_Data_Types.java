public class Function_Overloading_using_Data_Types {

    // Function to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Function to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    // Function to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Function_Overloading_using_Data_Types obj = new Function_Overloading_using_Data_Types();

        // Calling the method with integer parameters
        System.out.println("Sum of two integers: " + obj.add(5, 10));

        // Calling the method with double parameters
        System.out.println("Sum of two doubles: " + obj.add(5.5, 10.5));

        // Calling the method with three integer parameters
        System.out.println("Sum of three integers: " + obj.add(5, 10, 15));
    }
}