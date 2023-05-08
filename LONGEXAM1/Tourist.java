public interface Tourist {

  int budget = 0;

  void visit();

  void visit(Boracay boracay);

  void visit(Siargao siargao);

  void visit(Palawan palawan);

  void visit(Mactan mactan);

  void visit(Coron coron);

  void visit(Dumaguete dumagete);

  default void visit(Locations locations) {
      System.out.println("Arrived on a location");
  };

   void checkBudget();
}