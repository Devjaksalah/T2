package ma.education.tp.interfacekeyword;

public class Humain extends Animal implements Carnivore, Herbivore
{
  @Override
public void manger(Animal animal) {
// ...
} 

	@Override
public void manger(Vegetal vegetal) {
// ...
}
}