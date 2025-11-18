/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
import vn.medianews.*;
/**
 *
 * @author hoang
 */
public class B21DCCN393_6d46nn1s_ChuyenDoiCoSo10sang8va16  {
    public static void main(String[] args) throws Exception{
        // khai báo các thứ
        String studentCode = "B21DCCN393", qCode = "6d46nn1s";
        DataService_Service service = new DataService_Service();
        DataService sv =  service.getDataServicePort();
        // nhận dữ liệu về : gửi msv + qcode 
        List<Integer> a = sv.getData(studentCode, qCode);
        System.out.println(a);
        // xử lý bài toán
        List<String>ans = new java.util.ArrayList<>();
        for(int x : a ){
            String oct = Integer.toOctalString(x);
            String hex = Integer.toHexString(x).toUpperCase();
            String tmp = oct +"|" + hex;
            System.out.println(tmp);
            ans.add(tmp);
        }
        
        System.out.println(ans);
        sv.submitDataStringArray(studentCode, qCode, ans);
        

    }
}
