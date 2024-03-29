import java.util.ArrayList;
import java.util.Scanner;

public class Zoologico {
    private ArrayList<Guide> guides= new ArrayList<Guide>();
    private ArrayList<Visitor> visitors= new ArrayList<Visitor>();
    //Metodo agregar empleados de cualquier tipo
    /*public void addEmployee(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String name=sc.nextLine();
        System.out.println("Ingrese el apellido: ");
        String lastName=sc.nextLine();
        System.out.println("Ingrese el dia de nacimiento");
        int day=sc.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        int month=sc.nextInt();
        System.out.println("Ingrese el año de nacimiento");
        int year=sc.nextInt();
        Date date=new Date(day,month,year);
        System.out.println("Ingrese la curp");
        String curp=sc.next();
        System.out.println("Ingrese el RFC");
        String rfc=sc.next();
        System.out.println("Ingrese el salario");
        double salary=sc.nextDouble();
        //asigna el rol  al empleado
        System.out.println("Seleccione el tipo de empleado: \n1. Guia\n2. Veterinario\n3. Mantenimiento\n4. Administracion");
        int opcion=sc.nextInt();
        switch (opcion){
            case 1:
                guides.add(new Guide(name,lastName,date,curp,rfc,salary));
                System.out.println("Guia agregado con exito");
                break;
            case 2:
                //vete.add(new Veterinary(name,lastName,date,curp,rfc,salary));
                System.out.println("Veterinario agregado con exito");
                break;
            case 3:
                //guides.add(new Management(name,lastName,date,curp,rfc,salary));
                System.out.println("Empleado de mantenimiento agregado con exito");
                break;
            case 4:
                //guides.add(new Managenent(name,lastName,date,curp,rfc,salary));
                System.out.println("Administrador agregado con exito");
                break;
            default:
                System.out.println("No fue posible agregar el empleado");
                break;
        }
    }
    public boolean validateDate(int dayOfMonth,int month,int year){
        Boolean band=true;
        if(dayOfMonth<1||dayOfMonth>31)
            band=false;
        if(month<1||month>12)
            band=false;
        if(year<1900&&year>2024)
            band=false;
        return band;
    }
     */
    //muestra los guias
    public void showGuides(){
        if(guides.isEmpty()) System.out.println("No hay guias registrados");
        else {
            for (Guide guide : guides) {
                System.out.println(guide.showGuide());
            }
        }
    }
}
