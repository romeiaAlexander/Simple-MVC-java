/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mvc;

/**
 *
 * @author User
 */
public class MVC {

    public static void main(String[] args) {
        
        //mengambil data person database
        Person model = retrivePersonFromDatabase();
        
        //membuat view untuk menulis nama person baru di console
        PersonView view = new PersonView();
        
        PersonController controller = new PersonController(model, view);
        
        controller.updateView();
        
        //mengupdate model data
        controller.setPersonName("Romei");
        System.out.println("\n Person Details after updating: ");
        
        controller.updateView();
    }
    
    private static Person retrivePersonFromDatabase(){
        Person Person = new Person();
        Person.setName("Alexander");
        Person.setAge("20");
        return Person;
    }
}
