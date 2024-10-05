// Eagle.java
public class Eagle extends Carnivore implements Flying {
  public Eagle(String name) {
    super(name);
  }

  @Override
  public void eat() {
    System.out.println(name + " ест мясо");
  }

  @Override
  public void fly() {
    System.out.println(name + " летит");
  }
}
