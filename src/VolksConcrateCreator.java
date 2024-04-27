/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */

////a classe é responsável por criar instâncias de carros da marca Volkswagen, ela implementa o método factoryMethod, que é responsável por criar e retornar um objeto do tipo Car
public class VolksConcrateCreator extends CarCreator {

protected Car factoryMethod(){
    
        return new ConcrateProductGol();
}
}