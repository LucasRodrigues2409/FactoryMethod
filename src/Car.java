/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */

//O código está definindo uma classe chamada "Car" ela está sendo declarada como abstrata ela não pode ser instaciada diretamente é apenas usada como modelo, nela são fornecidos metodo para acessar e modificar as informações de um carro como modelo, fabrica e categoria
public abstract class Car {
    
    private String model;
    private String factory;
    private String category;
    
    public void showInformation() {
        
    System.out.println("Model:" + this.getModel() + " \nFactory:" + this.getFactory() + "\nCategory: " + this.getCategory());
        
    }
    
    public String getModel() {
        return model;
       
    }
    
    public void getModel (String model) {
        this.model = model;
    }
    
    public String getFactory() {
        return factory;
    }
    
    public void setFactory(String factory) {
        this.factory = factory;
        
    }
    
    public String getCategory() {
        return category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
}

