package com.company.abstractFactoryPattern.ThemeFactory;

import com.company.abstractFactoryPattern.Theme.Background.BackgroundColor;
import com.company.abstractFactoryPattern.Theme.Background.BlackBackground;
import com.company.abstractFactoryPattern.Theme.Text.TextColor;
import com.company.abstractFactoryPattern.Theme.Text.WhiteText;


public class DarkTheme implements ThemeMode {
    BlackBackground blackBackground =new BlackBackground();
    WhiteText whiteText=new WhiteText();
    @Override
    public BackgroundColor BACKGROUND_COLOR() {
        return blackBackground;
    }

    @Override
    public TextColor TEXT_COLOR() {
        return whiteText;
    }
}
