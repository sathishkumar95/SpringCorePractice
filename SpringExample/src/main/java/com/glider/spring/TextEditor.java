package com.glider.spring;

public class TextEditor {

    SpellChecker checker;

    public SpellChecker getChecker() {
        return checker;
    }


    public TextEditor(SpellChecker checker) {
        this.checker = checker;
    }
}
