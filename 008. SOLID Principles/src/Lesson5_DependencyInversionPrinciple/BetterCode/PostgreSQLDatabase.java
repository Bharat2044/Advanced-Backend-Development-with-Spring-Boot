package Lesson5_DependencyInversionPrinciple.BetterCode;

public class PostgreSQLDatabase implements Database {

    public void connect() {
        System.out.println("Connected to PostgreSQL Database");
    }
}