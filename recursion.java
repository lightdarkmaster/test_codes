class recursion{
    
    public static void main(String[] args){
        System.out.println("Test");
        
    }
     public static int sum(int n) {
        
        // base condition
        if (n == 1)
            return 1;
        
        return n + sum(n - 1);
    }
}