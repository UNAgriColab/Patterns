package abstractFactory;

public class StandardPurchaseFactory extends PurchaseFactory {

    @Override
    public Packaging createPackaging() {
        return new StandardPackaging();
    }

    @Override
    public DeliveryDocument createDeliveryDocument() {
        return new PostalLabel();
    }
}
