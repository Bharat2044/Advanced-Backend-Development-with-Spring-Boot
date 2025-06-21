package Lesson5_DependencyInversionPrinciple.BetterCode;

public class MySQLDatabase implements Database {

    public void connect() {
        System.out.println("Connected to MySQL Database");
    }
}