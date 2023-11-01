package com.pluralsight;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void punchTimeCard() {
        Employee worker = new Employee(1, "John", "tech", 40);
        LocalDateTime punchInTime = LocalDateTime.of(2023, 10, 1, 12, 0);
        LocalDateTime punchOutTime = LocalDateTime.of(2023, 10, 1, 18, 30);

        worker.punchIn(punchInTime);
        worker.punchOut(punchOutTime);
        worker.punchTimeCard();

        double expectedHours = 6.5;
        assertEquals(expectedHours, worker.getHoursWorked());

    }

}