package org.fasttrackit.homework10;

import java.io.*;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class StudentGrade {
    private String name;
    private String discipline;
    private int grade;

    public StudentGrade(String name, String discipline, int grade) {
        this.name = name;
        this.discipline = discipline;
        this.grade = grade;
    }

    @Override
    public String toString(){
        return this.name + " " + this.discipline + " " + this.grade;
    }
}