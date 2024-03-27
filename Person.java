public class Person {
    private String name;
    private String lastname;
    private String birthDate;
    private String curp;

    public Person(String name, String lastname, String birthDate, String curp) {
        this.name = name;
        this.lastname = lastname;
        this.birthDate = birthDate;
        this.curp = curp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String showInfo(){
        return String.format("Nombre completo: %s %s, Fecha de nacimiento: %s, CURP: %s", name, lastname, birthDate, curp);
    }
}
