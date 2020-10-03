package com.epam.idea.task.fifth.view;

import com.epam.idea.task.fifth.exception.DataException;

public interface Printer {
    void print (String formatedText) throws DataException;
}
