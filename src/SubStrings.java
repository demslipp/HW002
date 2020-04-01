public class SubStrings{

    public void PrintAllSubStrings(String mainString){
        System.out.println(mainString);
        String[] subStrings=mainString.split(" ");
        for (String subString : subStrings){
            for (int j=0; j<=subString.length(); j++){
                for (int k=1; k<=subString.length()-j; k++)
                    System.out.print(subString.substring(j, j+k)+" ");
            }
        }
    }
}

