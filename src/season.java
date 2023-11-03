import java.util.Scanner;

public class season {
    int month;
    public season(int month){
        this.month = month;
    }
    public season(){

    }
    public int seasons(){
        Scanner Scanner = new Scanner(System.in);
        int n = Scanner.nextInt();
        switch (n){
            case 12,1,2:
                System.out.println("Winter");
                break;
            case 3,4,5:
                System.out.println("Spring");
                break;
            case 6,7,8:
                System.out.println("Summer");
                break;
            case 9,10,11:
                System.out.println("Autum");
        }
        return 0;
    }
}
