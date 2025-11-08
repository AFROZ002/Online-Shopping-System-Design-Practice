import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public  class Cart  {

    private  final String id;
    private  final String customerId;
    private  final Map<String , CartItem> items=new HashMap<>();



    public Cart(String id, String customerId) {
        this.id = id;
        this.customerId = customerId;
    }


    public String getId() { return id; }
    public String getCustomerId() { return customerId; }


   public Collection<CartItem>getItems(){
        return Collections.unmodifiableCollection(items.values());
   }
   public  void addItem(Product product ,int qty){
        if(qty<=0){
            return;
        }
        CartItem existing =items.get(product.getId());
        if(existing==null){
            items.put(product.getId(),new CartItem(product.getId(), product.getName(),qty,product.getPrice()));

        }
        else {
            existing.setQuantity(existing.getQuantity()+qty);

        }

   }

   public  boolean  removeItem(String productId){
        return items.remove(productId)!=null;
   }
   public  void clear(){
        items.clear();
   }

   public  double getTotal(){
        return items.values().stream().mapToDouble(CartItem::getTotalPrice).sum();

   }
   public  boolean isEmpty(){
        return items.isEmpty();
   }

    @Override
    public String toString() {
        return "Cart{" + id + ", customer=" + customerId + ", items=" + items.values() + "}";
    }









}