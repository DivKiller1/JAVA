class Product{
    String product_id,productName,category;
    private int price;
    static int totalProducts = 0;
    Product(){
        product_id="Defualt";
        productName="Defualt";
        category="Default";
        price=0;
        totalProducts++;
    
    }
    Product(String product_id,String productName,String category,int price){
        this.category=category;
        this.price=price;
        this.productName=productName;
        this.product_id=product_id;
    }
    public void getPrice(){
        System.out.println(this.price);
    
    }
    public void displayProductInfo(){
        System.out.println("The productID is:"+product_id+"\nThe product name is:"+ productName+" \nThe category is:"+ category+"\nThe price is:"+price);
    }
    public static void displayTotalProducts() {
        System.out.println("Total number of products: " + totalProducts);
    }
        public double calculateStockValue(int quantity) {
            return price * quantity;
        }
    
    public double calculateStockValue(int quantity, double discountRate) {
        double totalValue = price * quantity;
        double discountAmount = totalValue * (discountRate / 100);
        return totalValue - discountAmount;
    }
    }
    public class Company {
        public static  void main(String a[]){
            Product p1 = new Product();
            Product p2 = new Product("1234", "Laptop", "Pc/Laptop", 1500);
            p1.displayProductInfo();
            System.out.println("p2.name");
    
        }
        
    }