import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MagicSquare{
    public void Detect(){
        System.out.println("");
        Scanner scanner=new Scanner(System.in);
        List<String> arrayList=new ArrayList<>();
//
        while(true) {
            String str=scanner.nextLine();
            if(!str.equals("")){
                arrayList.add(str);
            } else break;
        }
        //System.out.println(arrayList);
        int[][] array=new int[arrayList.size()][arrayList.size()];
        //for (int j=0; j<arrayList.size (); j++){
        //String[] substrings=arrayList.get (j).split (" ");
        //for (int k=0;k<substrings.length;k++){
        //array[j][k]=substrings[k].
        // }
        List<List<Integer>> finList=new ArrayList<>();
        arrayList.forEach(str -> {
            String[] s=str.split(" ");
            List<Integer> integers=Arrays.stream(s).map(Integer::parseInt).collect(Collectors.toList());
            finList.add(integers);
        });
        System.out.println(finList);




        finList.forEach(e -> );

        }
       }
    }

}


//}

