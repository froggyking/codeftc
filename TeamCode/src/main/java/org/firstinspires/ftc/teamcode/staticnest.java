package org.firstinspires.ftc.teamcode;

import java.io.*;
import java.lang.*;
import java.util.*;

class GFGG {
    static int data = 100;
    static class Inner {

        void msg()
        {
            System.out.println("data is " + data);
        }
    }

    public static void main(String args[])
    {
        GFGG.Inner obj = new GFGG.Inner();
        obj.msg();
    }
}
