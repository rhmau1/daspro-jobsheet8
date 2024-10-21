import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahCabor = 4, jumlahAtletPerCabor = 5;

        System.out.print("masukkan jumlah politeknik yang mendaftar: ");
        int jumlahPoliteknik = sc.nextInt();
        int i = 1;
        while (i <= jumlahPoliteknik) {
            for (int cabor = 1; cabor <= jumlahCabor; cabor++) {
                String namaCabor = "";
                if (cabor == 1) {
                    namaCabor = "Badminton";
                } else if (cabor == 2) {
                    namaCabor = "Tenis Meja";
                } else if (cabor == 3) {
                    namaCabor = "Basket";
                } else if (cabor == 4) {
                    namaCabor = "Bola Voli";
                }
                for (int atlet = 1; atlet <= jumlahAtletPerCabor; atlet++) {
                    System.out.print("masukkan nama atlet ke " + atlet + " untuk cabang " + namaCabor
                            + " dari politeknik ke " + i + ": ");
                    String namaAtlet = sc.next();
                    System.out.println("nama atlet ke " + atlet + " untuk cabang " + namaCabor + " dari politeknik ke "
                            + i + " adalah " + namaAtlet);
                }
            }
            i++;
        }
    }
}
