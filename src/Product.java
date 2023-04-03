import java.util.Objects;

/* 3) create an object that represents a Product

state:

- name

- price

- quantity

- category

behavior:

- getName, getPrice, getQuantity, getCategory

- hasStock : will return true if the quantity is not 0

- isCategory(String category) : return true if the category is equal to the parameter*/
public class Product {
    private final String name;
    private final int price;
    private final int quantity;
    private final String category;

    public Product(String name, int price, int quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public boolean hasStock() {
        return this.quantity != 0;

    }

    public boolean isCategory(String category) {
        return Objects.equals(this.category, category);
    }
}
