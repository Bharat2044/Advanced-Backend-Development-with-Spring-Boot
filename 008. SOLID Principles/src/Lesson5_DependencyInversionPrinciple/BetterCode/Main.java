package Lesson5_DependencyInversionPrinciple.BetterCode;

public class Main {

    public static void main(String[] args) {
        Database db = new MySQLDatabase(); // OR new PostgreSQLDatabase();

        Application app = new Application(db);

        app.start();
    }
}
