package org.firstinspires.ftc.teamcode;

import java.io.*;
import java.lang.*;
import java.util.*;

class POJO {
    private int value = 365;
    public int getValue() { return value; }
    public void setValue(int value) { this.value = value; }
}
class GFG {
    public static void main(String args[])
    {
        POJO p = new POJO();
        System.out.println(p.getValue());
    }
}
