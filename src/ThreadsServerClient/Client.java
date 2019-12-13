package ThreadsServerClient;

import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private String server;
    private int port;

    private Scanner scanner;
    private Socket socket;
    private ObjectOutputStream out;
}
