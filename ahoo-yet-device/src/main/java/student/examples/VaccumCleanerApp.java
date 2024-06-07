package student.examples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import student.examples.devices.VaccumCleaner;
import students.examples.com.CommandType;
import students.examples.com.ServerCommand;
import students.examples.config.Configuration;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;


public class VaccumCleanerApp {

    final static Logger log = LoggerFactory.getLogger(VaccumCleanerApp.class);

  ;
    public static void main(String[] args) throws IOException, ClassNotFoundException {
    log.info("Starting logs");
        VaccumCleaner vaccumCleaner = new VaccumCleaner(1,"Atom");
        System.out.println(vaccumCleaner);

        log.info(String.format("%b",vaccumCleaner.isOn()));

        Socket socket = new Socket(Configuration.HOST,Configuration.PORT);
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());

        ServerCommand serverCommand = (ServerCommand) in.readObject();

        if(serverCommand.getType().equals(CommandType.TURN_ON)){
            vaccumCleaner.switchOn();
        }
        log.info(String.format("%b",vaccumCleaner.isOn()));

        log.info("Connected to " + Configuration.HOST + ":" + Configuration.PORT);

    log.info("Stopping logs");
    }
}
