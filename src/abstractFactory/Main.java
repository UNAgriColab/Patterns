package abstractFactory;

public class Main {

    public static void main(String[] args) {
        System.out.println("abstract afctory lab");

        PurchaseFactory spf = new StandardPurchaseFactory();
        Client standard = new Client(spf);
        System.out.println(standard.getPackaging());
        System.out.println(standard.getDeliveryDocument());

        PurchaseFactory dpf = new DeletePurchaseFactory();
        Client delicate = new Client(dpf);
        System.out.println(delicate.getPackaging());
        System.out.println(delicate.getDeliveryDocument());
    }
}