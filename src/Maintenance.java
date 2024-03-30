package src;

public class Maintenance extends Employee {
    public Maintenance (String name, String lastname, Date birthDate, String curp, String rfc, double salary, String rol){
        super (name,lastname,birthDate,curp,rfc,salary,rol);
    }

    public String showMaintenance(){
        return super.showEmployee();
    }
}
