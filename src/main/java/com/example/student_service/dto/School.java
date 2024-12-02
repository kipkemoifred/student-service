package com.example.student_service.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class School {
    private int id;
    private String schoolName;
    private String location;
    private String principalName;
}
