// Horse.java
public class Horse extends Herbivore implements Terrestrial {
  public Horse(String name) {
    super(name);
  }

  @Override
  public void walk() {
    System.out.println(name + " ходит");
  }
}
