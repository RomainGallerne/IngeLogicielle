import java.util.Arrays;

public class FastDictionary extends AbstractDictionary{
    public FastDictionary() {
        this.cles = new Object[0];
        this.valeurs = new Object[0];
    }

    @Override
    protected int indexOf(Object key) {
        if(containsKey(key)) {
            for (int i = 0; i < size(); i++) {
                if (cles[i].equals(key)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    protected int newIndexOf(Object key) {
        boolean grown = false;
        int newindex;
        while(mustGrow()){grow();grown = true;}
        if(grown){
            //RE-SET DE TOUS LES ELEMENTS
            Object[] oldCles = cles.clone();
            Object[] oldVeleurs = valeurs.clone();
            cles = new Object[cles.length];
            valeurs = new Object[valeurs.length];
            for (int i=0;i<cles.length;i++) {
                if(oldCles[i]!=null){this.put(oldCles[i],oldVeleurs[i]);}
            }
        }
        //INDEX DE LA NOUVELLE CLE
        newindex = key.hashCode();
        if(newindex < 0){newindex = -newindex;}
        if(cles.length>1){
            newindex = newindex % (cles.length-1);
            while(containsKey(newindex)){newindex=(newindex+1)%(cles.length-1);}
        }
        return newindex;
    }

    @Override
    public int size() {
        int nbElem = 0;
        for (Object k : cles){
            if (k!=null){
                nbElem += 1;
            }
        }
        return nbElem;
    }

    @Override
    protected void grow() {
        Object[] newCles = new Object[cles.length*2+1];
        Object[] newValeurs = new Object[valeurs.length*2+1];
        for (int i=0;i<cles.length;i++){
            newCles[i] = cles[i];
            newValeurs[i] = valeurs[i];
        }
        cles = newCles;
        valeurs = newValeurs;
    }

    protected boolean mustGrow() {
        return (size()+1 >= 0.75*cles.length);
    }

    @Override
    public String toString() {
        if(cles.length>0) {
            return "FastDictionary{" +
                    "cles=" + Arrays.toString(cles) +
                    ", valeurs=" + Arrays.toString(valeurs) +
                    "}\nRemplissage : " + (float)size()/(float)cles.length*100.0 + '%';
        } else {
            return "FastDictionary{" +
                    "cles=" + Arrays.toString(cles) +
                    ", valeurs=" + Arrays.toString(valeurs) +
                    "}\nRemplissage : 0.0%";
        }
    }
}
