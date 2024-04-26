package main.startup;

import main.controller.Controller;
import main.view.*;
import main.integration.*;
//

/**
 * Starts the entire application, contains the main method used to start the application.
 */
public class Main
{
    public static void main(String[] args)
    {
        Controller control = new Controller();
        View view = new View(control);

        SalesLog SaleL = new SalesLog();
        Printer print = new Printer();

    }
}
