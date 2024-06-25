/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermdemo;

/**
 *
 * @author lenovo
 */
public class Person {
    private String name;
    private ContactInfo contactInformation;
    
    public Person(){
        name = null;
        contactInformation = new ContactInfo(null);
    }
    public Person(String theName, ContactInfo contact){
        name = theName;
        contactInformation = new ContactInfo(contact);
    }
    public Person(Person originalObject)
    {
         name = originalObject.name;
         contactInformation = new ContactInfo(originalObject.getContactInformation());
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the contactInformation
     */
    public ContactInfo getContactInformation() {
        return new ContactInfo(contactInformation);
    }

    /**
     * @param contactInformation the contactInformation to set
     */
    public void setContactInformation(ContactInfo contactI) {
        contactInformation = new ContactInfo(contactI);
    }
    
    @Override
    public String toString( )
    {
        return "Name: " + name + " " + contactInformation.toString();
    }
    public boolean equals(Person other) {
        return (name.equals(other.name)) &&
                contactInformation.equals(other.contactInformation);
    }
    
}
