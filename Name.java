public class Name{
    private String firstName;
    private String middleName;
    private String lastName;
    
    public Name(String first, String sec, String notmidorfirsot) {
        firstName = first;
        middleName = sec;
        lastName = notmidorfirsot;
    }   
    
    public Name(){
        
    }
    
    public boolean sameName(String toCheck){
        if (firstName == toCheck || middleName == toCheck || lastName == toCheck)
                return true;
        else
            return false;
    }
    
    public void setName(String first, String sec, String notmidorfirsot) {
        firstName = first;
        middleName = sec;
        lastName = notmidorfirsot;
    }    
}
