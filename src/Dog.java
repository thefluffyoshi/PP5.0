public class Dog
{
    //Instance variables
    String name;
    String breed;
    int age;
    int pounds;
    static int count = 0;

    //Constructors
    public Dog()
    {
        name = null;
        breed = null;
        age = 0;
        pounds = 0;
        count++;
    }//default constructor

    public Dog(String newName, int newAge, String newBreed, int newPounds)
    {
        this.name = newName;
        this.breed = newBreed;
        this.age = newAge;
        this.pounds = newPounds;
        count++;
    }//end multi-arg constructor


    //Getters
    public String getName()
    {
        return name;
    }//end Name getter

    public String getBreed()
    {
        return breed;
    }//end Breed getter

    public int getAge()
    {
        return age;
    }//end Age getter

    public int getPounds()
    {
        return pounds;
    }//end Pound getter

    public static int getCount()
    {
        return count;
    }//end dog count


    //Setters
    public void setName(String newName)
    {
        name = newName;
    }//end Name setter

    public void setBreed(String newBreed)
    {
        breed = newBreed;
    }//end Breed setter

    public void setAge(int newAge)
    {
        age = newAge;
    }//end Age setter

    public void setPounds(int newPounds)
    {
        pounds = newPounds;
    }//end Pounds setter


    //Brain method
    public String toPoundsKilo()
    {
        double kilo = (pounds * 0.45359237);
        return kilo + " kilo";
    }//end conversion pounds to kilo


    //toString
    public String toString()
    {
        String output = "";
        output += "Name: " + name;
        output += "Age: " + age;
        output += "Breed: " + breed;
        output += "Pounds: " + pounds;
        return output;
    }//end toString
}//end class Dog
