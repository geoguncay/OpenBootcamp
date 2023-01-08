public class Main {
  public static void main(String[] args) {
    Cliente cliente = new Cliente();
    cliente.setName("Juan");
    cliente.setAge(50);
    cliente.setPhone(12345678);
    cliente.setCredito(20000);
    System.out.println("Datos del cliente: \nNombre: "+cliente.getName()+ "\nAnio: "+cliente.getAge()+ "\nTelefono: "+cliente.getPhone()+"\nCredito: "+cliente.getCredito());
    Trabajador trabajador = new Trabajador();
    trabajador.setName("Jose");
    trabajador.setAge(30);
    trabajador.setPhone(987654321);
    trabajador.setSalario(2000);
    System.out.println("Datos del Trabajador: \nNombre: "+cliente.getName()+ "\nAnio: "+cliente.getAge()+ "\nTelefono: "+cliente.getPhone()+"\nCredito: "+cliente.getCredito());
  }
}
class Persona{
  private String name;
  private int age;
  private int phone;
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public int getAge() {
    return age;
  }
  
  public void setAge(int age) {
    this.age = age;
  }
  
  public int getPhone() {
    return phone;
  }
  
  public void setPhone(int phone) {
    this.phone = phone;
  }
}

class Cliente extends Persona{
  private double credito;
  
  public double getCredito() {
    return credito;
  }
  
  public void setCredito(double credito) {
    this.credito = credito;
  }
}
class Trabajador extends Persona{
  private double salario;
  
  public double getSalario() {
    return salario;
  }
  
  public void setSalario(double salario) {
    this.salario = salario;
  }
}