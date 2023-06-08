package org.firstinspires.ftc.teamcode;

import java.io.*;
import java.lang.*;
import java.util.*;

class Outerr {
    class Inner {
        public void show()
        {
            System.out.println("Inside a nested class");
        }
    }
}

public class nestedinnerclass {
    public static void main(String[] args)
    {
        Outerr.Inner in = new Outerr().new Inner();
        in.show();
    }
}

