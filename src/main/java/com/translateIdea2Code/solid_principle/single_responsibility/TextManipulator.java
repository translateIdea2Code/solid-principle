package com.translateIdea2Code.solid_principle.single_responsibility;

/**
 * Not adhering to Single responsibility. This Class is doing everything
 * 1. Storing Text
 * 2. Manipulating Text
 * 3. Printing Tex
 */
public class TextManipulator {
    private String text;

    public TextManipulator(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void appendText(String text) {
        this.text += text;
    }

    public void replaceText(String text, String newText) {
        this.text += newText;
    }

    public String findWordAndReplace(String word, String replacement) {
        if(this.text.contains(word)){
            this.text = this.text.replace(word,replacement);
        }
        return text;
    }

    public String findWordAndDelete(String word) {
        if(this.text.contains(word)){
            this.text = this.text.replace(word,"");
        }
        return text;
    }

    public void printText() {
        System.out.println(this.text);
    }

    public static void main(String[] args) {
        TextManipulator textManipulator = new TextManipulator("Hello World");
        textManipulator.printText();


    }
}
