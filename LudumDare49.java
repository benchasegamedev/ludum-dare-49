import java.util.Scanner;
public class LudumDare49
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        String [] placeNames = new String [10];
        placeNames[0] = "Springfield";
        placeNames[1] = "Newport";
        placeNames[2] = "Smithfield";
        placeNames[3] = "Lexington";
        placeNames[4] = "Deerfield";
        placeNames[5] = "Berlin";
        placeNames[6] = "Troy";
        placeNames[7] = "Portland";
        placeNames[8] = "Exeter";
        placeNames[9] = "Milton";

        String [] mayorNames = new String [10];
        mayorNames[0] = "Bill";
        mayorNames[1] = "Bob";
        mayorNames[2] = "Ben";
        mayorNames[3] = "Jake";
        mayorNames[4] = "Joe";
        mayorNames[5] = "Peter";
        mayorNames[6] = "Mike";
        mayorNames[7] = "Carl";
        mayorNames[8] = "Charlie";
        mayorNames[9] = "Jim";

        double randPlace = Math.random() * 10;
        String start = placeNames[(int)randPlace];
        double randMayor = Math.random() * 10;
        String mayor = mayorNames[(int)randMayor];

        int end = 0;
        int year = 1;
        double pop = 1000.0;
        int choice = 0;
        int upDown = 0;
        double winPct = 75.0;

        upDown = (int)(Math.random() + 0.5);

        System.out.println("Population Balance");
        System.out.println("by Ben Chase");
        System.out.print("Press 1 to start: ")
        end = in.nextInt();

        while (end != 0)
        {
            System.out.println("Year: " + year);
            System.out.println("Place: " + start);
            System.out.println("Population: " + (int)pop);
            System.out.println("Mayor: " + mayor);
            System.out.println("--------------------------");

            System.out.println("0: End game");
            System.out.println("1: New year");
            System.out.println("2: Elect mayor");
            System.out.print("Choice: ");
            if (pop == 0)
            {
                choice = 0;
            }
            else
            {
                choice = in.nextInt();
            }

            System.out.println("--------------------------");

            if (choice == 2)
            {
                randMayor = Math.random() * 10;
                mayor = mayorNames[(int)randMayor];

                winPct = ((Math.random() * 0.5) + 0.5) * 100;
                upDown = (int)(Math.random() + 0.5);
            }

            if (winPct >= 50 && winPct < 60)
            {
                if (upDown == 0)
                {
                    pop = pop * 1.003;
                }
                else if (upDown == 1)
                {
                    pop = pop * 0.997;
                }
            }

            else if (winPct >= 60 && winPct < 70)
            {
                if (upDown == 0)
                {
                    pop = pop * 1.009;
                }
                else if (upDown == 1)
                {
                    pop = pop * 0.991;
                }
            }

            else if (winPct >= 70 && winPct < 80)
            {
                if (upDown == 0)
                {
                    pop = pop * 1.015;
                }
                else if (upDown == 1)
                {
                    pop = pop * 0.985;
                }
            }

            else if (winPct >= 80 && winPct < 90)
            {
                if (upDown == 0)
                {
                    pop = pop * 1.021;
                }
                else if (upDown == 1)
                {
                    pop = pop * 0.979;
                }
            }

            else if (winPct >= 90)
            {
                if (upDown == 0)
                {
                    pop = pop * 1.027;
                }
                else if (upDown == 1)
                {
                    pop = pop * 0.974;
                }
            }

            year++;
        }
    }
}