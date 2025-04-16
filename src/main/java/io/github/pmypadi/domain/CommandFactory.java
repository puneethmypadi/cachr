package io.github.pmypadi.domain;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@AllArgsConstructor
public class CommandFactory {
    private Map<String, Command> commands;


    public  Command getCommand(Events command) {
        if(commands.containsKey(command.getEvent())) {
            return commands.get(command.getEvent());
        }
        throw new IllegalArgumentException("Invalid command/not implemented yet: " + command.getEvent());
    }
}
