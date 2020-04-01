import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MagicSquare{
    public void Detect(){
        int j=0;
        int k=0;
        boolean flag=false;
        Scanner scanner=new Scanner(System.in);
        List<String> arrayList=new ArrayList<>();

        while(true) {
            String str=scanner.nextLine();
            if(!str.equals("")){
                arrayList.add(str);
            } else break;
        }

        int[][] array=new int[arrayList.size()][arrayList.size()];
        for (j=0; j<arrayList.size(); j++){
            String[] substrings=arrayList.get(j).split(" ");
            for (k=0; k<substrings.length; k++){
                array[j][k]=Integer.parseInt(substrings[k]);
            }
        }
        if(j != k){
            System.out.println("Incorrect");
        } else {
            int[] sumCol=new int[array.length];
            int[] sumLine=new int[array.length];
            int sumDia=0;
            int sumSub=0;
            for (int i=0; i<array.length; i++){
                for (int z=0; z<array[0].length; z++){
                    sumCol[i]+=array[i][z];
                    sumLine[z]+=array[z][i];
                    if(i == z){
                        sumDia+=array[i][z];
                    }
                    if(i+z == array.length-1){
                        sumSub+=array[i][z];
                    }
                }
            }
            for (int x=0; x<sumCol.length; x++){
                System.out.println("D: "+sumDia+", S: "+sumSub+", sum line: "+sumLine[x]+", sum col: "+sumCol[x]);
                if((sumCol[x] == sumDia) && (sumLine[x] == sumSub) && (sumCol[x] == sumSub)){
                    flag=true;
                }
            }

            if(flag){
                System.out.println("True");
            } else System.out.println("False");
        }

    }
}


