package com.oakland.hwweek2;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 *
 * @author nburgess
 */
public class Main {
    
    public static void main(String[] args) {
        
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();
        
        FoodService foodService = container.instance().select(FoodService.class).get();
        
        Food food = foodService.createFood("Ground Beef", 15f, "meat");
        
        System.out.println(food);
        
        weld.shutdown();
    }
}