
package midtermdemo;

public class ContactInfo {
    private String homeAdress;
    private String telNumber;
    private String eMail;
    
    public ContactInfo(){
        homeAdress = null;
        telNumber = null;
        eMail = null;
        
    }
     public ContactInfo(String adress ,String telNo ,String mail){
        homeAdress = adress;
        telNumber = telNo;
        eMail = mail;
        
    }
     public ContactInfo(ContactInfo other){
        homeAdress = other.homeAdress;
        telNumber = other.telNumber;
        eMail = other.eMail;
         
     }

    /**
     * @return the homeAdress
     */
    public String getHomeAdress() {
        return homeAdress;
    }

    /**
     * @param homeAdress the homeAdress to set
     */
    public void setHomeAdress(String homeAdress) {
        this.homeAdress = homeAdress;
    }

    /**
     * @return the telNumber
     */
    public String getTelNumber() {
        return telNumber;
    }

    /**
     * @param telNumber the telNumber to set
     */
    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    /**
     * @return the eMail
     */
    public String geteMail() {
        return eMail;
    }

    /**
     * @param eMail the eMail to set
     */
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
     
    @Override
    public String toString(){
        return "Home adress: " + homeAdress+ "\nTel Number: "+ telNumber + "\neMail: " + eMail;
    }
    public boolean equals(ContactInfo other){
        if (other == null) {
            return false;
            }
        else if (this.getClass() != other.getClass()) {
            return false;
        }
        else {
            ContactInfo contact = (ContactInfo) other;
            return (this.getHomeAdress().equals(contact.getHomeAdress()))&& 
                    (this.getTelNumber().equals(contact.getTelNumber()))&&
                    (this.geteMail().equals(contact.geteMail()));
        
            }
       
    }
    
}