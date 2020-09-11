package ru.kravchenko.sp.entity;

import java.util.Date;

/**
 * @author Roman Kravchenko
 */
public class Event {

    private Integer id;

    private String msg;

    private Date date;

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", date=" + date +
                '}';
    }

}
