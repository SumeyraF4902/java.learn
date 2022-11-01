package j22_DateTime.GirisProjesi;

import java.time.LocalDateTime;
/// 1 Stepp
public class Kullanıcı {// kullanıcı obj üretecek kalıphane class
    //fields
    String name;//obj.de değer atanacak inst.var
    LocalDateTime kayıtZamanı;

    public Kullanıcı(String name, LocalDateTime kayıtZamanı) {//full parametreli teleskopik consrakter
        this.name = name;
        this.kayıtZamanı = kayıtZamanı;
    }

    @Override
    public String toString() {
        return "Kullanıcı{" +
                "name='" + name + '\'' +
                ", kayıtZamanı=" + kayıtZamanı +
                '}';
    }
}
