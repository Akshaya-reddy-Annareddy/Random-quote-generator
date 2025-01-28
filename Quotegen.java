import java.util.*;

public class Quotegen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        String[] quote = {"Love yourself","Never give up","Greatest battles are with closest people","Life is short, make it sweet","Be brave, take risks","Kindness goes a long way"};

        while (true) {
            int num = ran.nextInt(6);
            System.out.print("Do you want to generate a quote (yes/no): ");
            String str = sc.nextLine().toLowerCase();
            if(str.equals("no")){
                break;
            }else{
                System.out.println(quote[num]);
            }

        }
        sc.close();
    }
}
