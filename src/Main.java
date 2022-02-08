import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String title = askTitleFilm();
        String directorName = askDirectorName();
        boolean isPorn = askIsPorn();

        Film film = new Film(title,directorName,isPorn);
    }
    private static void showFilm(Film film) {
        System.out.println("The title of the film is: " + film.getTitle() + " the name director is: " + film.getDirectorName() + " and the film is " + film.isPorn() + " porn");
    }

    private static boolean askIsPorn() {

        String isSTRPorn = "";

        System.out.println("Write y or n");
        Scanner scan = new Scanner(System.in);
        isSTRPorn = scan.nextLine();

        if (isSTRPorn.equalsIgnoreCase("Y")) {
            return true;
        } else {
            return false;
        }
    }

    private static String askDirectorName() {
        System.out.println("Write the name of the director");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    private static String askTitleFilm() {
        System.out.println("Write the title of the film");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}
