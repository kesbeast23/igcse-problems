public class Product {
    String category;
    String itemcode;
    String description;
    double price;

    Product(){}

    Product(String category,String itemcode,String description,double price){
        this.category=category;
        this.itemcode = itemcode;
        this.description = description;
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
      }
      public void itemCode(String itemcode) {
        this.itemcode = itemcode;
      }
      public void setDescription(String description) {
        this.description = description;
      }
      public void setPrice(double price) {
          
        this.price = price;
      }

    public String getCategory(){
        return category;
    }

    public String getItemcode(){
        return itemcode;
    }
    public String getDescription(){
        return description;
    }
    public double getPrice(){
        return price;
    }
 
}
