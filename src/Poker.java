/*
 * File: App.java
 * Author: Móra Barna
 * Copyright: 2023 Móra Barna
 * Group: Szoft_I_1_N
 * Date: 2023.02.13
 * Github:
 * Licence: GNU GPL
 */
import java.util.Random;


public class Poker {

    public Poker() {
        System.out.printf("%d %d %d %d %d \n",getRoll(),getRoll(),getRoll(),getRoll(),getRoll());
        System.out.printf("%d %d %d %d %d \n",getRoll(),getRoll(),getRoll(),getRoll(),getRoll());
    }
    public int getRoll(){
        Random random = new Random();
        int randInt = random.nextInt(6)+1;
        return randInt;
    }
    
}
