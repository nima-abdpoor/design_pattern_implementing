package com.company.abstractFactoryPattern.Theme.Text;

import java.awt.*;

public interface TextColor {
    default Color getColor(){
        return Color.BLACK;
    }
}
