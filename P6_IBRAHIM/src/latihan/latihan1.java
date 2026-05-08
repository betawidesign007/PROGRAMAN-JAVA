/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;
    class StudentRecord {
        private String name;
        private String address;
        private int age;
        private double mathGrade;
        private double englishGrade;
        private double scienceGrade;

    
    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setMathGrade(double mathGrade){
        this.mathGrade = mathGrade;
    }

    public void setEnglishGrade(double englishGrade){
        this.englishGrade = englishGrade;
    }

    public void setScienceGrade(double scienceGrade){
        this.scienceGrade = scienceGrade;
    }

    public String getName(){
        return name;
    }

    public double getMathGrade(){
        return mathGrade;
    }

    public double getEnglishGrade(){
        return englishGrade;
    }

    public double getScienceGrade(){
        return scienceGrade;
    }

    public void print(String temp){
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("Age : " + age);
    }

    public void print(double eGrade, double mGrade, double sGrade){
        System.out.println("Name : " + name);
        System.out.println("Math Grade : " + mGrade);
        System.out.println("English Grade : " + eGrade);
        System.out.println("Science Grade : " + sGrade);
    }
        
    }
/**
 *
 * @author betawi
 */
public class latihan1 {
    public static void main(String[] args){

        StudentRecord annaRecord = new StudentRecord();

        annaRecord.setName("Anna");
        annaRecord.setAddress("Philippines");
        annaRecord.setAge(15);
        annaRecord.setMathGrade(80);
        annaRecord.setEnglishGrade(95.5);
        annaRecord.setScienceGrade(100);

        annaRecord.print(annaRecord.getName());

        annaRecord.print(
            annaRecord.getEnglishGrade(),
            annaRecord.getMathGrade(),
            annaRecord.getScienceGrade()
        );
    }
}
