package day4;
public class driver {
    public static void main(String[] args) {

        Product laptop = new Product("laptop", 999.99, 5);
       
        Product headphones = new Product ("headphones", 199.99, 10);

        Customer alice = new Customer("Alice", 1200.00);

        alice.addToCart(laptop);
       
        alice.addToCart(headphones);

        alice.getcart ();
        
        String cartcontents = alice.getcart();
        
        System.out.println(cartcontents);

        double totalCost = laptop + headphones;
        System.out.println(totalCost);

        Order orderForLaptop = new Order (alice, laptop);
       
        orderForLaptop.confirmorder();
       
        String orderConfirmation = orderForLaptop.confirmOrder();
       
        System.out.println(orderConfirmation);


    }
}
