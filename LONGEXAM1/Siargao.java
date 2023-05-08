
public class Siargao implements Locations {

  int airFare = 220; //762km from manila

  @Override
  public void accept(Tourist tourist) {
      tourist.visit(this);
  }
}