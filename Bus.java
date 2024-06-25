/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermdemo;

/**
 *
 * @author lenovo
 */
public class Bus extends Vehicle {
    private int capacity;
    private int ageOfBus;
    
    
    public Bus(){
        super();
        capacity = 0;
        ageOfBus = 0; 
    }
     public Bus(String brand, String licencePlate, Person owner, int cC, int AoB){
        super(brand,licencePlate,owner);
        capacity = cC;
        ageOfBus = AoB; 
    }
    public Bus(Bus other){
        super(other );
        capacity = other.capacity;
        ageOfBus = other.ageOfBus;
    }
    public int calculateTax(){
        if (ageOfBus < 5){
            return 4000;
        }
        else if(ageOfBus >=5&& ageOfBus<=10){
            return 3000;
        }
        else{
            return 2000;
        }         
    }
    @Override
    public String toString(){
        return "Capacity: "+ capacity+ " " + "age of bus: "+ ageOfBus + "\n"+ super.toString();
    }
    
    public boolean equals(Object other){
        if (other == null ){
            return false;
        }
        else if (this.getClass() != other.getClass()){
            return false;
            
        }
        else{
            Bus bus =(Bus) other;
            return(this.getAgeOfBus()== (bus.getAgeOfBus()) && 
                    this.getCapacity() == (bus.getCapacity())&&
                    getBrand().equals(bus.getBrand())&&
                    getLicencePlate().equals(bus.getLicencePlate())&&
                    getOwner().equals(bus.getOwner()));
            
        }
        
    }

    /**
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * @return the ageOfBus
     */
    public int getAgeOfBus() {
        return ageOfBus;
    }

    /**
     * @param ageOfBus the ageOfBus to set
     */
    public void setAgeOfBus(int ageOfBus) {
        this.ageOfBus = ageOfBus;
    }
    
     
}
