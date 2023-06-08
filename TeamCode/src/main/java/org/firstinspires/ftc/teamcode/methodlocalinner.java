package org.firstinspires.ftc.teamcode;

import java.io.*;
import java.lang.*;
import java.util.*;

class OuterKhan {
    void outerMethod()
    {
        System.out.println("Outer Method");
        class Inner {
            void innerMethod()
            {
                System.out.println("Inner Method");
            }
        }

        Inner y = new Inner();
        y.innerMethod();
    }
}
public class methodlocalinner {
    public static void main(String[] args)
    {
        OuterKhan x = new OuterKhan();
        x.outerMethod();
    }
}

