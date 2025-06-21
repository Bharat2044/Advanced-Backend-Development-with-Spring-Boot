package Lesson5_DependencyInversionPrinciple.ProblematicCode;

public class Application {

    private MySQLDatabase mySQLDatabase = new MySQLDatabase();
    private PostgreSQLDatabase postgreSQLDatabase = new PostgreSQLDatabase();

    public void startMySQLDatabase() {
        mySQLDatabase.connect();
    }

    public void startPostgreSQLDatabase() {
        postgreSQLDatabase.connect();
    }
}
