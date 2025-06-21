package Lesson5_DependencyInversionPrinciple.BetterCode;

import Lesson5_DependencyInversionPrinciple.ProblematicCode.MySQLDatabase;
import Lesson5_DependencyInversionPrinciple.ProblematicCode.PostgreSQLDatabase;

class Application {
    private Database database;

    // Constructor injection
    public Application(Database database) {
        this.database = database;
    }

    public void start() {
        database.connect();
    }
}
