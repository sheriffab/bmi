import java.util.GregorianCalendar;

public class PersonWeight  {
    private String Name;
    private int BirthYear;
    private Double Height;
    private Double Weight;

    PersonWeight(){
        Name = "noname";
       BirthYear = 1000;
       Height = 0.0;
       Weight = 0.0;
    }
    PersonWeight(String Name, int BirthYear, Double Height, Double Weight){
        this.Name = Name;
        if(BirthYear > 0.0){this.BirthYear = BirthYear;}
        if(Height > 0.0){this.Height = Height;}
        if(Weight > 0.0){this.Weight = Weight;}
    }

    public int computeAge(){
        return new GregorianCalendar().get(GregorianCalendar.YEAR) - BirthYear;
    }

    public double computeBMI(double Height, double Weight){
        return Weight/(Height*Height);
    }

    // setters
    public void setName(String Name){
        this.Name = Name;
    }
    public void setBirthYear(int BirthYear){
        this.BirthYear = BirthYear;
    }
    public void setHeight(double Height){
        this.Height = Height;
    }
    public void setWeight(double Weight){
        this.Weight = Weight;
    }

    //Getters
    public String getName(){
        return Name;
    }
    public int getBirthYear(){
        return BirthYear;
    }
    public double getHeight(){
        return Height;
    }
    public double getWeight(){
        return Weight;
    }
}
