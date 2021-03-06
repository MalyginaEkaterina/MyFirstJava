package com.github.MalyginaEkaterina.myfirst;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/**
 * Created by katty on 08.01.2017.
 */
public class Main {
    public static void main(String[] args) throws Exception{
        Frontend frontend = new Frontend();

        Server server = new Server(8080);
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        server.setHandler(context);
        context.addServlet(new ServletHolder(frontend), "/mirror");

        server.start();
        System.out.println("Server started");
        server.join();
    }
}
