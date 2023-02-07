package ru.lessons.test;

import org.apache.log4j.Logger;
import ru.lessons.Main;

public class TestClass {
    private static final Logger log = Logger.getLogger(Main.class.getName());

    public void doLogDebug() {
        log.debug("Message-debug for TestClass");
    }

    public void doLogError() {
        log.error("Message-error for TestClass");
    }

    public void doLogInfo() {
        log.info("Message-info for TestClass");
    }

    public void doLogWarning() {
        log.warn("Message-warning for TestClass");
    }
}
