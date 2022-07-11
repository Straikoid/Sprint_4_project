package ru.praktikum.string_cheker;

public class Account {

    private final String name;
    private final String nameValidationRegex = "(^[A-ZА-ЯЁ][A-zА-яЁё'-]*+)( )([A-ZА-ЯЁ][A-zА-яЁё'-]*+$)";

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        return (name.length() <= 19
                && name.matches(nameValidationRegex));
    }
}
