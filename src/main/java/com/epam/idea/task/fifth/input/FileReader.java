package com.epam.idea.task.fifth.input;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader implements Reader {
    private String fileName;

    public FileReader (String fileName){
        this.fileName = fileName;
    }

    @Override
    public String read() throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        String inputText = scanner.nextLine();

        return inputText;
    }
}