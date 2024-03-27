public class Visitor extends Person{
    private int totalVisits;
    private String registerDate;

    public Visitor(String name, String lastname, String birthDate, String curp, int totalVisits, String registerDate){
        super (name, lastname, birthDate, curp);
        this.totalVisits = totalVisits;
        this.registerDate = registerDate;
    }
    //Setters no le puse porque se supone que fecha de registro ni visitas se pueden modificar

    public String showVisitor (){
        return super.showInfo()+" Total visits: "+totalVisits+" Register date: "+registerDate;

    }
}
