public class Dumaguete implements Locations {
  int airFare = 400; //939km from manila 

  @Override
  public void accept(Tourist tourist) {
      tourist.visit(this);
  }
}