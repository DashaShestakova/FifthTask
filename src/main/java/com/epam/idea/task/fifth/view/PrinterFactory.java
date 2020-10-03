package com.epam.idea.task.fifth.view;

public class PrinterFactory {
    private static final String FILE_NAME = "output.txt";

    public static Printer setPrinterType(String type) {
        switch (type) {
            case "console":
                return new ConsolePrinter();
            case "file":
                return new FilePrinter(FILE_NAME);
            default:
                throw new IllegalArgumentException("Wrong type" + type);
        }
    }
}
