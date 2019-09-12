package com.oakland.hwweek2;

import java.util.Date;

/**
 *
 * @author nburgess
 */

public class Food {
    
    /* attributes */
    
    // ToDo .. name, price, category, experationDate
    
    /* constructors */
    
    public Food () {  
    }
    
    public Food(String name, Float price, String category) {
        // ToDo...   
    }
    
    /* Getters and Setters */

    // ToDo...
    
    /* toString Override */
    @Override
    public String toString() {
      final StringBuilder sb = new StringBuilder();
      sb.append("Food{");
      sb.append("name='").append(name).append('\'');
      sb.append(", price=").append(price);
      sb.append(", category='").append(category).append('\'');
      sb.append(", date='").append(experationDate).append('\'');
       sb.append('}');
      return sb.toString();
    }
}
