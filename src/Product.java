import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {
    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(final BigDecimal price) {
        this.price = price;
    }

    BigDecimal price;

    public BigDecimal getDiscountRate(){
        return price.multiply(DISCOUNT_RATE).setScale(2, RoundingMode.HALF_UP);
    }
}
