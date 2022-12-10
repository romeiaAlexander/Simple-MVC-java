/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc;

/**
 *
 * @author User
 */
public class PersonController {
    
    //deklarasi model dan view
    private Person model;
    private PersonView view;
    
    //inisiasi konstruktor
    public PersonController(Person model, PersonView view){
        this.model = model;
        this.view = view;
    }
    
    //membuat method getter dan setter
    public void setPersonName(String name){
        model.setName(name);
    }
    
    public String getPersonName(){
        return model.getName();
    }
    
        public void setPersonAge(String age){
        model.setAge(age);
    }
    
    public String getPersonAge(){
        return model.getAge();
    }
    
    
    //method untuk mengupdate view
    public void updateView(){
        view.printPersonDetails(model.getName(), model.getAge());
    }
}
