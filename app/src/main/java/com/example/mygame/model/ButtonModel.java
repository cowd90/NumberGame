package com.example.mygame.model;

import java.io.Serializable;

public class ButtonModel implements Serializable {
    private final String btnText;

    public String getBtnText() {
        return btnText;
    }

    public ButtonModel(String btnText) {
        this.btnText = btnText;
    }

}
