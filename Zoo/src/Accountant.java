import java.util.ArrayList;

public class Accountant {
    public static void GetBalance(ArrayList<Animal> animals)
    {
        int count = 0;
        for(int i = 0;i < animals.size();i++)
        {
            if(animals.get(i).Type == AnimalType.HERBIVORE)
            {
                count++;
            }
        }
        System.out.println("Herbivore: " + count);
        System.out.println("Predator: " + (animals.size() - count));
    }
}
