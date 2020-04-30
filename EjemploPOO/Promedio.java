public class Promedio{

    private String alumno;
    private int n1;
    private int n2;

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    
    //Calculando el promedio
    public double calculaPromedio(){
        return (n1+n2)/2;
    }
    
    //Determinar la condición
    public String determinaCondicion(){
        return calculaPromedio() >= 6.0 ? "APROBAD@" : "DESAPROBAD@";
    }
}