/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc;

/**
 *
 * @author User
 */
public class Person {
    
    //deklarasi variabel
    private String PersonName;
    private String PersonAge;
    
    
    //definisi method getter dan setter 
    public String getAge(){
        return PersonAge;
    }
    
    public void setAge(String Age){
        this.PersonAge = Age;
    }
    
    public String getName(){
        return PersonName;
    }
    
    public void setName(String Name){
        this.PersonName = Name;
    }
}
