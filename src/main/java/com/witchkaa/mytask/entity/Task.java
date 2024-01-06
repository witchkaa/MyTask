package com.witchkaa.mytask.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="tasks")
public class Task {
    @Id
    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("deadline")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate deadline;
    @JsonProperty("is_done")
    private Boolean isDone;
}
