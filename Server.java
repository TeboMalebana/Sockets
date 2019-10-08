// The skeleton program for Server
import java.net.*;
import java.io.*;

public class Server
{
	private Socket socket = null;
	private serverSocket server = null;
	private DataInputStream in = null;
}

    public static void main(String args[])
    {
        Server server = new Server(5000);
    }
}
