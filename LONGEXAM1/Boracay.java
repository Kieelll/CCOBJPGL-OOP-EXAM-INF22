public class Boracay implements Locations {

  int airFare = 145; // 441km from manila

  @Override
  public void accept(Tourist tourist) {
      tourist.visit(this);
      
  }
}