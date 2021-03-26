import java.math.BigDecimal;

public class Main {
public static void main(String[] args){
    Product product=new Product();
    product.setId(1);
    product.setName("first");
    product.setPrice(BigDecimal.valueOf(2.99));
    System.out.println(product.getId()+" "+product.getPrice());
}
}
