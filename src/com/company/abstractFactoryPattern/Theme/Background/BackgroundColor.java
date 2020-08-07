package com.company.abstractFactoryPattern.Theme.Background;

import java.awt.*;

public interface BackgroundColor {
    default Color getColor(){
        return Color.white;
    }
}
