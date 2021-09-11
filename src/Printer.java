public class Printer {
    ConsoleScanner scan = new ConsoleScanner();

    public void print() {

        Menu menu = new Menu();
        while (true) {
            int input = scan.result();
            menu.menu();
            if (input == 1) {

            } else if (input == 2) {

            } else if (input == 3) {

            } else if (input == 4) {

            } else if (input == 5) {

            } else if (input == 6) {

            } else if (input == 7) {
                break;
            }
        }

    }


}
