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

        this.department = setDepartment();
        //System.out.println("Department: " + department);
        this.password=setRandomPassWord(defaultPasswordLength);
        //System.out.println("Password: " + password);
        email=firstName.toLowerCase()+lastName.toLowerCase()+"@"+ department+emailSuuffix;
    }
        /*
    testautomation.
    fullstackdeveloper.
    salesforce.
    hicbiri --> ekleme yapılmayacak.
     */
public String setDepartment(){
    System.out.println("Lütfen Aşağıda Belirtilen Departmanlardan Herhangi birini seçiniz...\n"+
            "\n1 Test Automation \n2 Full Stack Developer \n3 Salesforce \n0 Hiçbiri");
    Scanner scanner=new Scanner(System.in);
    int options=scanner.nextInt();
    if(options==1) {
        return "testautomation";
    }else if(options==2) {
        return "fullstackdeveloper";
    }else if(options==3) {
        return "salesforce";
    }else {
        return "";
    }

}
//ABCDEFGHIJKLMNOPRSTUVYZ1234567890?*!'+abcdefghıjklmanoprstuvyi
// int length=12;

    public String setRandomPassWord(int length) {
        String passWordSet = "ABCDEFGHIJKLMNOPRSTUVYZ1234567890?*!'+abcdefghıjklmanoprstuvyi";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * passWordSet.length());
            password[i] = passWordSet.charAt(random);
        }

    return new String(password);
}
public String showInfo(){
    return "Ad-Soyad:  "+firstName+" " + lastName+ "\n" +"Şirket Email: "+email+"\n "+"Capasity: "+mailBoxCapacity+"mb\n"+ "Password: "+password;
}
}


