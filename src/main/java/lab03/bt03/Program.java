/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03.bt03;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author HOME
 */
public class Program {
    
    
    
    static ArrayList<SinhVien> ds = new ArrayList<>();
    
    public static void main(String[] args) {
        menu();
    }
    private static void menu(){
        int chon = 5;
        Scanner sc = new Scanner (System.in);
        do{
            System.out.println("====CHUONG TRINH QUAN LY SINH VIEN=====");
             System.out.println("1.Nhap danh sach sinh vien");
              System.out.println("2.Xuat danh sach sinh vien");
               System.out.println("3.Xuat danh sach sinh vien hoc luc gioi");
                System.out.println("4.Sap xep danh sach sinh vien theo diem");
                 System.out.println("5.Ket thuc");
                  System.out.println("----------------------------");
                   System.out.print("Ban chon(1->5):");
                   chon = sc.nextInt();
                   switch (chon) {
                       case 1:
                           nhapDS();
                           break;
                       case 2:
                           xuatDS();
                           break;
                       case 3:
                           xuatSVGioi();
                           break;
                       case 4:
                           System.out.println("Goodbye. See you again");
                           break;
                   }
        }while (chon != 5);
    }
    private static void nhapDS(){
String tieptuc ="y";
do{
SinhVien sv = null;
Scanner input1 = new Scanner (System.in);
Scanner input2 = new Scanner (System.in);
    System.out.println("Thuc hien danh sach sinh vien");
    int chon = 0;
    System.out.print("Cho biet loai sinh vien(IT:1, Biz:2");
    chon = input1.nextInt();
    if (chon == 1){
        System.out.print("Ho ten:");
        String hoten = input2.nextLine();
         System.out.print("Diem Java:");
         double Java = input1.nextDouble();
          System.out.print("Diem Css:");
          double css = input1.nextDouble();
           System.out.print("Diem Html");
           double html =input1.nextDouble();
           sv= new SinhVienIT(hoten, Java, css, html);
           
    }else if (chon ==2){
        
    }
    if (sv !=null){
        ds.add(sv);
    }
    System.out.print ("Co tiep tuc? (y/n):");
    tieptuc = input2.nextLine();
}while (tieptuc.equalsIgnoreCase("y"));
}
    private static void xuatDS(){
        System.out.println("Thuc hien xuat danh sach");
        for (SinhVien sv : ds){
            sv.Xuat();
        }
    }

    private static void xuatSVGioi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}



