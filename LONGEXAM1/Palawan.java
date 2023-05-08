
public class Palawan implements Locations {

  int airFare = 190; //600km from manila

  @Override
  public void accept(Tourist tourist) {
      tourist.visit(this);
  }
}