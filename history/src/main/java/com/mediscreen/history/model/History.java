package com.mediscreen.history.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * The History class implements a history
 * entity.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "history")
public class History {

    @Id
    private String id;

    private long patientId;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    private String note;
}
