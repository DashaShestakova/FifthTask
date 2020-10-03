package com.epam.idea.task.fifth.logic;

public class CharsConversion implements TextConversion {

    @Override
    public String formatText(String text) {
        char[] charArray = text.toCharArray();
        String formatedText = "";

        for (int i = 0; i < charArray.length; i++) {
            if (!(Character.isLetter(charArray[i]))) {
                charArray[i] = ' ';
            }
        }
        char previousChar = text.charAt(0);

        for (int i = 0; i < charArray.length; i++) {
            char nextChar = charArray[i];
            if (nextChar == ' ' && previousChar == ' ') {

            } else {
                formatedText += nextChar;
            }
            previousChar = nextChar;
        }
        return formatedText;
    }
}
