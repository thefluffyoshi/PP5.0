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
}//end class Dog
