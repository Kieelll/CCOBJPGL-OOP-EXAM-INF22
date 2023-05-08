public class Me implements Tourist{
  static int budget = 1000;


  public void visit() {
      System.out.print("Enjoying my stay");
  }

  public void visit(Boracay boracay) {
    
    System.out.println("The Boracay beach is so beautiful and it has an airFare of 145 from manila ");

    if(budget > boracay.airFare){
      System.out.println("Our trip to Boracay is going to happen");
      budget -= boracay.airFare;
    }
    else{
      System.out.println("Let's set our trip next time");
      
    }
    checkBudget();
  }
  
  public void visit(Siargao siargao) {

    System.out.println("The Siargao beach is so beautiful and it has an airFare of 220 from manila");

    if(budget > siargao.airFare){
      System.out.println("Our trip to Siargao is going to happen");
      budget -= siargao.airFare;
    }
    else{
      System.out.println("Let's set our trip next time");
    }
    checkBudget();
  }
  

  public void visit(Palawan palawan) {

    System.out.println("The ELNido beach is so beautiful and it has an airFare of 190 from manila ");

    if(budget > palawan.airFare){
      System.out.println("Our trip to Siargao is going to happen");
      budget -= palawan.airFare;
    }
    else{
      System.out.println("Let's set our trip next time");
    }
    checkBudget();
  }
  

  public void visit(Mactan mactan) {

    System.out.println("The Mactan beach is so beautiful and it has an airFare of 280 from manila");

    if(budget > mactan.airFare){
      System.out.println("Our trip to mactan is going to happen");
      budget -= mactan.airFare;
    }
    else{
      System.out.println("Let's set our trip next time");
    }
    checkBudget();
  }

  

  public void visit(Coron coron) {

    System.out.println("The Coron beach is so beautiful and it has an airFare of 120 from manila");

    if(budget > coron.airFare){
      System.out.println("Our trip to coron is going to happen");
      budget -= coron.airFare;
    }
    else{
      System.out.println("Let's set our trip for next time");
    }
    checkBudget(); 
  }
  
  
  public void visit(Dumaguete dumaguete) {

    System.out.println("The Coron beach is so beautiful and it has an airFare of 120 from manila");

    if(budget > dumaguete.airFare){
      System.out.println("Our trip to dumaguete is going to happen");
      budget -= dumaguete.airFare;
    }
    else{
      System.out.println("Let's set our trip for next time");
    }
    checkBudget();
  }

  

  public void checkBudget() {
      
      System.out.println("my budget is " + budget);
  }

   public static int getBudget() {
    return budget;
}


 


 
  
  
}