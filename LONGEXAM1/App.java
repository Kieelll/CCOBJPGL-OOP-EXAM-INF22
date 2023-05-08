public class App {
    public static void main(String[] args) throws Exception {
        Locations boracay = new Boracay();
        Locations siargao = new Siargao();
        Locations coron = new Coron();
        Locations palawan = new Palawan();
        Locations mactan = new Mactan();
        Locations dumaguete = new Dumaguete();

        Tourist ezekiel = new Me();
        
        boracay.accept(ezekiel);
        siargao.accept(ezekiel);
        coron.accept(ezekiel);
        palawan.accept(ezekiel);
        mactan.accept(ezekiel);
        dumaguete.accept(ezekiel);


        
    }
}