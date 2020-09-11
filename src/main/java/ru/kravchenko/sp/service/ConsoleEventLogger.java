package ru.kravchenko.sp.service;

import ru.kravchenko.sp.api.EvenLogger;

/**
 * @author Roman Kravchenko
 */
public class ConsoleEventLogger implements EvenLogger {

    public void logEvent(String  msg) {
        System.out.println(msg);
    }

}
