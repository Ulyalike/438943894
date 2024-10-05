// Camel.java
public class Camel extends Herbivore implements Terrestrial {
  public Camel(String name) {
    super(name);
  }

  @Override
  public void walk() {
    System.out.println(name + " ходит");
  }
}
