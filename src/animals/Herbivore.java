// Herbivore.java
public abstract class Herbivore extends Animal {

  public Herbivore(String name) {
    super(name);
  }

  @Override
  public void eat() {
    System.out.println(name + " ест траву");
  }
}

