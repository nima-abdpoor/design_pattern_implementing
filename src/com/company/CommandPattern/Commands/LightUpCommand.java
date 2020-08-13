package com.company.CommandPattern.Commands;

import com.company.CommandPattern.Receiver.Light;

public class LightUpCommand implements ICommand {
    Light light;

    public LightUpCommand(Light light) {
        this.light = light;
    }

    @Override
    public void Execute() {
        this.light.Up();
    }

    @Override
    public void UnExecute() {
        this.light.Down();
    }
}
