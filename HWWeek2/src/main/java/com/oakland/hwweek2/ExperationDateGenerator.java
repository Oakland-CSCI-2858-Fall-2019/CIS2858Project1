package com.oakland.hwweek2;

import java.time.LocalDateTime;

/**
 *
 * @author nburgess
 */

public interface ExperationDateGenerator {
    LocalDateTime generateExperationDate(Category category);
}
