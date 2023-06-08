package org.firstinspires.ftc.teamcode;

import java.io.*;
import java.lang.*;
import java.util.*;

class khan {

    static Hello h = new Hello() {
        public void show()
        {
            System.out.println(
                    "This is an anonymous class");
        }
    };

    public static void main(String[] args) { h.show(); }
}

interface Hello {
    void show();
}

