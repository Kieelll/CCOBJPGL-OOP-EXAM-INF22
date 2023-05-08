public class Mactan implements Locations {

  int airFare = 280; //819km from manila

  @Override
  public void accept(Tourist tourist) {
      tourist.visit(this);
  }
}
