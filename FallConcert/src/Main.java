import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Concert> concerts = new ArrayList<>();

        readConcertData(concerts, "concertdata.txt");





    }

    public static void readConcertData( ArrayList<Concert> concerts, String filename ) throws FileNotFoundException {
        FileReader reader = new FileReader(filename);
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNextLine()) {
            String ven = scanner.nextLine();
            String[] PHolder = ven.split("\\*");
            if (PHolder.length < 2) {
                System.out.println("Error" + ven);
                continue;
            }
            String venue = PHolder[0];
            double cost1 = Double.parseDouble(PHolder[1]);

            String MusicianThing = scanner.nextLine();
            String[] MusicianThings = MusicianThing.split(", ");
            String name = MusicianThings[0];
            String specialty = MusicianThings[1];

            int rank = Integer.parseInt(MusicianThings[2]);

            String InName = scanner.nextLine();
            String man = scanner.nextLine();
            double weight = scanner.nextDouble();
            scanner.nextLine();

            Musician musician = new Musician(name, specialty, rank);
            Instrument instrument = new Instrument(InName, man, weight);

            Concert concert = new Concert(venue,cost1,musician,instrument);


            concerts.add(concert);







        }
        System.out.println(concerts);
    }
}