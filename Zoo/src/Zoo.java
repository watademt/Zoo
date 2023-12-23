import java.util.ArrayList;

public class Zoo {
    private Cage<AnimalHerbivore> herbivoreCage = new Cage();
    private Cage<AnimalPredator> predatorCage = new Cage();

    public ArrayList<Animal> GetAllAnimals()
    {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        for(int i = 0;i < herbivoreCage.animals.size();i++)
        {
            animals.add(herbivoreCage.animals.get(i));
        }
        for(int i = 0;i < predatorCage.animals.size();i++)
        {
            animals.add(predatorCage.animals.get(i));
        }
        return animals;
    }

    public Cage GetHerbivoreCage()
    {
        return herbivoreCage;
    }

    public Cage GetPredatorCage()
    {
        return predatorCage;
    }

    public void AddHerbivore(String name)
    {
        herbivoreCage.animals.add(new AnimalHerbivore(name, AnimalType.HERBIVORE));
    }

    public void AddPredator(String name)
    {
        predatorCage.animals.add(new AnimalPredator(name, AnimalType.PREDATOR));
    }

    public void ShowAllAnimals()
    {
        ArrayList<Animal> animals = GetAllAnimals();
        for(int i = 0;i < animals.size();i++)
        {
            System.out.println((i + 1) + ": " + animals.get(i).Name + " Type: " + animals.get(i).Type);
        }
    }

    public void ShowHerbivore()
    {
        for(int i = 0;i < herbivoreCage.animals.size();i++)
        {
            System.out.println((i + 1) + ": " + herbivoreCage.animals.get(i).Name);
        }
    }

    public void ShowPredator()
    {
        for(int i = 0;i < predatorCage.animals.size();i++)
        {
            System.out.println((i + 1) + ": " + predatorCage.animals.get(i).Name);
        }
    }
}
