package idmanpr;

import java.util.Scanner;

public class program {

    Scanner input = new Scanner(System.in);

    private int pushup_sayisi = 21;
    private int pullup_sayisi = 21;
    private int squat_sayisi = 21;

    public void antremanYap() {
        System.out.println("antreman programınız : \n"
                + "21 push up\n"
                + "21 pull up\n"
                + "21 squat");

        while (true) {

            System.out.println("yapmak istediğiniz antremanı giriniz");
            String antreman = input.nextLine();

            if (antreman.equals("pushup")) {
                System.out.println("kaç tane yapacaksınız");
                int sayi = input.nextInt();
                if (pushup_sayisi > sayi) {
                    pushup_sayisi -= sayi;
                    System.out.println(sayi + " tane pushup yaptınız\n"
                            + "kalan pushup sayısı : " + pushup_sayisi);
                    input.nextLine();
                } else if (pushup_sayisi == sayi) {
                    pushup_sayisi = 0;
                    System.out.println("pushup egzersizini tamamladınız");
                    input.nextLine();
                } else if (pushup_sayisi < sayi) {
                    pushup_sayisi = 0;
                    System.out.println("günlük egzersiz sayısından fazla yaptın harikasın");
                    input.nextLine();

                } else {

                }

            } else if (antreman.equals("pullup")) {
                System.out.println("kaç tane yapacaksın");
                int sayi = input.nextInt();
                if (pullup_sayisi > sayi) {
                    pullup_sayisi -= sayi;
                    System.out.println(sayi + " tane pullup yaptın\n"
                            + "kalan pullup sayısı : " + pullup_sayisi);
                    input.nextLine();
                } else if (pullup_sayisi == sayi) {
                    pullup_sayisi = 0;
                    System.out.println("pullup egzersizini tamamladın");
                    input.nextLine();
                } else if (pullup_sayisi < sayi) {
                    pullup_sayisi = 0;
                    System.out.println("günlük egzersiz sayından fazla yaptın harikasın");
                    input.nextLine();

                } else {

                }
            } else if (antreman.equals("squat")) {
                System.out.println("kaç tane yapacaksın");
                int sayi = input.nextInt();
                if (squat_sayisi > sayi) {
                    squat_sayisi -= sayi;
                    System.out.println(sayi + " tane squat yaptın\n"
                            + "kalan squat sayısı : " + squat_sayisi);
                    input.nextLine();
                } else if (squat_sayisi == 0) {
                    squat_sayisi = 0;
                    System.out.println("squat egzersizini tamamladın");
                    input.nextLine();
                } else if (squat_sayisi < sayi) {

                    squat_sayisi = 0;
                    System.out.println("günlük egzersiz sayından fazla yaptın harikasın");
                    input.nextLine();
                } else {

                }

            } else {
                System.out.println("yanlış bir kelime girdiniz");
                input.nextLine();
            }

            if (squat_sayisi == 0 && pullup_sayisi == 0 && pushup_sayisi == 0) {
                System.out.println("tüm egzersizlerinizi bitirdiniz tebrikler\n"
                        + "yarın görüşmek üzere");
                break;

            }

        }
    }

}
