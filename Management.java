public class Management extends Employee{
    public Management (String name, String lastname, Date birthDate, String curp, String rfc, double salary, String rol){
        super (name,lastname,birthDate,curp,rfc,salary,rol);
    }

    public String showManagement(){
        return super.showEmployee();
    }
}
