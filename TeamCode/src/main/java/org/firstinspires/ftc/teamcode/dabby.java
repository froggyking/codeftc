package org.firstinspires.ftc.teamcode;

import java.io.*;
import java.lang.*;
import java.util.*;

final class myFinalClass
{
    void myFinalMethod()
    {
        System.out.println("We are in the final class we just created");
    }
}

class MainClass
{
    public static void main(String arg[])
    {
        myFinalClass fc = new myFinalClass();
        fc.myFinalMethod();
    }
}

