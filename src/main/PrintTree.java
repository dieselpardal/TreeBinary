package main;

public class PrintTree {


    public static String stringRepeat(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }

    public static String stringReplaceKey(int index, String strNovo, String Original) {
        String ladoEsquerda = Original.substring(0,index);
        String ladoDireita  = Original.substring(index+1,Original.length());
        return ladoEsquerda + strNovo + ladoDireita;
    }
    public static String printLeaf(Tree[] leaf) {
        String temp = "";
        if ( leaf != null ) {
            for (int f = 0; f < leaf.length; f++) {
                temp += String.valueOf(leaf[f].value + ",");
            }
        }
        return temp;
    }
}
