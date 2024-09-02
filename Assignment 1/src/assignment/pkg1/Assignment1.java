/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment.pkg1;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author kuri
 */
public class Assignment1 {

    public static void main(String[] args) {
        Scanner ScannerObj = new Scanner(System.in);
        String[][] StudentArraysMain = new String[5][];
        StudentArraysMain[0] = new String[]{};
        StudentArraysMain[1] = new String[]{};
        StudentArraysMain[2] = new String[]{};
        StudentArraysMain[3] = new String[]{};
        StudentArraysMain[4] = new String[]{};
                
        String Option1 = "1";
        
        // Declaring arrays
        int[] StudentId = {};
        String[] StudentName = {};
        int[] StudentAge = {};
        String[] StudentEmail = {};
        String[] StudentCourse = {};
        
        
        System.out.println("STUDENT MANAGEMENT APPLICATION");
        System.out.println("******************************************");
        System.out.println("Enter (1) to launch menu or any other key to exit");
        String MenuSelectInput = ScannerObj.nextLine();
        
        
        do {
            if(MenuSelectInput.equals(Option1)) {
                System.out.println("\n"+ "\n");
                System.out.println("Please select one of the following menu items:"+ "\n"+ "\n");
                System.out.println("(1) Capture a new student");
                System.out.println("(2) Search for a student");
                System.out.println("(3) Delete a student");
                System.out.println("(4) Print student report");
                System.out.println("(5) Exit Application");
                String SecondMenuSelectInput = ScannerObj.nextLine();

                // method selection option functions
                if (SecondMenuSelectInput.equals("1")) {
                   //StudentArraysMain = CreatingStudentData();
                   
                    // get User Inputs //
                    System.out.print("Enter the student id: ");
                    String StudentIdInput = ScannerObj.nextLine();

                    System.out.print("Enter the student name: ");
                    String StudentNameInput = ScannerObj.nextLine();
                    String StudentAgeInput;
                    do {

                        System.out.print("Enter the student age: ");
                        StudentAgeInput = ScannerObj.nextLine();

                        if(Integer.valueOf(StudentAgeInput) < 16) {
                            System.out.println("Student age is below 16 or input is not an integer");
                        }

                    } while (Integer.valueOf(StudentAgeInput) < 16);

                        System.out.print("Enter the student email: ");
                        String StudentEmailInput = ScannerObj.nextLine();

                        System.out.print("Enter the student course: ");
                        String StudentCourseInput = ScannerObj.nextLine();
                       ////////////

                   
                   StudentArraysMain = CreatingStudentData(StudentIdInput,StudentNameInput,StudentAgeInput,StudentEmailInput, StudentCourseInput);
                   for (String x1 : StudentArraysMain[0]) {
                       System.out.println(x1);
                   }
                    /*﻿*/
                }
                
                if (SecondMenuSelectInput.equals("2")) {
                    System.out.print("Search for student ");
                    String SearchStudentbyId = ScannerObj.nextLine();
                    SearchStudentbyId(SearchStudentbyId, StudentArraysMain);
                }
                
                if (SecondMenuSelectInput.equals("3")) {
                    StudentArraysMain = DeleteStudentInfo(StudentArraysMain);
                }
                
                if (SecondMenuSelectInput.equals("4")) {
                    ShowReport(StudentArraysMain);
                }
            
            }
        } while (true);

        
    }
    

