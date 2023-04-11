package org.fasttrackit.homework10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<StudentGrade> readGrades(String pathToGrades) throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader(pathToGrades));
        List<StudentGrade> result = new ArrayList<>();
        for (String line: reader.lines().toList()){
            String[] fields = line.split("\\|");
            StudentGrade studentGrade = new StudentGrade(fields[0], fields[1], Integer.parseInt(fields[2]));
            result.add(studentGrade);
        }
        return result;
    }
    public static void main(String[] args) throws FileNotFoundException {
        List<StudentGrade> grades =  readGrades("Files/grades.txt");
        for (StudentGrade grade: grades){
            System.out.println(grade);
        }
    }
}
