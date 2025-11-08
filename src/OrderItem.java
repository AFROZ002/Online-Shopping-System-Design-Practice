public  class OrderItem  {
    private   final String  productId;
    private  final String  productName;
    private  final int quantity;
    private  final double unitPrice;


    public OrderItem(String productId, String productName, int quantity, double unitPrice) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }



    public String getProductId() { return productId; }
    public String getProductName() { return productName; }
    public int getQuantity() { return quantity; }
    public double getUnitPrice() { return unitPrice; }

 public double getTotal(){
        return unitPrice*quantity;

 }

    @Override
    public String toString() {
        return "OrderItem{" + productId + ", " + productName + ", qty=" + quantity + ", unit=" + unitPrice + "}";
    }





}