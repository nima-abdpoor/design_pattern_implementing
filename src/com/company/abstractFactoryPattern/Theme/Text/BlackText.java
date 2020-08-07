package com.company.abstractFactoryPattern.Theme.Text;

import java.awt.*;

public class BlackText implements TextColor {
    @Override
    public Color getColor() {
        return Color.BLACK;
    }
}
