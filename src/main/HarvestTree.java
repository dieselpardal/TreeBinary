package main;

public class HarvestTree {

    public String generateTree(int[] seed) {
        if(seed == null) return null;
        String temp = "";
        int height = seed.length;
        int level = (int)(Math.log(height) / Math.log(2));
        boolean [] busy = new boolean[height];
        double division = height ;
        for ( int stepLevel = 0; stepLevel <= level; stepLevel++) {
            int last=0;
            division = (division / 2);
            if(division<1) {
                division=1;
                last=1;
            }
            int divisionOld = 0;
            double pos = division;
            while ( pos < height + last ) {
                int key = (int)Math.ceil(pos) - 1;
                for (int space =divisionOld; space <pos - 1; space++ )
                    temp+="  ";
                divisionOld = key + 1;
                int valor = seed[key];
                if (!busy[key] ) {
                       temp+=String.format("%02d",valor);
                       busy[key] = true;
                   } else {
                       temp+="  ";
                }
                pos+= division;
            }
            temp+="\n";
        }
        return temp;
    }
}
