package main.concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparableVsComparator {
    public static void main(String[] args) {
        Student s1 = new Student(1,"abhi",7.5f);
        Student s2 = new Student(2,"nithya",6.5f);
        Student s3 = new Student(3,"chaitra",8.5f);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s2);
        studentList.add(s1);
        studentList.add(s3);

        Collections.sort(studentList);
         Collections.sort(studentList,new IdComparator());

        List<Student> sortedList = studentList.stream().sorted().collect(Collectors.toList());

         Collections.sort(studentList,new Comparator<Student>(){

             @Override
             public int compare(Student s1, Student s2) {
                 return s1.compareTo(s2);
             }
         });


        Collections.sort(studentList, (o1, o2) -> {
            if(o1.getId() == o2.getId())
                return 0;
            else if (o1.getId() > o2.getId()) {
                return 1;
            }else {
                return -1;
            }
        });

        Collections.sort(studentList, Comparator.comparing(Student::getCgpa).reversed());


        System.out.println(studentList);

    }
}

class IdComparator implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getId() == s2.getId())
            return 0;
        else if (s1.getId() > s2.getId()) {
            return 1;
        }else {
            return -1;
        }
    }
}

class Student implements Comparable<Student>{
    int id;
    String name;
    float cgpa;

    @Override
    public int compareTo(Student s) {
        if(id == s.id)
            return 0;
        else if (id > s.id) {
            return 1;
        }else {
            return -1;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public Student(int id, String name, float cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }


}
