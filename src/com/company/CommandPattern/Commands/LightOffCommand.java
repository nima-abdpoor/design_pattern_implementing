package com.company.CommandPattern.Commands;

import com.company.CommandPattern.Receiver.Light;

public class LightOffCommand implements ICommand {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void Execute() {
        this.light.Off();
    }

    @Override
    public void UnExecute() {
        this.light.On();
    }
}
