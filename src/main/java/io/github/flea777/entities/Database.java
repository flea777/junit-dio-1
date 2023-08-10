package io.github.flea777.entities;

import java.util.logging.Logger;

public class Database {

    private static final Logger LOGGER = Logger.getLogger(Database.class.getName());

    public static void startConnection() {
        LOGGER.info("Connection started");
    }

    public static void endConnection() {
        LOGGER.info("Connection ended");
    }

    public static void insertData(Person person) {
        LOGGER.info("Data inserted");
    }

    public static void removeData(Person person) {
        LOGGER.info("Data removed");
    }
}
