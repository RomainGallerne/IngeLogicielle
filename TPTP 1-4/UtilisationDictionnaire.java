public class UtilisationDictionnaire {
    public static void main(String[] args){

        //TEST DE ORDERED DICTIONARY
        System.out.println("-----------------------");
        System.out.println("TEST DE L'OREDERED DICTIONARY");
        System.out.println("-----------------------");
        IDictionary oDic = new OrderedDictionary();
        System.out.print("oDic vide ? : ");
        System.out.println(oDic.isEmpty());

        oDic.put(1,"bonjour");
        oDic.put(2,"coucou");
        oDic.put(3,"salut");
        oDic.put(4,"hey");
        oDic.put(0,"yo");

        System.out.print("oDic get(2) : ");
        System.out.println(oDic.get(2));
        System.out.print("oDic get(1) : ");
        System.out.println(oDic.get(1));

        System.out.print("oDic vide ? : ");
        System.out.println(oDic.isEmpty());

        System.out.print("oDic size : ");
        System.out.println(oDic.size());

        System.out.print("oDic contains 2 ? : ");
        System.out.println(oDic.containsKey(2));

        System.out.print("oDic contains 6 ? : ");
        System.out.println(oDic.containsKey(6));

        System.out.println(oDic.toString());

        //TEST DU FAST DICTIONARY
        System.out.println("-----------------------");
        System.out.println("TEST DU FAST DICTIONARY");
        System.out.println("-----------------------");
        IDictionary fastDic = new FastDictionary();
        System.out.print("fastDic vide ? : ");
        System.out.println(fastDic.isEmpty());

        System.out.println(fastDic.toString());
        fastDic.put("bonjour","polie");
        fastDic.put("yo","famillier");
        System.out.println(fastDic.toString());
        fastDic.put("salut","amical");
        fastDic.put("coucou","amusante");
        fastDic.put("hey","alarmante");
        System.out.println(fastDic.toString());
    }
}
