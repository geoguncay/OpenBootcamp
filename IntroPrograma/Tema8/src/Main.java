public class Main {
  public static void main(String[] args) {
    Person person = new Person();
    person.setName("Juan");
    person.setAge(30);
    person.setPhoneN(12345678);
    System.out.println(person.getName()+ " tiene "+ person.getAge()+ " anios "+ " su numero es "+person.getPhoneN());
  }

}


class Person{
  private String name;
  private int age;
  private int phoneN;
  
  public void setName(String name) {
    this.name = name;
  }
  
  public void setAge(int age) {
    this.age = age;
  }
  
  public void setPhoneN(int phoneN) {
    this.phoneN = phoneN;
  }
  
  public String getName() {
    return name;
  }
  
  public int getAge() {
    return age;
  }
  
  public int getPhoneN() {
    return phoneN;
  }
  
}