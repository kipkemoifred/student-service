package com.example.student_service.dto;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponse {
    private String id;
    private String name;
    private int age;
    private String gender;
    private School school;
}
