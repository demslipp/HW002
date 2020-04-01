public class SubStrings{

    public void PrintAllSubStrings (String mainString){
        String[] subStrings=mainString.split (" ");
        for (int i=0; i<subStrings.length; i++){
            for (int j=0; j<=subStrings[i].length (); j++){
                for (int k=1; k<=subStrings[i].length ()-j; k++)
                    System.out.print (subStrings[i].substring (j, j+k)+" ");
            }
        }
    }
}

