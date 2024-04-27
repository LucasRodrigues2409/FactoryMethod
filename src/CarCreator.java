/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */

//implementa o padrão de projeto Factory Method, basicamente fornece a estrutura para criar objetos do tipo carro mas passa a responsabilidade de como são criados para subclasses especificas 
public abstract class CarCreator {
        
    public void buildCar()
    {
        Car carro = factoryMethod();
    }
    
    protected abstract Car factoryMethod();
    
}
