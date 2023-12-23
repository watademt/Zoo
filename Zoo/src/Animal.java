public class Animal implements Walker, Voicer{

    public Animal(String name, AnimalType type)
    {
        Name = name;
        Type = type;
    }

    public String Name;
    public AnimalType Type;

    @Override
    public void MakeVoice() {

    }

    @Override
    public void ToWalk() {

    }
}
