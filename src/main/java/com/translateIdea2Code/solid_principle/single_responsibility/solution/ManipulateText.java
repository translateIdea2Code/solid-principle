package com.translateIdea2Code.solid_principle.single_responsibility.solution;

public class ManipulateText {

    private final Text text;

    public ManipulateText(Text text) {
        this.text = text;
    }

    public void appendText(String word) {
        String textToAppend = this.text.getText() + word;

        this.text.setText(textToAppend);
    }

    public String findAndReplaceText(String word) {
        if (word == null) return null;

        if (this.text.getText().contains(word)) {
            String replacedText = this.text.getText().replace(this.text.getText(), word);
            this.text.setText(replacedText);
        }
        return this.text.getText();
    }

    public String findAndDeleteText(String word) {
        if (text == null) return null;
        if (this.text.getText().contains(word)) {
            String deletedText = this.text.getText().replace(word, "");
            this.text.setText(deletedText);
        }
        return this.text.getText();
    }
}
