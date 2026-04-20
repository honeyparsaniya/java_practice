class add {
    
    //create function
    int sum(int a,int b)
    {
        return a+b;
    }
    public static void main(String[] args) {
        
        //create objec
        add obj=new add();

        int result=obj.sum(20,30);
        System.out.println("adddition is="+result);

    }
}
