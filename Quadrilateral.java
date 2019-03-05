package com.company;

class Quadrilateral {
    int[] x = new int[4];
    int[] y = new int[4];

    public Quadrilateral(int[] x, int[] y) {
        this.x = x;
        this.y = y;
    }

    public double area()
    {
        double a = 0.5*Math.abs(x[0]*y[1] + x[1]*y[2] + x[2]*y[3] + x[3]*y[0] - x[2]*y[1] - x[1]*y[0] - x[3]*y[2] - x[0]*y[3]);
        return a;
    }
}

class Trapezoid extends Quadrilateral{
    public Trapezoid(int[] x, int[] y) {
        super(x, y);
    }
}


class Parallelogram extends Trapezoid {
    public Parallelogram(int[] x, int[] y) {
        super(x, y);
    }
}

class Rectangle extends  Parallelogram {
    public Rectangle(int[] x, int[] y) {
        super(x, y);
    }
}

class Square extends Rectangle {
    public Square(int[] x, int[] y) {
        super(x, y);
    }
}

public class Main {

    public static void main(String[] args) {

        Quadrilateral q = new Quadrilateral(new int[]{1,5,3,4}, new int[]{1, 9, 2, 5});
        System.out.println("Area of Quadrilateral: "+q.area());

        Trapezoid t = new Trapezoid(new int[]{1,5,3,4}, new int[]{1, 4, 2, 5});
        System.out.println("Area of Trapezoid: "+t.area());

        Parallelogram p = new Parallelogram(new int[]{1,5,3,4}, new int[]{1, 4, 2, 5});
        System.out.println("Area of Parallelogram: "+p.area());

        Rectangle r = new Rectangle(new int[]{1,5,3,4}, new int[]{1, 4, 2, 5});
        System.out.println("Area of Rectangle: "+r.area());

        Square s = new Square(new int[]{1,5,3,4}, new int[]{1, 4, 2, 5});
        System.out.println("Area of Square: "+s.area());


    }
}

