package student.examples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import students.examples.com.CommandType;
import students.examples.com.ServerCommand;
import students.examples.config.Configuration;


import javax.sound.sampled.Port;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerApp {

    final static Logger log = LoggerFactory.getLogger(ServerApp.class);

    public static void main(String[] args) throws IOException {

        log.info("Starter");
        ServerSocket serverSocket = new ServerSocket(Configuration.PORT);

        Socket clientSocket = serverSocket.accept();

        ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());

        ServerCommand turnOnCommand = new ServerCommand(CommandType.TURN_ON);

        out.writeObject(turnOnCommand);

        log.info("Stopped");
    }
}
