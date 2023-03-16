import java.io.*;

class Login
{
 //deklarasi
 private String username, password, nama;
 
 //constructor
 public Login()
 {
 username = "Didin07";
 password = "209238237128";
 nama = "Ahmad Maulidi Roofiad";
 }
 
 public Login(String username, String password, String nama)
 {
   this.username = username;
   this.password = password;
   this.nama = nama;
 }
 
 //setter
 public void setUsername(String username)
 {
 this.username = username;
 }
 public void setPassword(String password)
 {
 this.password = password;
 } 
 
 public void setNama(String nama)
 {
 this.nama = nama;
 } 
 
 //getter
 public String getUsername()
 {
 return username;
 }
 public String getPassword()
 {
 return password;
 }
  public String getNama()
 {
 return nama;
 }
 
}



class Menu
{
 public static void main (String [] args) throws Exception
 {
 String usr, psw,lg, my_user,my_password;;
 BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
  
 //instance of class
 Login user1= new Login();
 System.out.println("=============LOGIN TRAVELOKA===============");
 System.out.print("|  Masukan username = "); my_user=br.readLine();
 System.out.print("|  Masukan password = "); my_password=br.readLine();
 System.out.println("=================================");
  
 if(my_user.equals(user1.getUsername())&& my_password.equals(user1.getPassword()))
     {
   System.out.println("=================================");
   System.out.println("      *** Login Sukses ***");
   System.out.println(" Selamat Datang "+user1.getNama());
   System.out.println("=================================");
     }
     else
     {
   System.out.println("=================================");
   System.out.println("       *** Login Gagal***");
   System.out.println("=================================");
   do{
    System.out.println("=============LOGIN===============");
    System.out.print("|  Masukan username = "); my_user=br.readLine();
    System.out.print("|  Masukan password = "); my_password=br.readLine();
    System.out.println("=================================");
   }while(my_user.equals(user1.getUsername())&& my_password.equals(user1.getPassword()));
     }  
 }
} 