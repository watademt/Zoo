import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Zoo zoo = new Zoo();
        Customer customer = new Customer("Dave");
        Stuff stuff = new Stuff("Steve");
        int k,j,l,a = 0;
        String animalsName = null;

        while (true)
        {
            System.out.println("1 - Zoo Operations");
            System.out.println("2 - Accountant Operations");
            System.out.println("3 - Zoo Interactions");
            System.out.println("0 - exit");
            k = Integer.parseInt(in.nextLine());
            switch (k)
            {
                case 1:
                    while (true)
                    {
                        System.out.println("1 - Add Herbivore Animal");
                        System.out.println("2 - Add Predator Animal");
                        System.out.println("3 - Show Herbivore Animal");
                        System.out.println("4 - Show Predator Animal");
                        System.out.println("5 - Show All Animals");
                        System.out.println("0 - exit");
                        j = Integer.parseInt(in.nextLine());
                        switch (j)
                        {
                            case 1:
                                System.out.print("Enter Animals name: ");
                                animalsName = in.nextLine();
                                zoo.AddHerbivore(animalsName);
                                break;
                            case 2:
                                System.out.print("Enter Animals name: ");
                                animalsName = in.nextLine();
                                zoo.AddPredator(animalsName);
                                break;
                            case 3:
                                zoo.ShowHerbivore();
                                break;
                            case 4:
                                zoo.ShowPredator();
                                break;
                            case 5:
                                zoo.ShowAllAnimals();
                                break;
                        }
                        if(j == 0)
                        {
                            j = -1;
                            break;
                        }
                    }
                    break;
                case 2:
                    while(true)
                    {
                        System.out.println("1 - Show number of herbivore and predator");
                        System.out.println("0 - exit");
                        l = Integer.parseInt(in.nextLine());
                        if(l == 1)
                        {
                            Accountant.GetBalance(zoo.GetAllAnimals());
                        }
                        if (l == 0)
                        {
                            l = -1;
                            break;
                        }
                    }
                    break;
                case 3:
                    while (true)
                    {
                        System.out.println("1 - Random herbivore animal voice");
                        System.out.println("2 - Random predator animal voice");
                        System.out.println("3 - Random herbivore animal walk");
                        System.out.println("4 - Random predator animal walk");
                        System.out.println("5 - Customer speak");
                        System.out.println("6 - Customer walk");
                        System.out.println("7 - Stuff speak");
                        System.out.println("8 - Stuff walk");
                        System.out.println("0 - exit");
                        a = Integer.parseInt(in.nextLine());
                        switch (a)
                        {
                            case 1:
                                AnimalHerbivore animalHerbivore1 = (AnimalHerbivore) zoo.GetHerbivoreCage().animals.get(getRandomNumber(0,zoo.GetHerbivoreCage().animals.size()));
                                animalHerbivore1.MakeVoice();
                                break;
                            case 2:
                                AnimalPredator animalPredator1 = (AnimalPredator) zoo.GetPredatorCage().animals.get(getRandomNumber(0,zoo.GetPredatorCage().animals.size()));
                                animalPredator1.MakeVoice();
                                break;
                            case 3:
                                AnimalHerbivore animalHerbivore2 = (AnimalHerbivore) zoo.GetHerbivoreCage().animals.get(getRandomNumber(0,zoo.GetHerbivoreCage().animals.size()));
                                animalHerbivore2.ToWalk();
                                break;
                            case 4:
                                AnimalPredator animalPredator2 = (AnimalPredator) zoo.GetPredatorCage().animals.get(getRandomNumber(0,zoo.GetPredatorCage().animals.size()));
                                animalPredator2.ToWalk();
                                break;
                            case 5:
                                customer.ToSpeak();
                                break;
                            case 6:
                                customer.ToWalk();
                                break;
                            case 7:
                                stuff.ToSpeak();
                                break;
                            case 8:
                                stuff.ToWalk();
                                break;

                        }
                        if(a == 0)
                        {
                            break;
                        }
                    }
                    break;
            }


            if(k == 0)
            {
                break;
            }
        }
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}