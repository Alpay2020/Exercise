package de.neuefische.exercise.utils;

import de.neuefische.exercise.model.Student;

public class University {
    //Attribut
    private Student[] students;

    //Constructor
    public University(Student[] studentArray123) {
        this.students = studentArray123;
    }
        //Liste
        public void listPrint() {
        for (int i = 0; i < students.length; i++) {
            System.out.print(this.students[i].getId() + " ");
            System.out.println(this.students[i].getName() + " ");
            }

        }

        //RandomStudent
    public Student randomStudent() {
        int randomIndex = (int) (Math.random() * this.students.length);
        return this.students[randomIndex];
    }


}
