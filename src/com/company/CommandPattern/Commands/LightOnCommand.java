package com.company.CommandPattern.Commands;

import com.company.CommandPattern.Receiver.Light;

public class LightOnCommand implements ICommand {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void Execute() {
        this.light.On();
    }

    @Override
    public void UnExecute() {
        this.light.Off();
    }
}
