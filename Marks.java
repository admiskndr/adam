import java.lang.Math;

public class Marks{
    
    private class Mark{
        int score;
        int ID;
        Name student;
        String className;
        
        Mark(int score, int ID, Name student, String className){
            this.score = score;
            this.ID = ID;
            this.student = student;
            this.className = className;
        }
    }
    
    private Mark marks[];
    private int numdata;
    
    public Marks(int numdata){
        marks = new Mark[numdata];
        this.numdata = numdata;
    }

    public float calcAvg() {
        float sum =0;
        for (int i=0; i<numdata; i++) {
            sum += marks[i].score;
        }
        float avg = sum / numdata;
        return avg;
    }
    
    public double calcStdDev() {
        float avg = this.calcAvg();
        
        float sum =0;
        for (int i=0; i<numdata; i++) {
            sum += ((marks[i].score - avg) * (marks[i].score - avg));
        }
        double stddev = Math.sqrt(sum/numdata);
        return stddev;
    }

    public void setMark(int score, int ID, Name student, String className, int index) {
        this.marks[index] = new Mark(score, ID, student, className);
    }
    public float getMark(int index) {
        return marks[index].score;
    }
}
