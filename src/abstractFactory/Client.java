package abstractFactory;

public class Client {
    private Packaging packaging;
    private DeliveryDocument deliveryDocument;

    public Client(PurchaseFactory factory){
        packaging = factory.createPackaging();
        deliveryDocument = factory.createDeliveryDocument();
    }

    public Class<? extends Packaging> getPaackaging() {
        return this.packaging.getClass();
    }

    public Class<? extends DeliveryDocument> getDeliveryDocument() {
        return this.deliveryDocument.getClass();
    }
}
