package org.firstinspires.ftc.teamcode;

import java.io.*;
import java.lang.*;
import java.util.*;

interface X {
    int product(int x, int y);
}
abstract class Product implements X {

    public int product(int x, int y) { return x * y; }
}
class abstractclass extends Product {
    public static void main(String args[])
    {
        abstractclass ob = new abstractclass();
        int p = ob.product(20, 10);
        System.out.println("Product: " + p);
    }
}