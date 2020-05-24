package abstractFactory;

public class DeletePurchaseFactory extends PurchaseFactory{

    public Packaging createPackaging() {
        return new ShockProofPackaging();
    }

    public DeliveryDocument createDeliveryDocument() {
        return new CourierManifest();
    }
}
