package entities;

import static java.lang.Math.sqrt;

public class Retangulo {

    public double area, perimeter, diagonal, width, height;

    public double areaCalc() {
       area =  width * height;
       return area;
    }

    public double perimeterCalc() {
       return perimeter = width * 2 + height * 2;
    }

    public double diagonalCalc() {
        return diagonal = sqrt(width * width + height * height);
    }

    public String toString(){
        return "AREA = " + areaCalc() + "\n" +
                "PERIMETER = " + perimeterCalc() + "\n" +
                "DIAGONAL = " + diagonalCalc();
    }
    // String.format("AREA = %.2f%n", area) +
    //   String.format("PERIMETER = %.2f%n", perimeter) +
}
