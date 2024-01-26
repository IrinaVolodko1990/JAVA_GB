package ru.geekbrains.OOP.seminars.seminar2;

//Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Sem2_4 {
    static Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) {
        String user_str = "test";
        String filePath = "src/main/java/ru/geekbrains/OOP/seminars/seminar2/test.txt";
        String logPath = "src/main/java/ru/geekbrains/OOP/seminars/seminar2/log.txt";
        int size = 10;

        createLogger(logPath);

        String str = repeat(user_str, size);
        writeToFile(str, filePath);
        System.out.println(readFile(filePath));

        closeLogger();

    }

    static void createLogger(String logPath) {
        try {
            FileHandler fileHandler = new FileHandler(logPath, true);
            SimpleFormatter simpleFormatter = new SimpleFormatter();
            fileHandler.setFormatter(simpleFormatter);
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void closeLogger() {
        Handler[] handlers = logger.getHandlers();
        for(Handler handler: handlers){
            handler.close();
        }
    }

    static void writeToFile(String str, String filePath) {

        try (FileWriter fileWriter = new FileWriter(filePath, true)) {
            fileWriter.write(str);
            fileWriter.write("\n");
            logger.info("Text in file!)");
        } catch (IOException e) {
            logger.warning("Can't write text to file");
            e.printStackTrace();
        }
    }

    static String readFile(String filePath) {
        StringBuilder sb = new StringBuilder();
        File file = new File(filePath);
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                sb.append(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    static String repeat(String s, int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(s);
            sb.append(" ");
        }
        return sb.toString();
    }


}
