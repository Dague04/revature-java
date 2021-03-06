package com.company;

import com.company.exception.StudentGradeException;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class StudentExceptionHandsOn {

    static Logger logger = Logger.getLogger(StudentExceptionHandsOn.class);

    public static void main(String[] args) {

        logger.debug("Process hs started");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your score for the first exam?: ");
        int score = sc.nextInt();
        try {
            score = checkScore(score);
            System.out.println("Your score of "+score+ " is valid");
        }
        catch (StudentGradeException studentGradeException) {
            System.out.println(studentGradeException.getMessage());
        }

    }

    public static int checkScore(int score) throws StudentGradeException {
        if(score < 0) {
            StudentGradeException studentGradeException = new StudentGradeException("Your score cannot be less than zero");
            throw studentGradeException;
        }
        return score;
    }
}
