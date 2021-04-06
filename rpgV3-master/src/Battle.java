import java.util.ArrayList;
import java.util.Scanner;

public class Battle {
    private ArrayList<Item> arrItem = new ArrayList<>();
    Player player;
    Enemy enemy;

    private Scanner sc = new Scanner(System.in);

    public Battle() {

        /*if (player.attackChance()>enemy.attackChance()){
            player.attack(enemy);
        }else{
            enemy.attack(player);
        }*/

    }

    public void pilihanAksi() {
        System.out.println("**** Pilihan Aksi pada Musuh *** ");
        //disamakan dengan  ruangan
        //bisa direfactoring nanti supaya tdk duplikasi

        //aksi2 item yang dimiliki player
        int urutPil = 0;  //item
        int subPil;   //aksinya
        for (Item objBattle : arrItem) {
            urutPil++;
            subPil = 0;   //sistem penomorannya 11  12  13 dst
            System.out.println(objBattle.getNama());
            //ambil pilihannya
            ArrayList<String> arrPil = objBattle.getAksi();
            //print pilihan
            for (String strPil : arrPil) {
                subPil++;
                System.out.printf("%d%d. %s %n", urutPil, subPil, strPil);
            }

            System.out.print("Pilihan anda?");
            String strPil = sc.next();
            System.out.println("--");

            int pil    =  Integer.parseInt(strPil.substring(0,1)); //ambil digit pertama, asumsikan jumlah tidak lebih dari 10
            subPil     =  Integer.parseInt(strPil.substring(1,2)); //ambil digit kedua, asumsikan jumlah tidak lebih dari 10

            if (subPil== 1) {
                enemy.printEnemy();
            } else {
                Item objItemPilih = arrItem.get(pil-1);
                objItemPilih.prosesAksi(subPil); //aksi item
            }

        }

    }

}