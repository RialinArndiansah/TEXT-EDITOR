import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TextEditor editor = new TextEditor();

        while (true) {
            System.out.println("\nPilih perintah: ");
            System.out.println("1. Show");
            System.out.println("2. Write");
            System.out.println("3. Undo");
            System.out.println("4. Redo");
            System.out.println("5. Exit untuk keluar");
            System.out.print("Masukkan pilihan (1-5): ");

            int command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
                case 1:
                    editor.show();
                    break;
                case 2:
                    System.out.print("Masukkan teks yang ingin ditambahkan: ");
                    String newText = scanner.nextLine();
                    editor.write(newText);
                    break;
                case 3:
                    editor.undo();
                    break;
                case 4:
                    editor.redo();
                    break;
                case 5:
                    System.out.println("Keluar dari editor.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }
    }
}

