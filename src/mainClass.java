import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainClass {
    public static void main(String args[]){
        List<Cinema> cinema = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        addCinema(cinema);
        int option = 0;

        while (option != 4)
        {
            System.out.println("1.Cinema list.");
            System.out.println("2.Seats available");
            System.out.println("3.Reserve a seat");
            System.out.println("4.Exit");
            System.out.print("Write here : ");

            option = scan.nextInt();

            switch (option){
                case 1:
                    for(Cinema t : cinema)
                        System.out.println(t);
                    break;

                case 2:

                    for(Cinema t : cinema){
                        System.out.println(t);
                        t.getSeats();
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Select cinema");
                    int i = 0, cinemaOption;
                    for(Cinema t : cinema)
                        System.out.println((++i) + "." + t);

                    System.out.print("Write here : ");

                    cinemaOption = scan.nextInt();
                    cinema.get(cinemaOption - 1).getSeats();
                    System.out.println();

                    System.out.print("Reserve : ");
                    String reserve = scan.next();

                    if(cinema.get(cinemaOption-1).reserveSeat(reserve)) {
                        System.out.println("Please pay : ");
                    } else {
                        System.out.println("Sorry, seat is taken");
                    }

                    break;

                case 4:
                    System.out.println("Good bye.");
                    break;

                default:
                    System.out.println("Wrong option");
            }

        }

        /*if(cinema.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
        if(cinema.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }*/
    }

    public static void addCinema(List<Cinema> cinema){
        cinema.add(new Cinema("AFI", 12, 12));
        cinema.add(new Cinema("Plaza", 8, 10));
        cinema.add(new Cinema("Mega Mall", 10, 10));
    }
}
