/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
// o código cria duas instâncias de classes que implementam a interface CarCreator, uma para a marca Fiat e outra para a marca Volkswagen, e solicita a construção de carros para ambas as marcas.
import javax.swing.JOptionPane;
        
public class Client {
    
    public static void main(String[] args) {
        
        
        
                    Carcreator carcreator1 = new FiatConcrateCreator();
                    creator1.buildCar();
                    
                    Carcreator carcreator2 = new VolksConcrateCreator();
                    creator2.buildCar();
                    
                    
    }
    
}
