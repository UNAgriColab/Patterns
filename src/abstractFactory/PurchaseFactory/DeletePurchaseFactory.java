package abstractFactory.PurchaseFactory;

import abstractFactory.DeliveryDocument.CourierManifest;
import abstractFactory.DeliveryDocument.DeliveryDocument;
import abstractFactory.Packaging.Packaging;
import abstractFactory.Packaging.ShockProofPackaging;

public class DeletePurchaseFactory extends PurchaseFactory {

    public Packaging createPackaging() {
        return new ShockProofPackaging();
    }

    public DeliveryDocument createDeliveryDocument() {
        return new CourierManifest();
    }
}
