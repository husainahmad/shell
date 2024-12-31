package org.ahmad.shell.component;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class ShellCommand {

    @ShellMethod(key = "hi")
    public String introduce() {
        return "Hi, my name is world, what can i help?";
    }
}
