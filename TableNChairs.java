package Oop;
public class TableNChairs {
    public static void main(String[] args) {
        int a = 1;
        while (a <= 6){
            int b = 1;
            while (b <= 22){
                if(((a==1&&b==1)||(a==1&&b==22)) || ((a==2&&b==1)||(a==2&&b==22)) || ((a==3&&b==1)||(a==3&&b<17&&b>6)||(a==3&&b==22))
                        || ((a==4&&b<6)||(a==4&&b==7)||(a==4&&(b==16)||(a==4&&b>17) || (((a==5||a==6) && (b==1 || b==5 || b==7 || b==16 || b==18 || b==22)))))) {
                    System.out.print("*");
                }
                else {System.out.print(" ");}
                b++;
            }
            System.out.println();
            a++;
        }
    }
}
