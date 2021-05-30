package Pertemuan9dan10.ControlStatementProject;
import java.util.*;

public class leapYearCalculator {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int bulan,tahun;

        System.out.println("CODE PERTEMUAN 9");
        System.out.println("Masukan bulan dalam angka=");
        bulan  = Input.nextInt();
        System.out.println("Masukan tahun =");
        tahun  = Input.nextInt();

        //menampilkan odd or even
        ODDEVEN(bulan);

        //menampilkan
        SWITCHCASE(bulan,tahun);
    }

    public static void  ODDEVEN(int bulan){
        String bilangan;

        bilangan = (bulan % 2 == 0) ? "genap" : "ganjil";
        System.out.println("Bulan " + bilangan);
    }

    public static void  SWITCHCASE(int bulan,int tahun){
        switch (bulan){
            case 1:{
                System.out.println("januari 31 hari");
                break;
            }
            case 2:{
                if (tahun % 4==0  && tahun % 100!=0){
                    System.out.println("februari 28 hari");
                }
                else if (tahun % 400==0){
                    System.out.println("februari 29 hari");
                }
                else
                    System.out.println("februari 31 hari");
                break;
            }

            case 3:{
                System.out.println("maret 30 hari");
                break;
            }
            case 4:{
                System.out.println("april 30 hari");
                break;
            }
            case 5:{
                System.out.println("mei 31 hari");
                break;
            }
            case 6:{
                System.out.println("juni 30 hari");
                break;
            }
            case 7:{
                System.out.println("juli 31 hari");
                break;
            }
            case 8:{
                System.out.println("agustus 31 hari");
                break;
            }
            case 9:{
                System.out.println("september 30 hari");
                break;
            }
            case 10:{
                System.out.println("october 31 hari");
                break;
            }
            case 11:{
                System.out.println("november 30 hari");
                break;
            }
            case 12:{
                System.out.println("desember 31 hari");
                break;
            }
            default:{
                System.out.println("eror inputan");
                break;
            }
        }
    }
}
