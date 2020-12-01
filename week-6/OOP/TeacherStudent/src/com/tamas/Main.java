package com.tamas;

public class Main {

    public static void main(String[] args) {
//        Hozz létre egy Student és egy Teacher osztályt
//        Student
//        learn() (tanul) -> kiírja, hogy a hallgató tanul valamit
//        question(teacher) (kérdez(tanár)) -> meghívja a tanár answer() metódusát
//                Teacher
//        teach(student) (tanít(tanuló)) -> meghívja a tanuló learn() metódusát
//        answer() -> kiírja, hogy a tanár megválaszol egy kérdést
//        Hozz létre egy-egy Student és Teacher példányt
//        Hívd meg a tanuló question() metódusát és a tanár teach() metódusát

        Student student = new Student();
        Teacher teacher = new Teacher();

        teacher.teach(student);
        student.question(teacher);
    }
}
