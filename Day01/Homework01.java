public class Homework01 {
    public static void main(String[] args){
        int i=10;
        int n=i++%5;
        System.out.println(i);
        System.out.println(n);
        int m=++i%5;
        System.out.println(m);
        double fdegree;
        fdegree=80;
        double cdegree =(fdegree-32)/1.8;
        System.out.println(fdegree);
        System.out.println(cdegree);
        double d=9/5;
        System.out.println(d);
        double d1 = 9.0/5;
        System.out.println(d1);
    
        double x;
        double y;
        x=5;
        System.out.println(x>0);
        x=10;
        y=5;
        System.out.println(x%y==0);
        System.out.println((x<15)&(x>2));
        y=6;
        System.out.println((x-y)<5);
        x=9;
        System.out.println((x<=30)&(x>=10));
        int x1;
        x1=12345;
        System.out.println(x1>999);
        x1=100000;
        System.out.println((x1<1000000)&(x1>99999));

    }
    
}
