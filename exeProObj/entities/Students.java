package entities;

public class Students {
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public double totalGrade(){
        return nota1 + nota2 + nota3;
    }

    public double missPoints() {
        return 60 - totalGrade();
    }
}
