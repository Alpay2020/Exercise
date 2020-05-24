package de.neuefische.exercise;

import de.neuefische.exercise.model.Student;
import de.neuefische.exercise.utils.University;

import java.util.ArrayList;

public class AppMain {

    public static void main(String[]args){

        Student[] studentArray = new Student[3];

        studentArray[0] = new Student(1,"Alpay");
        studentArray[1] = new Student(2,"Civan");
        studentArray[2] = new Student(3,"Rolf");

        Student[] studentArray2 = new Student[3];

        studentArray2[0] = new Student(4,"Caro");
        studentArray2[1] = new Student(5,"Sabine");
        studentArray2[2] = new Student(6,"Fabian");

        University university123 = new University(studentArray);

        university123.listPrint();

        System.out.println("-------------------------------");

        for (int i = 0; i < studentArray.length; i++) {

            System.out.println(studentArray[i]);
        }


            System.out.println("Random Student: ");


            System.out.println(university123.randomStudent());
        System.out.println("-------------------------------");


        //ArrayList
        ArrayList<Student> homies = new ArrayList<Student>();
        homies.add(new Student(5,"Hüs"));
        homies.add(new Student(6,"Marwin"));
        homies.add(new Student(7,"Christopher"));

        System.out.println(homies.get(0));
        System.out.println("-------------------------------");


        for (Student hallo : homies) {
            System.out.println(hallo.getName() + " " + hallo.getId());

        }



        }

    }

