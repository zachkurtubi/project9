import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Product {
    private SimpleStringProperty name;
    private SimpleIntegerProperty quantity;
    private SimpleIntegerProperty code;
    private SimpleDoubleProperty price;
    public Product(String n, int a, double b, int p){ //Constructor
        name=new SimpleStringProperty(n);
        quantity=new SimpleIntegerProperty(a);
        code = new SimpleIntegerProperty(p);
        price = new SimpleDoubleProperty(b);
    }


    public String getName(){
        return name.get();
    }//getter
    public int getQuantity(){
        return quantity.get();
    }
    public int getCode(){
        return code.get();
    }
    public double getPrice(){
        return price.get();
    }

    public void setName(String n){  //setter
        name.set(n);
    }
    public void setQuantity(int i){
        quantity.set(i);
    }
    public void setCode(int z){
        code.set(z);
    }
    public void setPrice(int l){
        price.set(l);
    }


}