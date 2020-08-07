package com.company.abstractFactoryPattern.Theme.Background;

import java.awt.*;

public class BlackBackground implements BackgroundColor {
    @Override
    public Color getColor() {
        return Color.BLACK;
    }
}
