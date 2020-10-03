package com.epam.idea.task.fifth.view;

import com.epam.idea.task.fifth.exception.DataException;

public class ConsolePrinter implements Printer {

    @Override
    public void print(String formatedText) throws DataException {
        System.out.println(formatedText);
    }
}
