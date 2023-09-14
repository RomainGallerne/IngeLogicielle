import java.sql.Array;

public class OrderedDictionary extends AbstractDictionary {
    public OrderedDictionary(){
        this.cles = new Object[0];
        this.valeurs = new Object[0];
    }

    @Override
    public IDictionary put(Object key, Object value) {
        Object[] NouvCles = new Object[this.cles.length+1];
        Object[] NouvValeurs = new Object[this.valeurs.length+1];
    }

    @Override
    protected int indexOf(Object key) {
        for (int i=0;i<this.cles.length; i++){
            if (cles[i].equals(key)){
                return i;
            }
        }
        return -1;
    }

    @Override
    protected int newIndexOf(Object key) {
        return 0;
    }
}
