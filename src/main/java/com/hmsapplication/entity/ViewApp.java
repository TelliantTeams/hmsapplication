package com.hmsapplication.entity;

import java.time.LocalDate;

public interface ViewApp {
    int getId();

    String getPname();
    LocalDate getVisiting_date();

    String getDname();

    String getReason();
    String getStatus();
}
