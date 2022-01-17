package com.company;

public class Main {

    public static void main(String[] args) {
        //solution1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        //solution2
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + upperFullName);

        //solution3
        String newFullName = fullName.replace(" ", "; ");
        System.out.println("Данные ФИО сотрудника для административного отдела - " + newFullName);

        //solution4
        String fullName2 = "Иванов Семён Семёнович";
        String newFullName2 = fullName2.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + newFullName2);
    }
}
