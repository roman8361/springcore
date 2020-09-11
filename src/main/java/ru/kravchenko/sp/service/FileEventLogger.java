package ru.kravchenko.sp.service;

import org.apache.commons.io.FileUtils;
import ru.kravchenko.sp.api.EvenLogger;

import java.io.File;
import java.io.IOException;

/**
 * @author Roman Kravchenko
 */
public class FileEventLogger implements EvenLogger {

    private File file;

    private String fileName;

    public FileEventLogger(String fileName) {
        this.fileName = fileName;
    }

    public void  init() throws IOException {
        file = new File(fileName);
        if (file.exists() && !file.canWrite()) {
            throw new IllegalArgumentException("Can`t write to file" + fileName);
        } else if (!file.exists()) {
            file.createNewFile();
        }
    }

    @Override
    public void logEvent(String msg){
        try {
            FileUtils.writeStringToFile(file, msg + "\n", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
