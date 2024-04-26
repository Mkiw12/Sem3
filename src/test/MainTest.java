package test;

import main.startup.*;

import org.junit.*;
import org.junit.Test;




import main.startup.Main;

public class MainTest
{


    
    @Test
    public void testMain() 
    {
        String[] args = null;
        Main.main(args);
        System.out.println("Main method completed.");
    }

}