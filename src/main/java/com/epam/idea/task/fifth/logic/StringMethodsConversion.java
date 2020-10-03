package com.epam.idea.task.fifth.logic;

public class StringMethodsConversion implements TextConversion {

    @Override
    public String formatText(String text) {
        char[] chr = text.toCharArray();
        for (int i = 0; i < chr.length; i++) {
            if (!(Character.isLetter(chr[i]))) {
                chr[i] = ' ';
            }
        }
        String newtext = String.valueOf(chr);

        String[] words = newtext.split("\\s");
        newtext = "";
        for (String st : words) {
            if (st.trim().length() > 0)
                newtext += st + " ";
        }
        newtext = newtext.trim();
        return newtext;
    }

}
