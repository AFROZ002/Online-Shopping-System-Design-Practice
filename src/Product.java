

public   class Product  {

    private  final String id;


    private  final String name;
    private  final String description;
    private  double price;
    private int quantityAvailable;

    public Product(String id, String name, String description, double price, int quantityAvailable) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
    }

    public void setPrice(double price) { this.price = price; }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }


    public  boolean reduceStock(int qty){
        if(qty<=0){
            return false;
        }
        if(quantityAvailable>=qty){
            quantityAvailable-=qty;
            return true;
        }
        return false;
    }


    public  void increaseStock(int qty){
        if(qty>0){
            quantityAvailable+=qty;

        }
    }

    @Override
    public String toString() {
        return "Product{" + id + ", " + name + ", price=" + price + ", stock=" + quantityAvailable + "}";
    }















}