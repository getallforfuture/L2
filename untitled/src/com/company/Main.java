package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Firsttry prog = new Firsttry();
        prog.run();
        Date d = new Date();
        System.out.printf("Сьогодні: %1$tA %1$te %1$tB\n",d);
        double a=1,b=1;
        Function F1 = new Difference(new Pow(3,new Sin(new Pow(2,new Sum(new Pow(2,new Linear(1)),new Constant(a))))),new Pow(0.5,new Division(new Linear(1),new Constant(b))));
        System.out.println("F1="+F1.calculate(1));
        System.out.println("F1="+F1.derivative().calculate(1));
        Function F2 =new Sum(new Division(new Pow(2,new Linear(1)),new Constant(a)),new Cos(new Pow(3,new Sum(new Linear(1),new Constant(b))))) ;
        System.out.println("F2="+F2.calculate(1));
        System.out.println("F2="+F2.derivative().calculate(1));
    }
}
