public class Main
{
	public static void main(String[] args) {
	    SchoolList listSK = new SchoolList(10);
		School sk1 = new School();

        // Direct access to attributes is not a good practices
        sk1.setSchoolName("SK Satu");

        Address addr = new Address();
        addr.setStreet("Jalan 2");
        addr.setDistrict("JB");
        addr.setPostcode("30021");
        addr.setState("Johor");
        sk1.setAddress(addr);

        Name mike = new Name();
        Name adila = new Name();
        Name imran = new Name();

        mike.setName("Michael", "Muhammad", "Timms");
        adila.setName("Adlin", "The Abomination", "Fueg");
        imran.setName("Syed", "'Viper'", "Imran");
        
        Marks sk1marks = new Marks(5);
        sk1marks.setMark(50, 01, mike, "1 Cempaka", 0);
        sk1marks.setMark(52, 02, adila, "1 Cempaka", 1);
        sk1marks.setMark(93, 03, imran, "1 Cempaka", 2);
        sk1marks.setMark(42, 01, mike, "1 Cempaka", 3);
        sk1marks.setMark(70, 02, adila, "1 Cempaka", 4);
        sk1.setMarks(sk1marks);
        
        Marks marks = sk1.getMarks();
        System.out.println("Average = " + marks.calcAvg());
        System.out.println("Standard Deviation = " + marks.calcStdDev());
    }
}
