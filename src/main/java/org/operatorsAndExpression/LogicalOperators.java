package org.operatorsAndExpression;

public class LogicalOperators {

    boolean weather = true;
    boolean climate = false;

    public void shouldGoForPicnic(){
        if(weather || climate){
            System.out.println("Letss go");
        }else{
            System.out.println("Stay home");
        }
    }
}
