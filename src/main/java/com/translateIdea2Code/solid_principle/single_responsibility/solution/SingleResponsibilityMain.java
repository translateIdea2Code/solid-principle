package com.translateIdea2Code.solid_principle.single_responsibility.solution;

public class SingleResponsibilityMain {
    public static void main(String[] args) {

        Text text = new Text();
        ManipulateText manipulateText = new ManipulateText(text);
        PrintText printText = new PrintText(text);

        //Set Text
        text.setText("Hello World");
        printText.printText();

        manipulateText.appendText(" Vinod");
        printText.printText();

        manipulateText.findAndDeleteText("World");
        printText.printText();

    }
}
