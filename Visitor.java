
import java.util.Scanner;
public class Visitor extends Person{
    private int totalVisits;
    private Date registerDate;
    Scanner sc = new Scanner(System.in);
    public Visitor(String name, String lastname, Date birthDate, String curp, int totalVisits, Date registerDate){
        super (name, lastname, birthDate, curp);
        this.totalVisits = totalVisits;
        this.registerDate = registerDate;
    }
    //Setters no le puse porque se supone que fecha de registro ni visitas se pueden modificar

    public String showVisitor (){
        return super.showInfo()+" Total visits: "+totalVisits+" Register date: "+registerDate;

    }
    public void modify(Visitor visitor){
        System.out.println("¿Qué aspecto desea modificar? \n1)Nombre \n2) Apellido\n 3)Fecha de Nacimiento\n 4)CURP");
        int selection = sc.nextInt();
        switch (selection){
            case 1 -> {
                System.out.println("Ingrese el Nombre: ");
                String newName = sc.nextLine();
                visitor.setName(newName);

            }
            case 2 -> {
                System.out.println("Ingrese el Apellido: ");
                Scanner sc =new Scanner(System.in);
                String newLastname = sc.nextLine();
                visitor.setLastname(newLastname);
            }
            case 3 -> {
                System.out.println("Ingrese la fecha de Nacimiento: ");
                System.out.println("Año: ");
                int newYear = sc.nextInt();
                System.out.println("Mes: ");
                int newMonth = sc.nextInt();
                System.out.println("Dia: ");
                int newDay = sc.nextInt();

                Date newDate = new Date(newDay, newMonth, newYear);
                visitor.setBirthDate(newDate);
            }
            case 4 -> {
                System.out.println("Ingrese CURP");
                String newCurp = sc.nextLine();
                visitor.setCurp(newCurp);}

            default-> System.out.println("Opción no válida");

        }
        System.out.println("Información guardada: "+ visitor.showVisitor());
    }
    public void deleteVisitor(){}
    public double calculateTicketCost(Visitor visitor){
        if(isAnAdult(visitor)==true){ return 100;}
        else return 50;
    }
    public void registerAVisit(){}
    public boolean isAnAdult(Visitor visitor){
        int actualYear = 2024;
        int personYear = visitor.getBirthDate().getYear();
        int visitorsAge = actualYear-personYear;
        if (visitorsAge>18){ return true;}
            else return false;
    }
}
