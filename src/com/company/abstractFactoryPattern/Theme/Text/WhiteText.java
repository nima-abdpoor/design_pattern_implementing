package com.company.abstractFactoryPattern.Theme.Text;

import java.awt.*;

public class WhiteText implements TextColor {
    @Override
    public Color getColor() {
        return Color.white;
    }
}
