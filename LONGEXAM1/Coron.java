
public class Coron implements Locations {

  int airFare = 120; //439km from manila 

  @Override
  public void accept(Tourist tourist) {
      tourist.visit(this);
  }
}
