package abstractFactory;

public abstract class PurchaseFactory {

    public abstract Packaging createPackaging();

    public abstract DeliveryDocument createDeliveryDocument();

}
