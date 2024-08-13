package entities;

public class Student {
    public String name;
    public double priTrimestre = 30, segTrimestre = 35, terTrimestre = 35, grade1, grade2, grade3, totGrade, totTrimestre;

    public double finale () {
        totGrade = grade1 + grade2 + grade3;
        return totGrade;
    }

    public boolean pass () {
        this.totTrimestre = (priTrimestre + segTrimestre + terTrimestre) * 0.6;

        if (totGrade >= totTrimestre ) {
            System.out.println("PASS");
            return true;
        }
        else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", (totTrimestre - totGrade));
            return false;
        }
    }

}
