package Drakke_Hoca.Email_Creation;

import java.util.Scanner;

public class EmailApp {
    String firstName;
    String lastName;
    String password;
    String department;
    String email;
    String emailSuuffix="clarusway.com";// şirket Domaini dr@clarusway.com
    int mailBoxCapacity =1000;
    int defaultPasswordLength =12;

    public EmailApp(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }
        /*
    testautomation.
    fullstackdeveloper.
    salesforce.
    hicbiri --> ekleme yapılmayacak.
     */
public String setDepartment(){
    System.out.println("Lütfen Aşağıda Belirtilen Departmanlardan Herhangi birini seçiniz...\n"+
            "\n1 Test Automation \n2 Full Stack Developer \n3 Salesforce \n4 Hiçbiri");
    Scanner scanner=new Scanner(System.in);

    return "";

}
//ABCDEFGHIJKLMNOPRSTUVYZ1234567890?*!'+abcdefghıjklmanoprstuvyi
// int length=12;

   /* public String setRandomPassWord(int length) {
        String passWordSet = "ABCDEFGHIJKLMNOPRSTUVYZ1234567890?*!'+abcdefghıjklmanoprstuvyi";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * passWordSet.length());
            password[i] = passWordSet.charAt(random);
        }

    return password;
}
*/}


