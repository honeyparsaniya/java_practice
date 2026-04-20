class divisionbyzero{
    public static void main(String[] args) {
        try{
            int a=10;
            int b=0;
            int c=a/b;//error occur here
        }
        catch(ArithmeticException e)
        {
            System.out.println("error:-divide by zero");
        }
    }
}