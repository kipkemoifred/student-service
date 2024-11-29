package com.example.student_service.model;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "students")
public class Student {
    @Id
    private String id;
    private String name;
    private int age;
    private String gender;
    private Integer schoolId;
}
