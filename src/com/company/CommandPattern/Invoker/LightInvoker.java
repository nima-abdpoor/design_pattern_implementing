package com.company.CommandPattern.Invoker;

import com.company.CommandPattern.Commands.LightDownCommand;
import com.company.CommandPattern.Commands.LightOffCommand;
import com.company.CommandPattern.Commands.LightOnCommand;
import com.company.CommandPattern.Commands.LightUpCommand;

public class LightInvoker {
    LightOnCommand On ;
    LightOffCommand Off;
    LightUpCommand Up;
    LightDownCommand Down;
    public LightInvoker(LightOnCommand On ,
                        LightOffCommand Off,
                        LightUpCommand Up,
                        LightDownCommand Down){
        this.On = On;
        this.Off = Off;
        this.Up = Up;
        this.Down = Down;
    }
    public void OnClick(){
        this.On.Execute();
    }
    public void OffClick(){
        this.Off.Execute();
    }
    public void UpClick(){
        this.Up.Execute();
    }
    public void DownClick(){
        this.Down.Execute();
    }
}
