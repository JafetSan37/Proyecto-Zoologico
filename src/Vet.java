package src;

public class Vet extends Employee{
    public Vet (String name, String lastname, Date birthDate, String curp, String rfc, double salary, String rol){
        super (name,lastname,birthDate,curp,rfc,salary,rol);
    }

    public String showVet(){
        return super.showEmployee();
    }
}
