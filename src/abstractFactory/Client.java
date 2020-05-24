package abstractFactory;

public class Client {
    private Packaging paackaging;
    private DeliveryDocument deliveryDocument;

    public Client(PurchaseFactory factory){
        paackaging = factory.createPackaging();
        deliveryDocument = factory.createDeliveryDocument();
    }

    public Packaging getPaackaging() {
        return paackaging;
    }

    public DeliveryDocument getDeliveryDocument() {
        return deliveryDocument;
    }
}
