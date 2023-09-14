import java.lang.reflect.Array;

public abstract class AbstractDictionary implements IDictionary {
    protected Object[] cles;
    protected Object[] valeurs;

    protected abstract int indexOf(Object key);
    protected abstract int newIndexOf(Object key);

    @Override
    public Object get(Object key) {
        if(containsKey(key)){
            return valeurs[indexOf(key)];
        } else {return -1;}
    }

    @Override
    public IDictionary put(Object key, Object value) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        if (cles.length == 0){return true;}
        else {return false;}
    }

    @Override
    public int size() {
        return cles.length;
    }

    @Override
    public boolean containsKey(Object key) {
        for (int i=0;i<this.cles.length; i++){
            if (cles[i].equals(key)){
                return true;
            }
        }
        return false;
    }
}
