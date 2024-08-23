/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03.bt03;

/**
 *
 * @author HOME
 */
public class SinhVienIT extends SinhVien {
    public double diemJava;
     public double diemCss;
      public double diemHtml;
      
      
      public SinhVienIT (String hoten, double diemJava,double diemCss, double diemHtml){
          super(hoten, "IT");
          this.diemJava = diemJava;
          this.diemCss = diemCss;
          this.diemHtml = diemHtml;
      }
      @Override
      public double getDiem(){
          return ((2 * diemJava) + diemHtml + diemCss)/4;
      }
    
}
