package com.epam.idea.task.fifth.logic;

public class ConversionFactory {
    public static TextConversion createTextConversation(ConversionType type) {
        switch (type){
            case CHARS:
                return new CharsConversion();
            case REGEX:
                return new RegexConversion();
            case STRING_METHODS:
                return new StringMethodsConversion();
            default:
                throw new IllegalArgumentException("Wrong type of conversation " + type);
        }
    }
}
