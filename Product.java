/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aaa;


/**
 *
 * @author rakan
 */
public class Product {
    private String Name;
    private String description;
    private float prise;
    private int quantity;
    private int discont;
    
    public Product(String Name, String description, float prise, int quantity, int discont) {
        this.Name = Name;
        this.description = description;
        this.prise = prise;
        this.quantity = quantity;
        this.discont = discont; 
        
    }
//     public Product(){
//     }
    public Product(){
        this.Name = " No Name";
        this.description = " No description";
        this.prise = 0.0f;
        this.quantity = 0;
        this.discont = 0; 
    }
    public void display(){
        System.out.println("Name = "+Name); 
        System.out.println("description = "+description);
        System.out.println("prise = "+prise); 
        System.out.println("quantity = "+quantity);
        System.out.println("discont = "+discont); 
    }
     public Product(String Name, String description, float prise){
        this.Name = Name;
        this.description = description;
        this.prise = prise;
     }        

   
}
