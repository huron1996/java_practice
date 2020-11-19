package com.huron;

public class TextEditor {

        private SpellChecker spellChecker;
        private String name;


    public TextEditor(SpellChecker spellChecker, String name) {
        this.spellChecker = spellChecker;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SpellChecker getSpellChecker() {
            return spellChecker;
        }

        public void setSpellChecker(SpellChecker spellChecker) {
            System.out.println("inside SpellChecker setter");
            this.spellChecker = spellChecker;
        }


        public void spellCheck(){
            spellChecker.checkSpelling();
            System.out.println("the name is : " + name);
        }
}
