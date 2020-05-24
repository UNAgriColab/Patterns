package abstractFactory.PurchaseFactory;

import abstractFactory.DeliveryDocument.DeliveryDocument;
import abstractFactory.Packaging.Packaging;

public abstract class PurchaseFactory {

    public abstract Packaging createPackaging();

    public abstract DeliveryDocument createDeliveryDocument();

}
