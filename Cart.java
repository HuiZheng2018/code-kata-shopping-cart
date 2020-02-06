import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<String> items;
    //String A, B, C, D ;
    int countA = 0,countB = 0, countC =0, countD =0;
    double priceA = 50, priceB = 30, priceC = 20, priceD = 10;
    double total =0, totalA = 0, totalB = 0, totalC = 0, totalD = 0;

    public Cart(){
        items = new ArrayList<String>();
    }

    public void addItems(String item){
        if (item == "A"){
            countA++;
        } else if (item =="B"){
            countB++;
        } else if (item =="C"){
            countC++;
        } else if (item =="D"){
            countD++;
        }
        items.add(item);
    }
    public void removeItems(String item){
        if (item == "A"){
            countA--;
        } else if (item =="B"){
            countB--;
        } else if (item =="C"){
            countC--;
        } else if (item =="D"){
            countD--;
        }
        items.remove(item);
    }

    public double totalPrice(){
        if (countA >= 3){
            if (countA%3 == 0){
                totalA = (countA/3)*130;
            } else {
            int a = countA/3;
            int b = countA - (a*3);
            totalA = (a*130) + (priceA*b);
        }}
        else {
            totalA = priceA*countA;
        }
        if (countB >= 2){
            if (countB%2 == 0){
                totalB = (countB/2)*37;
            } else {
                int a = countB/2;
                int b = countB - (a*2);
                totalB = (a*37) + (priceB*b);
            }}
        else {
            totalB = priceB*countB;
        }
        total = totalA + totalB + totalC + totalD;
        return total;
    }

    public static void main (String [] args){
        Cart cart = new Cart();
        cart.addItems("A");
        cart.addItems("B");
        cart.addItems("A");
        cart.addItems("A");
        cart.addItems("A");
        cart.addItems("A");
        cart.addItems("A");
        cart.addItems("A");
        cart.addItems("B");
        cart.addItems("B");

        System.out.print("'");
        for (String x: cart.items){
            System.out.print(x);
        }
        System.out.print("' gives " + cart.totalPrice());
    }
}

