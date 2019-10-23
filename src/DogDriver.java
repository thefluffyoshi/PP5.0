public class DogDriver
{
    public static void main (String args[])
    {
        Dog dog1 = new Dog("Fang", 5, "Husky", 80);
        Dog dog2 = new Dog("Nutmeg", 12, "Australian Sheepdog", 45);
        Dog dog3 = new Dog("Rilakkuma", 2, "Corgi", 50);

        //testing getters
        System.out.println("Fang is a "+ dog1.getBreed() + " and is " + dog1.getAge() + " years old.");
        System.out.println("");
        System.out.println("Nutmeg is " + dog2.getPounds() + " lbs.");
        System.out.println("In kilos " + dog2.toPoundsKilo());
        System.out.println("");
        System.out.println(dog3);
        System.out.println("In kilos " + dog3.toPoundsKilo());
        System.out.println("");
        System.out.println("There are " + Dog.getCount() + " dogs in this list.");
    }//end main
}//end class DogDriver
