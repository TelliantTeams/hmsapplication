package com.hmsapplication.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;

import java.time.LocalDate;

public interface ViewAppdup {

    String getPname();

    LocalDate getVisiting_date();

    String getDname();

    String getSname();

}
