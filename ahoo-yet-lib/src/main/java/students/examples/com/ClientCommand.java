package students.examples.com;

public class ClientCommand implements Command {
    private String CommandType;

    public ClientCommand(String CommandType) {
        this.CommandType = CommandType;
    }

    @Override
    public CommandType getType() {
        return null;
    }
}

