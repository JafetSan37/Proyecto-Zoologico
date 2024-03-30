package src;

import java.util.ArrayList;
import java.util.Scanner;
public class Zoo {
    private ArrayList<Guide> guides= new ArrayList<Guide>();
    private ArrayList<Visitor> visitors= new ArrayList<Visitor>();
    //Metodo agregar empleados de cualquier tipo
    public void addEmployee(){
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

    //muestra los guias
    public void showGuides(){
        if(guides.isEmpty()) System.out.println("No hay guias registrados");
        else {
            for (Guide guide : guides) {
                System.out.println(guide.showGuide());
            }
        }
    }
    //registrar visitantes
    public void addVisitors(){
        Scanner sc = new Scanner(System.in);
        //nombre completo
        System.out.println("Ingrese el nombre: ");
        String name=sc.nextLine();
        System.out.println("Ingrese el apellido: ");
        String lastName=sc.nextLine();
        if (name.isEmpty()||lastName.isEmpty()){
            System.out.println("Debe llenar el nombre completo correctamente");
            return;
        }

        System.out.println("Ingrese el dia de nacimiento");
        int day=sc.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        int month=sc.nextInt();
        System.out.println("Ingrese el año de nacimiento");
        int year=sc.nextInt();
        if (validateDate(day, month, year)==false){
            System.out.println("Fecha inválida");
            return;
        }
        Date birthDate=new Date(day,month,year);

        System.out.println("Ingrese la curp");
        String curp=sc.next();  //hacemos método para validar curp??

        System.out.println("Fecha de registro del visitante: ");
        System.out.println("Ingrese día: ");
        int rday= sc.nextInt();
        System.out.println("Ingrese mes (1-12) : ");
        int rmonth = sc.nextInt();
        System.out.println("Ingrese año(AAAA): ");
        int ryear = sc.nextInt();
        if (validateDate(rday, rmonth, ryear)==false){
            System.out.println("Fecha inválida");
            return;
        }
        Date registerDate = new Date(rday, rmonth, ryear);
        //se crea el visitante
        Visitor newVisitor = new Visitor(name, lastName, birthDate, curp, registerDate);
        //se agrega a la lista
        visitors.add(newVisitor);
    }
    //método validar curp (por si acaso)
    /*public boolean validateCurp (String curp){
        if (curp.length()!=18){ return false}

        for (int i=0; i<18; i++){

        }
    }
    */
    //añadir visita
    public void addVisit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Has seleccionado registrar una visita");
        System.out.println("Elige el Guía");
        showGuides();
        int selection = sc.nextInt();

    }
    //añadir animal
    public void addAnimal(){}
    //agregar cuidado
    public void addCare(){}
    //modificarEmpleado
    public void modifyEmployee(){}
    //modificar registro animal
    public void modifyAnimalRegister(){}
    //modificar visitante
    public void modifyVisitor(){}
    //borrar empleado ? será posible solo si no tiene registros de Cuidados?
    public void deleteEmployee(){}
    //borrar animal ? mismo caso que el anterior
    public void deleteAnimal(){}
    //borrar visitante yo creo que solo que la visita tenga registrado más de un visitante
    public void deleteVisitor(){}
    //mostrar lista empleados
    public void showEmployees(){}
    //mostrar lista animales
    public void showAnimals(){}
    //mostrar visitantes
    public void showVisitors(){}
    //mostrar visitas
    public void showVisits(){}
    //mostrar lista de cuidados
    public void showCareList(){}
    //Tester
    public void Tester(){
        Date birthDateAlex = new Date(4,2,2003);
        Date birthDateAtziri = new Date(5, 6, 1996);
        Date birthDateJafet = new Date (30, 1, 1997);
        Guide guide1 = new Guide("Alejandro", "Montejano", birthDateAlex, "MODA030204LMN01", "MODA83726", 2000);
        Guide guide2 = new Guide("Jafet", "Santoyo", birthDateJafet, "SABE970130LJBSA01", "SABJ87657", 2000);
        Guide guide3 = new Guide("Atziri", "Mancilla", birthDateAtziri, "MACA05061997LMN12", "MACA0506199710", 2001);
        guides.add(guide1);
        guides.add(guide2);
        guides.add(guide3);

    }

}
