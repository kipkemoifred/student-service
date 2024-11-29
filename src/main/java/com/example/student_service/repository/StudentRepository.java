package com.example.student_service.repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
}