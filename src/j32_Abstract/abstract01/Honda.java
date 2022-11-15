package j32_Abstract.abstract01;

public abstract class Honda {// parent abstract class
    public abstract void motor();

    void sunrooff(){
        System.out.println("Agam keyfine düşkünsün ama  extra fiyat");
    }
    // abstract  classda variable tanımlanabilir mi ? evet.
    String name="gülsüm team lead";

    // variablelar abstract tanımlanabilir mi ?  kesinlikle hayır
  //  public abstract  int yas=48; olamaz
    abstract void koltuk();

    abstract void kapı();

//final void finalMethod();// concrete method bodysiz olamaz
//final abstract void finalMethod();// abs method final olamaz

   // private void  privateMethod();//bodysiz olamaz
  //  private  abstract void  privateMethod();//abs method private olamaz

   // static  void  gunesMethod();//bodysiz olamaz
  //  static abstract void  gunesMethod();//abs method static olamaz

    //Honda obj=new Honda();//melekler doğurmaz abs class obje üretmez

}
