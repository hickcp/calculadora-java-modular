package calculadora.utils;

import calculadora.utils.internal.DivHelper;
import calculadora.utils.internal.MultHelper;
import calculadora.utils.internal.SubHelper;
import calculadora.utils.internal.SumHelper;

public class Calculadora {
    private DivHelper divHelper;
    private SumHelper sumHelper;
    private MultHelper multHelper;
    private SubHelper subHelper;

    public Calculadora(){
        divHelper = new DivHelper();
        multHelper = new MultHelper();
        subHelper = new SubHelper();
        sumHelper = new SumHelper();
    }

    public int sum(int a, int b){
        return sumHelper.execute(a, b);
    }
    public int div(int a, int b) {
        return divHelper.execute(a, b);
    }
    public int sub(int a, int b) {
        return subHelper.execute(a, b);
    }
    public int mult(int a, int b) {
        return multHelper.execute(a, b);
    }
}
