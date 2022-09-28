public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String numero = "3,123";


        String primernumero = numero.split(",")[0];
        String decimales = numero.split(",")[1];

        //System.out.println(primernumero);
        int numberOfRepetitions=Integer.parseInt(primernumero);

        int [] arrayCifras = new int[decimales.length()];
        int i;
        for(i=0;i<decimales.length();i++){
            arrayCifras[i] = Integer.parseInt(String.valueOf(decimales.charAt(i)));
            System.out.println(arrayCifras[i]);
        }
        String [][] displayArray = new String[decimales.length()][7];
        for (i=0;i<decimales.length();i++){
            switch (arrayCifras[i]){
                case 1:{
                    displayArray[i][0] = "   ";
                    displayArray[i][1] = " ";
                    displayArray[i][2] = "|";
                    displayArray[i][3] = "   ";
                    displayArray[i][4] = " ";
                    displayArray[i][5] = "|";
                    displayArray[i][6] = "   ";
                    break;
                }
                case 2:{
                    displayArray[i][0] = "---";
                    displayArray[i][1] = " ";
                    displayArray[i][2] = "|";
                    displayArray[i][3] = "---";
                    displayArray[i][4] = "|";
                    displayArray[i][5] = " ";
                    displayArray[i][6] = "---";
                    break;
                }
                case 3:{
                    displayArray[i][0] = "---";
                    displayArray[i][1] = " ";
                    displayArray[i][2] = "|";
                    displayArray[i][3] = "---";
                    displayArray[i][4] = " ";
                    displayArray[i][5] = "|";
                    displayArray[i][6] = "---";
                    break;
                }
            }
        }
        for (i=0;i<decimales.length();i++){
            System.out.printf(" %s  ", displayArray[i][0]);
        }
        System.out.println("");
        for (i=0;i<decimales.length();i++){
            System.out.printf("%s   %s ", displayArray[i][1], displayArray[i][2]);
        }
        System.out.println("");
        for (i=0;i<decimales.length();i++){
            System.out.printf(" %s  ", displayArray[i][3]);
        }
        System.out.println("");
        for (i=0;i<decimales.length();i++){
            System.out.printf("%s   %s ", displayArray[i][4], displayArray[i][5]);
        }
        System.out.println("");
        for (i=0;i<decimales.length();i++){
            System.out.printf(" %s  ", displayArray[i][6]);
        }
        System.out.println("");
    }
}


