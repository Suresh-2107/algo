
public class EuclideanGCD{
    public static void main(String[] args){

        int a = 15;
        int b = 5;

        System.out.println(euclideangcd(a,b));

    }
    public static int euclideangcd(int num1, int num2){
        while(num1>0 && num2>0){
            if(num1>num2) num1 = num1%num2;
            else num2 = num2%num1;
        }
        if(num1==0) return num2;
        return num1;
    }
}