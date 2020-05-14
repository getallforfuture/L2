package com.company;
import static java.lang.Math.*;
import java.util.Date;
import java.util.*;

public class Firsttry {
    /**
     * @param args the command line arguments
     */
        private double calcy(double x, double a, double b) {
        return pow(sin(pow(pow(x,2)+a,2)),3)-sqrt(x/b);
    }
    private double calcz(double x, double a, double b) {
        return Math.pow(x,2)/a+Math.cos(Math.pow(x+b,3));
    }
    private void print(double x, double y) {
        System.out.println("z="+x);
        System.out.println("y="+y);
    }
    void run() {
        System.out.println("Введите числа: ");
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();
        double a = s.nextDouble();
        double b = s.nextDouble();


        double y = calcy(x,a,b);
        double z = calcz(x,a,b);
        print(z,y);
    }

}
