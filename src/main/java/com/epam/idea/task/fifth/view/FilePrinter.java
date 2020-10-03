package com.epam.idea.task.fifth.view;

import com.epam.idea.task.fifth.exception.DataException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements Printer {
    private String fileName;

    public FilePrinter (String fileName){
        this.fileName = fileName;
    }

    @Override
    public void print(String formatedText) throws DataException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
            writer.write(formatedText);
        }catch (IOException e){
            throw new DataException(e.getMessage());
        }
    }
}
