package abstractFactory.PurchaseFactory;

import abstractFactory.DeliveryDocument.DeliveryDocument;
import abstractFactory.DeliveryDocument.PostalLabel;
import abstractFactory.Packaging.Packaging;
import abstractFactory.Packaging.StandardPackaging;
import abstractFactory.PurchaseFactory.PurchaseFactory;

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
