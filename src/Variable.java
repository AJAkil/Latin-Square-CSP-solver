import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Variable {


    private int row;
    private int col;
    private int value;
    private ArrayList<Integer> domains;
    private int staticDegree;

    public int getDynamicDegree() {
        return dynamicDegree;
    }

    private int dynamicDegree;

    public void setDynamicDegree(int dynamicDegree) {
        this.dynamicDegree = dynamicDegree;
    }

    public static Comparator<Variable> domainSizeComparator = new Comparator<Variable>() {
        @Override
        public int compare(Variable o1, Variable o2) {
            return o1.domains.size() - o2.domains.size();
        }
    };

    @Override
    public String toString() {
        return "{" +
                "value=" + value +
                '}';
    }

    public void setDomains(int maxValue){

        domains = new ArrayList<>();

        if (this.value == 0){
            for (int i = 0; i < maxValue; i++) {
                this.domains.add(i+1);
            }
        }else{
            this.domains.add(-1);
        }
    }

    public void calculateDynamicDegree(){

    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ArrayList<Integer> getDomains() {
        return domains;
    }

    public void setDomains(ArrayList<Integer> domains) {
        this.domains = domains;
    }

    public int getStaticDegree() {
        return staticDegree;
    }

    public void setStaticDegree(int staticDegree) {
        this.staticDegree = staticDegree;
    }
}
