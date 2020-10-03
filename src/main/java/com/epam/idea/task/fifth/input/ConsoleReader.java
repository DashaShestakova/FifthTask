package com.epam.idea.task.fifth.input;

import java.util.Scanner;

public class ConsoleReader implements Reader {
    @Override
    public String read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text");
        String inputText = scanner.nextLine();

        return inputText;
    }
}
