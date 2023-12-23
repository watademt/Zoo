public class Customer extends Person implements Walker, Speaker{

    public Customer(String n) {
        super(n);
    }

    @Override
    public void ToSpeak() {
        System.out.println(GetName() + "`s CustomerSpeak");
    }

    @Override
    public void ToWalk() {
        System.out.println(GetName() + "`s CustomerWalk");
    }
}
