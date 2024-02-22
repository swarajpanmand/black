class Test{
    private double base;
    private int power;
    private int logBase;
    private int argument;

    Test(){
        base =2;
        power = 2;
        logBase = 2;
        argument = 4;
    }

    double calculate(double base, int power){
        return Math.pow(base,power);
    }

    double calculate(int logBase, int argument){
        return Math.log(argument)/Math.log(logBase);
    }

}
//class Main{
    public static void main(String[] args){
        Test test = new Test();
        System.out.println(test.calculate(2,4));
        System.out.println(test.calculate(2.0, 4.0))
    }
//}
