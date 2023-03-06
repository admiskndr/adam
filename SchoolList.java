public class SchoolList{
    private School schools[];
    private int schoolCount;
    
    public SchoolList(int schoolCount){
        schools = new School[schoolCount];
        this.schoolCount = schoolCount;
    }
    
    public void setSchool(School school, int index) {
        this.schools[index] = school;
    }
    public School getsSchool(int index) {
        return schools[index];
    }
}
