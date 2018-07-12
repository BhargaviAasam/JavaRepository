import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaExample {
	public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        List<Float> productPriceList2 =productsList.stream()  
                                     .filter(p -> p.price > 30000)// filtering data  
                                     .map(p->p.price)        // fetching price  
                                     .collect(Collectors.toList()); // collecting as list  
        System.out.println(productPriceList2); 
        
        //using reduce method
     Float totalprice=productsList.stream().map(product->product.price) .reduce(0.0f,(sum, price)->sum+price);
          // accumulating price  
          System.out.println(totalprice); 
          
          
          // More precise code   
          float totalPrice2 = productsList.stream().map(product->product.price).reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class     
          System.out.println(totalPrice2);  
        
        
          // Using Collectors's method to sum the prices.  
          double totalPrice3 = productsList.stream().collect(Collectors.summingDouble(product->product.price));    
          System.out.println(totalPrice3);  
          
          
          //finding maximum price
          Product product=productsList.stream().max((product1,product2)->product1.price>product2.price?1:-1).get();
          System.out.println(product);
          
          //finding minimum price
          Product product3=productsList.stream().min((product1,product2)->product1.price<product2.price?1:-1).get();
          System.out.println(product3);
          
        
        //usage of count method
          long count= productsList.stream().filter(product5->product5.price>30000).count();
          System.out.println(count);
          
        
    }  
}
