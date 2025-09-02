public class String_Equality {
    public static void main(String[] args) {
        String s1 = "Robi";
        String s2 = "Robi";
        String s3 = new String("Robi");
        if(s1 ==s2){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }

        //Gives wrong anser

        if(s2 == s3){
            System.out.println("Equal s2, s3");
        }else
        {
            System.out.println("Not Equal s2, s3");
        }
        if(s2.equals(s3)){
            System.out.println("Equal s2 = s3 ");
        }else
        System.out.println("Equal s2 != s3");
    }
    
}
