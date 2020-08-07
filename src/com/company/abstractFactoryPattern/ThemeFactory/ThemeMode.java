package com.company.abstractFactoryPattern.ThemeFactory;

import com.company.abstractFactoryPattern.Theme.Background.BackgroundColor;
import com.company.abstractFactoryPattern.Theme.Text.TextColor;

public interface ThemeMode {
    BackgroundColor BACKGROUND_COLOR();
    TextColor TEXT_COLOR();
}
