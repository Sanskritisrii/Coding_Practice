package org.PracticQuestions;
//nested if-else calculate the final price of the product

public class Problem6 {
    public void calculatePrice(int category, int price , boolean discount){
        if(category == 1){
            if(discount){
                System.out.println("Discount Price : " +  (price-100));
            }else{
                System.out.println("Final Price: " + price);
            }
        }else{
            if(discount){
                System.out.println("Discount Price : " + (price-50));
            }else{
                System.out.println("Final Price : " + price);
            }
        }
    }


}
