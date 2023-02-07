package ru.lessons;

import org.apache.log4j.Logger;
import ru.lessons.test.TestClass;

public class Main {
    private static final Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        TestClass testClass = new TestClass();

        testClass.doLogDebug();
        testClass.doLogInfo();
        testClass.doLogError();
        testClass.doLogWarning();

        log.error("Message-error for MAIN class");
    }
}