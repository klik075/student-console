package com.sparta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생 수를 입력하세요: ");
        int studentCount = Integer.parseInt(scanner.nextLine());

        int totalScore = 0;

        for (int i = 1; i <= studentCount; i++) {
            System.out.print(i + "번째 학생 이름: ");
            String name = scanner.nextLine();

            System.out.print(i + "번째 학생 점수: ");
            int score = Integer.parseInt(scanner.nextLine());

            String grade;
            if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }

            totalScore = totalScore + score;
            System.out.println(name + " 학생의 등급은 " + grade + "입니다.");
        }

        int average = totalScore / studentCount;
        System.out.println("평균 점수: " + average);

        scanner.close();
    }
}