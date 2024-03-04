package com.demo.todolist.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import com.demo.todolist.enumeration.RepeatType;

import java.time.LocalTime;

@Entity
@Getter
@Setter
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "NVARCHAR(30)")
    private String label;
    private LocalTime startTime;
    private LocalTime endTime;

    @Enumerated(EnumType.STRING)
    //Without @Enumerated(EnumType.STRING), Store as number index
    private RepeatType repeatType;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Category category;

}
