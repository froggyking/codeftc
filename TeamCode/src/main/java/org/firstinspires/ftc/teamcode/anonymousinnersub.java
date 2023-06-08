package org.firstinspires.ftc.teamcode;

import java.io.*;
import java.lang.*;
import java.util.*;

class Outer {
    void show()
    {
        System.out.println("Show method of super class");
    }
}

public class anonymousinnersub {

    static Outer o = new Outer() {
        void show()
        {
            super.show();
            System.out.println("Demo class");
        }
    };

    public static void main(String[] args) { o.show(); }
}

