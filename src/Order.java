import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public  class Order  {
    public  enum  Status{PLACED, CONFIRMED, SHIPPED, DELIVERED, CANCELLED};

    private  final String id;
    private  final String  customerId;
    private  final List<OrderItem>items;
    private  final  double totalAmount;

    private  final LocalDateTime  createdAt;
    private   Status  status;



    public Order(String id, String customerId, List<OrderItem> items) {
        this.id = id;
        this.customerId = customerId;
        this.items = new ArrayList<>(items);
        this.totalAmount = items.stream().mapToDouble(OrderItem::getTotal).sum();
        this.createdAt = LocalDateTime.now();
        this.status = Status.PLACED;
    }

    public String getId() { return id; }
    public String getCustomerId() { return customerId; }
    public List<OrderItem> getItems() { return Collections.unmodifiableList(items); }
    public double getTotalAmount() { return totalAmount; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public Status getStatus() { return status; }


}