public class AnimalPredator extends Animal implements Walker, Voicer{
    public AnimalPredator(String name, AnimalType type) {
        super(name, type);
    }

    @Override
    public void MakeVoice() {
        System.out.println(Name + "`s PredatorVoice");
    }

    @Override
    public void ToWalk() {
        System.out.println(Name + "`s PredatorWalk");
    }
}
