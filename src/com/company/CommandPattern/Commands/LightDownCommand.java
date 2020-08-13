package com.company.CommandPattern.Commands;

import com.company.CommandPattern.Receiver.Light;

public class LightDownCommand implements ICommand {
    Light light;

    public LightDownCommand(Light light) {
        this.light = light;
    }

    @Override
    public void Execute() {
        this.light.Down();
    }

    @Override
    public void UnExecute() {
        this.light.Up();
    }
}
