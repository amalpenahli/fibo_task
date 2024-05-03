import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int maxNumber = inputNum();
        int evvelkiNum = 0;
        int sonrakiNum = 1;
        fiboNum(maxNumber,evvelkiNum,sonrakiNum);


    }
    public  static int inputNum(){
        System.out.println("Eded  daxil edin ");
        Scanner scenner = new Scanner(System.in);
        int maxNum  = scenner.nextInt();
        return maxNum;
    }
    public  static void  fiboNum(int maxNum, int evvelkiNum, int sonrakiNum){
        int i=1;
        while(i <= maxNum)
        {
            System.out.print(evvelkiNum+" ");
            int sum = evvelkiNum + sonrakiNum;
            evvelkiNum = sonrakiNum;
            sonrakiNum = sum;
            i++;
        }
    }

}