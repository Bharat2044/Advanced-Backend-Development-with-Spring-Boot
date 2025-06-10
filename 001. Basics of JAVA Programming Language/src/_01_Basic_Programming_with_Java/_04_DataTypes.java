package _01_Basic_Programming_with_Java;

public class _04_DataTypes {

    public static void main(String[] args) {

        int speedLimit = 20;
        System.out.println("Speed Limit = " + speedLimit);

        int speed;
        speed = 20;

        System.out.println("Speed = " + speed);

        speed = 50;
        System.out.println("Speed = " + speed);

        double price = 99.99;
        System.out.println("Price = " + price);

        System.out.println();

        byte b = 10;
        System.out.println("Byte = " + b);
        short s = 10;
        System.out.println("Short = " + s);
        int i = 10;
        System.out.println("i = " + i);
        long l = 9897L;
        System.out.println("Long = " + l);
        float f = 10.1F;
        System.out.println("Float = " + f);
        double d = 10.1D;
        System.out.println("Double = " + d);
        char c = 'A';
        System.out.println("Char = " + c);
        char letter = '\u0051';
        System.out.println("Letter = " + letter);
        boolean bl = true;
        System.out.println("Boolean = " + bl);

        String string = "Hello World";
        System.out.println("String = " + string);

        System.out.println();

        int employeeId = 1;
        String employeeFirstName = "Bharat";
        String employeeLastName = "Kumar";
        int employeeAge = 22;
        double employeeSalary = 240000.99;
        boolean employeeIsActive = true;
        char employeeGender = 'M';
        long employeePhoneNumber = 9898989898L;

        System.out.println("Employee ID = " + employeeId);
        System.out.println("Employee First Name = " + employeeFirstName);
        System.out.println("Employee Last Name = " + employeeLastName);
        System.out.println("Employee Age = " + employeeAge);
        System.out.println("Employee Salary = " + employeeSalary);
        System.out.println("Employee IsActive = " + employeeIsActive);
        System.out.println("Employee Gender = " + employeeGender);
        System.out.println("Employee Phone Number = " + employeePhoneNumber);
    }
}
