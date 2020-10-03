package com.epam.idea.task.fifth.logic;

public class RegexConversion implements TextConversion {

    @Override
    public String formatText(String text) {
        String formatedText = text.replaceAll("(?u)[^\\pL ]", " ")
                .replaceAll(" +", " ");
        return formatedText;
    }
}
