package ru.kravchenko.sp.api;

import java.io.IOException;

/**
 * @author Roman Kravchenko
 */
public interface EvenLogger {

    void logEvent(String msg) throws IOException;

}