     // method to append student data
     public static String[][] CreatingStudentData(String StudentIdInput,String StudentNameInput, String StudentAgeInput, String StudentEmailInput,String StudentCourseInput) {
                Scanner ScannerObj = new Scanner(System.in);
                
                // Declaring multidimensional array
                String[][] StudentArrays = new String[5][];
                StudentArrays[0] = new String[]{};
                StudentArrays[1] = new String[]{};
                StudentArrays[2] = new String[]{};
                StudentArrays[3] = new String[]{};
                StudentArrays[4] = new String[]{};
                

                // Appending student inputs

                    
                    
                    // Appending Student values to arrays
                    StudentArrays[0] = Arrays.copyOf(StudentArrays[0], StudentArrays[0].length + 1);
                    StudentArrays[0][StudentArrays[0].length - 1] = StudentIdInput; 

                    StudentArrays[1] = Arrays.copyOf(StudentArrays[1], StudentArrays[1].length + 1);
                    StudentArrays[1][StudentArrays[1].length - 1] = StudentNameInput; 

                    StudentArrays[2] = Arrays.copyOf(StudentArrays[2], StudentArrays[2].length + 1);
                    StudentArrays[2][StudentArrays[2].length - 1] = StudentAgeInput; 

                    StudentArrays[3] = Arrays.copyOf(StudentArrays[3], StudentArrays[3].length + 1);
                    StudentArrays[3][StudentArrays[3].length - 1] = StudentEmailInput; 

                    StudentArrays[4] = Arrays.copyOf(StudentArrays[4], StudentArrays[4].length + 1);
                    StudentArrays[4][StudentArrays[4].length - 1] = StudentCourseInput; 
                    
                    System.out.println("Student data saved");
                    
        return StudentArrays;
     }
     
     
     // mehtod to search for student by id
     public static String SearchStudentbyId(String SearchStudentVal, String[][] array) {
        String OutputVal = "Student with Student Id: "+SearchStudentVal+" was found!";
        for(String IdVal : array[0]) {
            System.out.println(IdVal);
            if(IdVal.equals(SearchStudentVal)) {
                OutputVal = "Student with Student Id: "+SearchStudentVal+" was found!";
                System.out.println("Student with Student Id: "+SearchStudentVal+" was found!");
            } else {
                OutputVal = "Student with Student Id: "+SearchStudentVal+" was not found!";
                System.out.println("Student with Student Id: "+SearchStudentVal+" was not found!");
            }
        }

        return OutputVal;
     }
     
     
     // method to delete student
     public static String[][] DeleteStudentInfo(String[][] array) {
         int ArrayIndex = 0;
            String[][] NewStudentArrays = new String[5][];
            NewStudentArrays[0] = new String[]{};
            NewStudentArrays[1] = new String[]{};
            NewStudentArrays[2] = new String[]{};
            NewStudentArrays[3] = new String[]{};
            NewStudentArrays[4] = new String[]{};
            
        for(String Deleteval : NewStudentArrays[0]) {
            
        /////////////////////////////////////////////////////////////////////    
        if (ArrayIndex < 0 || ArrayIndex >= NewStudentArrays[0].length) {
                System.out.println("Index out of bounds");
            }

            int[] newArray = new int[NewStudentArrays[0].length - 1];

            for (int i = 0, j = 0; i < NewStudentArrays[0].length; i++) {
                if (i != ArrayIndex) {
                    NewStudentArrays[0][j++] = NewStudentArrays[0][i];
                }
            }
        
        
        ArrayIndex++;
        }   
    

         return null;
     }
     
     
     // method to show student report listing all student information
     public static String[][] ShowReport(String[][] StudentArraysMain) {
       int StudentNum = 0;
       int StudentNumPos = 1;
       
       for(String numStud : StudentArraysMain[0]) {
           System.out.println("STUDENT "+StudentNumPos);
           System.out.println("----------------------------");
       
           System.out.println("STUDENT ID: "+StudentArraysMain[0][StudentNum]);
           System.out.println("STUDENT NAME: "+StudentArraysMain[1][StudentNum]);
           System.out.println("STUDENT AGE: "+StudentArraysMain[2][StudentNum]);
           System.out.println("STUDENT EMAIL: "+StudentArraysMain[3][StudentNum]);
           System.out.println("STUDENT COURSE: "+StudentArraysMain[4][StudentNum]);
           System.out.println("----------------------------");
           
           
           StudentNum++;
           StudentNumPos++;
       }
       
         
       return null;
     }
}

