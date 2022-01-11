package com.company.exception;

public class StudentGradeException extends Exception {
    public StudentGradeException() {
    }

    public StudentGradeException(String message) {
        super(message);
    }

    public StudentGradeException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentGradeException(Throwable cause) {
        super(cause);
    }
}
