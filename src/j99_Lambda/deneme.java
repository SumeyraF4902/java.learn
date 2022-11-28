package j99_Lambda;

import j26_ınheritance.task01.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static j99_Lambda.C01_LambdaExpression.ciftMi;
import static j99_Lambda.C01_LambdaExpression.printElFunctional;

public class deneme {
    public static void main(String[] args) {
        List<Integer> sasa= new ArrayList(Arrays.asList(24,38,49,33,7,3,42,66,75,45,46,55,35,25,67,16));
       sasa.stream().filter(t->t>34).forEach(C01_LambdaExpression::yazdir);
       sasa.stream().filter(C01_LambdaExpression::ciftMi).map(t->t*t).forEach(C01_LambdaExpression::yazdir);
       sasa.stream().filter(t->t%2==1).map(t->t*t*t+1).forEach(C01_LambdaExpression::yazdir);
       sasa.stream().filter(t->t%2==1).map(t->(int)Math.pow(t,3)).forEach(C01_LambdaExpression::yazdir);
       sasa.stream().filter(C01_LambdaExpression::ciftMi).map(Math::sqrt).forEach(t-> System.out.println(t+""));
    }
}
