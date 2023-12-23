public class Stuff extends Person implements Walker, Speaker{
    public Stuff(String n) {
        super(n);
    }

    @Override
    public void ToSpeak() {
        System.out.println(GetName() + "`s StuffSpeak");
    }

    @Override
    public void ToWalk() {
        System.out.println(GetName() + "`s StuffWalk");
    }
}
