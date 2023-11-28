
public class Main {
    public static void main(String[] args) {
        int a = 4, b = 6;
        int risultato = a*b;
        System.out.println("Stampo il prodotto: " + risultato);


        String y = "Hello";
        System.out.println(concat(y , 2));

        String[] arrayDiStringhe = {"Hello", "my", "name", "is", "Bianca"};

        }

    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arrayDiStringhe = new String[3];
        System.out.println("Componi una stringa");
        arrayDiStringhe[0] = scan.nextLine();
        System.out.println("Componi una seconda stringa");
        arrayDiStringhe[1] = scan.nextLine();
        System.out.println("Componi una terza stringa");
        arrayDiStringhe[2] = scan.nextLine();

        System.out.println("Here the strings concatenated");
        System.out.println( arrayDiStringhe[0] + arrayDiStringhe[1] + arrayDiStringhe[2]);




    }
    }
