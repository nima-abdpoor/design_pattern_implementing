package com.company.abstractFactoryPattern.ThemeFactory;

import com.company.abstractFactoryPattern.Theme.Background.BackgroundColor;
import com.company.abstractFactoryPattern.Theme.Background.WhiteBackground;
import com.company.abstractFactoryPattern.Theme.Text.BlackText;
import com.company.abstractFactoryPattern.Theme.Text.TextColor;

public class LightTheme implements ThemeMode {

    WhiteBackground whiteBackground=new WhiteBackground();
    BlackText blackText =new BlackText();
    @Override
    public BackgroundColor BACKGROUND_COLOR() {
        return whiteBackground;
    }

    @Override
    public TextColor TEXT_COLOR() {
        return blackText;
    }
}
