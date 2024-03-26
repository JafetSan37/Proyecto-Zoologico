public class Empleados {
    private String rfc;
    private double salary;
    private String rol;

    public Empleados(String rfc, double salary, String rol) {
        this.rfc = rfc;
        this.salary = salary;
        this.rol = rol;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
