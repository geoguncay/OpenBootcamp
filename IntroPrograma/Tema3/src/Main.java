public class Main {
  public static void main(String[] args) {
    /*Primera parte:
        Crear una función con tres parámetros que sean números que se suman entre sí.
        Llamar a la función en el main y darle valores.*/
    
    int result = sumN(5, 8, 4);
    System.out.println(result);
    /*Segunda parte:
        Crear una clase coche.
        Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
        Una función que incremente el número de puertas que tiene el coche.
        Crear un objeto miCoche en el main y añadirle una puerta.
        Mostrar el número de puertas que tiene el objeto.*/
    
    myCar car1 = new myCar(5);
    car1.addDoor();
    System.out.println(car1.getNumDoors());
    
  }
  public static int sumN(int a, int b, int c){
    return a+b+c;
  }
}

class myCar {
  private int numDoors;
  
  public myCar (int a){
    this.numDoors = a;
  }
  
  public void addDoor() {
    this.numDoors++;
  }
  
  public int getNumDoors() {
    return this.numDoors;
  }
  
}


