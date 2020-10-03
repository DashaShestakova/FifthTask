package com.epam.idea.task.fifth;

import com.epam.idea.task.fifth.exception.DataException;
import com.epam.idea.task.fifth.input.Reader;
import com.epam.idea.task.fifth.input.ReaderFactory;
import com.epam.idea.task.fifth.logic.ConversionFactory;
import com.epam.idea.task.fifth.logic.TextConversion;
import com.epam.idea.task.fifth.view.Printer;
import com.epam.idea.task.fifth.view.PrinterFactory;

import java.io.FileNotFoundException;

import static com.epam.idea.task.fifth.input.ReaderType.FILE;
import static com.epam.idea.task.fifth.logic.ConversionType.REGEX;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, DataException {
        Reader reader = ReaderFactory.createReader(FILE);
        String inputText = reader.read();

        TextConversion conversion = ConversionFactory.createTextConversation(REGEX);
        String convertedText = conversion.formatText(inputText);

        Printer printer = PrinterFactory.setPrinterType("console");
        printer.print(convertedText);
    }
}
