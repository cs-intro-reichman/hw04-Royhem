public class Primes {
    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]); 
        int s=2;
        int count=0;
        int sqrtN =(int) Math.sqrt(s);
        System.out.println("Prime numbers up to " + num + ":");

       
        while (s<=num) {
    
            boolean is = false;
            sqrtN =(int) Math.sqrt(s);

            for(int i=2;i<=sqrtN;i++)
            {

                if(s%i==0 )
                {
                 is=true;
                 break;
                }
                
            }

            if (!is) 
                {
                    System.out.println(s);
                    count ++;
                    
                }



            s++;

        }


            
            

            int per=(int)(((double)count/(double)num)*100);

        

        

        System.out.println("There are "+count+" primes between 2 and "+num+" ("+per+"% are primes)");





        
    }
}



