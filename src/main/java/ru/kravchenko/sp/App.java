package ru.kravchenko.sp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.kravchenko.sp.entity.Client;
import ru.kravchenko.sp.service.ConsoleEventLogger;
import ru.kravchenko.sp.service.FileEventLogger;


/**
 * Hello world!
 *
 */
public class App {

    private Client client;

    private ConsoleEventLogger eventLogger;

    private FileEventLogger fileEventLogger;

    public App() {
    }

    public App(Client client, ConsoleEventLogger eventLogger, FileEventLogger fileEventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
        this.fileEventLogger = fileEventLogger;
    }

    public static void main(String[] args ) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
        App app = (App) ctx.getBean("app");
        app.logEvent("Some event for 1 ");
        app.logEvent("Some event for 12 ");
    }

    private void logEvent(String msg) {
        String message = msg.replaceAll(client.getId(), client.getFullName());
        eventLogger.logEvent(message + client.getGreeting());
        fileEventLogger.logEvent(message + client.getGreeting());
    }

}


//    public static void main(String[] args ) {
//        App app = new App();
//        app.client = new Client("1", "Ivanovich");
//        app.eventLogger = new ConsoleEventLogger();
//
//        app.logEvent("Some event for user 1");
//    }