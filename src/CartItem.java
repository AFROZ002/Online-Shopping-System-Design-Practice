public  class CartItem  {

    private  final String productId;
    private  final String productName;
    private  int quantity;
    private  final double priceAtAdd;

    public CartItem(String productId, String productName, int quantity, double priceAtAdd) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.priceAtAdd = priceAtAdd;
    }

    public String getProductId() { return productId; }
    public String getProductName() { return productName; }
    public int getQuantity() { return quantity; }
    public double getPriceAtAdd() { return priceAtAdd; }


    public void setQuantity(int quantity) { this.quantity = quantity; }

    public  double getTotalPrice(){
        return quantity * priceAtAdd;
    }


    @Override
    public String toString() {
        return "CartItem{" + productId + ", " + productName + ", qty=" + quantity + ", unit=" + priceAtAdd + "}";
    }

}