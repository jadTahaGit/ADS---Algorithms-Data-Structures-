package squareRoot;
class squareRoot {
    

    public static void main(String[] args){
        squareRootFunction(25);
        System.out.println("hello World");
    }


    public static void squareRootFunction(int  x) {
            int r = x;
            // double precision = 10 ^ (-1);
            
            while(Math.abs(x - r*r ) > 1) {
                r = (r + x / r) / 2;
            }

            // System.out.println("Square root of " + x + " = " + r);
            System.out.println(r);
        }


}

