public class School{
    private String schoolName;
    private Name principalName = new Name();
    private Address address;
    private Marks marks;
    
    
    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }
    
    
    public void setPrincipalName(String first, String sec, String notmidorfirsot) {
        principalName.setName(first, sec, notmidorfirsot);
    }    
    
    public void setPrincipalName(Name input){
        principalName = input;
    }
    
    public Name getPrincipalName(){
        return principalName;
    }
    
    
    public void setAddress(String street, String district, String postcode, String state){
        address.setAddress(street, district, postcode, state);
    }
    
    public void setAddress(Address address){
        this.address = address;
    }
    
    public Address getAddress(){
        return address;
    }
    
    public void setNumParticipants(int num){
        marks = new Marks(num);
    }
    
    public void setMarks(Marks marks){
        this.marks = marks;
    }
    
    public Marks getMarks(){
        return marks;
    }
}
