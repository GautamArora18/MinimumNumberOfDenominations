import java.util.Scanner;
public class MinimumNumberOfDenominations {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a=sc.nextInt();
        int c=0;
        while(a!=0){
            if(a>=2000){
                int b=a/2000;
                c+=b;
                a=a-b*2000;
                System.out.println("Total Number of notes of 2000 required: "+b);
            } else if (a>=500) {
                int b=a/500;
                c+=b;
                a=a-b*500;
                System.out.println("Total Number of notes of 500 required: "+b);
            }else if(a>=200){
                int b=a/200;
                c+=b;
                a=a-b*200;
                System.out.println("Total Number of notes of 200 required: "+b);
            }else if(a>=100){
                int b=a/100;
                c+=b;
                a=a-b*100;
                System.out.println("Total Number of notes of 100 required: "+b);
            }else if(a>=50){
                int b=a/50;
                c+=b;
                a=a-b*50;
                System.out.println("Total Number of notes of 50 required: "+b);
            }else if(a>=20){
                int b=a/20;
                c+=b;
                a=a-b*20;
                System.out.println("Total Number of notes of 20 required: "+b);
            }else if(a>=10){
                int b=a/10;
                c+=b;
                a=a-b*10;
                System.out.println("Total Number of notes of 10 required: "+b);
            }else if(a>=5){
                int b=a/5;
                c+=b;
                a=a-b*5;
                System.out.println("Total Number of notes of 5 required: "+b);
            }else if(a>=2){
                int b=a/2;
                c+=b;
                a=a-b*2;
                System.out.println("Total Number of notes of 2 required: "+b);
            }else{
                int b=a/1;
                c+=b;
                a=a-b*1;
                System.out.println("Total Number of notes of 1 required: "+b);
            }
        }
        System.out.println("Total Number of notes required: "+ c);
    }
}