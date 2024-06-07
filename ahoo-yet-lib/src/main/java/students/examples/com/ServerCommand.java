package students.examples.com;

import java.io.Serializable;

public class ServerCommand implements Command, Serializable {
    private static final long serialVersionUID = 1L;

    private CommandType type;

    public ServerCommand(CommandType type) {
        this.type = type;
    } public CommandType getType(){
        return type;
    }

}
