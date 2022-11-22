public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(25);
        cliente.setNombre("Alfonso Rodriguez");
        cliente.setTelefono("1751669723");
        cliente.setCredito(255000);

        Trabajador trabajador = new Trabajador();
        trabajador.setSalario(1500);

        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Telefono: " + cliente.getTelefono());
        System.out.println("Crédito: " + cliente.getCredito());
        System.out.println("\nTrabajador -> Salario: " + trabajador.getSalario());
    }
}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public Persona(){}

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getTelefono(){
        return this.telefono;
    }
}

class Cliente extends Persona{
    private double credito;

    public Cliente(){}

    public void setCredito(double credito){
        this.credito = credito;
    }

    public double getCredito(){
        return this.credito;
    }
}

class Trabajador extends Persona {
    private double salario;

    public Trabajador(){}

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return this.salario;
    }
}
