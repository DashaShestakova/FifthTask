package com.epam.idea.task.fifth.input;

public class ReaderFactory {

    public static final String PATH = "src/main/resources/input.txt";

    public static Reader createReader(ReaderType type){
        switch (type){
            case FILE:
                return new FileReader(PATH);
            case CONSOLE:
                return new ConsoleReader();
            default:
                throw new IllegalArgumentException("Wrong type" + type);
        }
    }
}
