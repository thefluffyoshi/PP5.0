public class Dog
{
    //Instance variables
    String name;
    String breed;
    int age;
    double pounds;

    //Constructors
    public Dog()
    {
        name = null;
        breed = null;
        age = 0;
        pounds = 0.0;
    }//default constructor

    public Dog(String newName, String newBreed, int newAge, double newPounds)
    {
        name = newName;
        breed = newBreed;
        age = newAge;
        pounds = newPounds;
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

    public double getPounds()
    {
        return pounds;
    }//end Pound getter


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

    public void setPounds(double newPounds)
    {
        pounds = newPounds;
    }//end Pounds setter


    //Brain method


    //toString
    public String toString()
    {
        String output = "";
        output += "Name: " + name;
        output += "Breed: " + breed;
        output += "Age: " + age;
        output += "Pounds: " + pounds;
        return output;
    }//end toString
}//end class Dog
