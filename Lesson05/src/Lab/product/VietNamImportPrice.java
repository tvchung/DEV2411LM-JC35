package Lab.product;

public class VietNamImportPrice extends Product{
    private float taxImported;

    public VietNamImportPrice() {
    }

    public VietNamImportPrice(String proId, String proName, String manufacturer, float producerPrice, float taxImported) {
        super(proId, proName, manufacturer, producerPrice);
        this.taxImported = taxImported;
    }

    public float getTaxImported() {
        return taxImported;
    }

    public void setTaxImported(float taxImported) {
        this.taxImported = taxImported;
    }

    @Override
    public float clalculateSalePrice() {
        float imported_price = super.clalculateSalePrice();
        float sellPrice = imported_price + taxImported*imported_price
                    + 10*(imported_price + taxImported*imported_price)/100 ;
        return sellPrice;
    }

    @Override
    public String toString() {
        String str = super.toString();
        return str + "\n VietNamImportPrice{" +
                "taxImported=" + taxImported +
                " , Sellprice" + clalculateSalePrice() +
                '}';
    }

    public static void main(String[] args) {
        VietNamImportPrice v = new VietNamImportPrice("P001","Nokia 1132","Nokia",100,10);
        System.out.println(v.clalculateSalePrice());
        System.out.println(v.toString());
    }
}
