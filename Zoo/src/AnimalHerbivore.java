public class AnimalHerbivore extends Animal implements Walker, Voicer{
    public AnimalHerbivore(String name, AnimalType type) {
        super(name, type);
    }

    @Override
    public void MakeVoice() {
        System.out.println(Name + "`s HerbivoreVoice");
    }

    @Override
    public void ToWalk() {
        System.out.println(Name + "`s HerbivoreWalk");
    }
}
