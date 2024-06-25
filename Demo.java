/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package midtermdemo;

/**
 *
 * @author lenovo
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContactInfo info01 = new ContactInfo("New York upper eastside" , "052515", "k@mail.com" );
        Person person01 = new Person("Pol Jean",  info01);
        Bus bus1 = new Bus("BMW", "35 CYL 35", person01, 18, 6);
        
        System.out.println(bus1.toString());
        System.out.println("total amount of tax is "+ bus1.calculateTax() +" TL");
        Bus bus2 = new Bus(bus1);
        System.out.println("Are the busses equal?:" + bus1.equals(bus2));       
        
    }
    
}
