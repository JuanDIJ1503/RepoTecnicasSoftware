package UTILS;
import MODEL.Resta;
public class OperationResta {
    private Resta resta;
    public OperationResta(Resta resta){
        this.resta = resta;
    }
    public int Oresta(){
        return resta.getNum1() - resta.getNum2();
    }

}
