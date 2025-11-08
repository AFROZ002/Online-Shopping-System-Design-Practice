# 🛍️ Online Shopping System (OOP + UML Project)

---

## 🧩 Project Question

> Draw a **Use Case / Class Diagram** for a simple Online Shopping System that includes:
>
> - **Customer**, **Cart**, **Product**, **Order**
> - Customer can **browse products**, **add to cart**, and **place order**
> - Show associations like:
    >   - Customer → Cart (1-to-1)
>   - Cart → CartItem (composition)
>   - Order → OrderItem (composition)
>   - Order → Product (association)
>
> ❌ *Exclude Admin and Payment part to keep it simple*

---

## 🧠 Project Overview

Ye ek **basic e-commerce system** ka OOP implementation hai (Java me likha gaya).  
Is project ka main goal hai **System Design + UML + OOP concepts** ko samajhna (Class Diagram ke through).  
Ye beginner-friendly project hai — without DB, only in-memory logic.

---

## ⚙️ Features (MVP version)

✔️ Customer can register  
✔️ Add products (in memory)  
✔️ Create cart and add items  
✔️ View cart and total amount  
✔️ Checkout → convert cart into order  
✔️ Stock automatically reduces when order placed

---

## 🧱 UML Class Diagram (Visual)

+----------------+        1         *         +----------------+
|   Customer     |--------------------------->|     Cart       |
+----------------+                           +----------------+
| - id           |                           | - id           |
| - name         |                           | - customerId   |
| - email        |                           | - items: List  |
| - passwordHash |                           +----------------+
+----------------+                           | + addItem()    |
| + register()   |                           | + removeItem() |
+----------------+                           | + getTotal()   |
1                                           *
|                                           |
|                                           v
|                                      +-----------+
|                                      | CartItem  |
|                                      +-----------+
|                                      | - productId
|                                      | - qty
|                                      | - priceAtAdd
|                                      +-----------+
|                                           ^
|                                           |
|                    *                      |
|   places            |  contains            |  1
+----------------->+------------------------+----------------+
|        Order                                 |
+---------------------------------------------+
| - id                                        |
| - customerId                                |
| - items: List<OrderItem>                    |
| - totalAmount                               |
| - status (PLACED/PAID/SHIPPED/DELIVERED)   |
+---------------------------------------------+
| + calculateTotal()                          |
| + changeStatus()                            |
+---------------------------------------------+
|
1|
v
+-----------+
|OrderItem  |
+-----------+
| - productId
| - qty
| - unitPrice
+-----------+

Separate domain:

+----------------+   *   1   +----------------+
|    Product     |<--------->|  Category      |
+----------------+           +----------------+
| - id           |           | - id           |
| - name         |           | - name         |
| - description  |           +----------------+
| - price        |
| - sku          |
| - qtyAvailable |
+----------------+
| + reduceStock()|
+----------------+

 