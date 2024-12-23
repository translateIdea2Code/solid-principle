package com.translateIdea2Code.solid_principle.single_responsibility.solution;

import lombok.Data;
import lombok.Getter;

public class Text {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Text{" +
                "text='" + text + '\'' +
                '}';
    }
}
