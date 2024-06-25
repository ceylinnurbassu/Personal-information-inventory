/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermdemo;

/**
 *
 * @author lenovo
 */
public abstract class Vehicle {
    private String brand;
    private String licencePlate;
    private Person owner;
    
    public Vehicle(){
        brand = null;
        licencePlate = null;
        owner = new Person(null);
       
    }
     public Vehicle(String br , String plate, Person own){
        brand = br;
        licencePlate = plate;
        owner = new Person(own);
      
    }
     public Vehicle(Vehicle originalObject)
    {
         brand = originalObject.brand;
         licencePlate = originalObject.licencePlate;
         owner = new Person(originalObject.getOwner());
    }
     public abstract int calculateTax();
    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the licencePlate
     */
    public String getLicencePlate() {
        return licencePlate;
    }

    /**
     * @param licencePlate the licencePlate to set
     */
    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    /**
     * @return the owner
     */
    public Person getOwner() {
        return new Person(owner);
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(Person own) {
        owner = new Person(own);
    }
    @Override
    public String toString( )
    {
        return "brand: " + brand +" licence plate: "+ licencePlate+" " + owner.toString();
    }
    public boolean equals(Vehicle other) {
        return (brand.equals(other.brand)) && (licencePlate.equals(other.licencePlate)) &&
                owner.equals(other.owner);
    }
    
    
    
}
