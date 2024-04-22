package lesson3;
import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter 1st amount");
        double firstarg = console.nextDouble();
        System.out.println("Enter 2nd amount");
        double secondarg = console.nextDouble();
        System.out.println("Enter one of operations: +, -, *, /, % ");
        String oper = console.next();
        switch (oper){
            case "+": double summm=Maths.sum(firstarg, secondarg);
                System.out.println(firstarg+"+"+secondarg+"="+summm);
                break;
            case "-": double difff=Maths.diff(firstarg, secondarg);
                System.out.println(firstarg+"-"+secondarg+"="+difff);
                break;
            case "/": if (secondarg==0) {
                System.out.println("We are not dividing by zero here =) ");
                break;
            }
                double div=Maths.div(firstarg, secondarg);
                System.out.println(firstarg+"/"+secondarg+"="+div);
                break;
            case "*": double mult=Maths.mult(firstarg, secondarg);
            System.out.println(firstarg+"*"+secondarg+"="+mult);
                break;
            case "%": double percent=Maths.percent(firstarg, secondarg);
                System.out.println(firstarg+" % of "+secondarg+" = "+secondarg+" % of "+firstarg+" = "+percent);
                break;
            default: System.out.println("This is not a mathematical operation =(");
        }
    }
}
