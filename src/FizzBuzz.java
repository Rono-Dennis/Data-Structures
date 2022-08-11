
public class FizzBuzz {
    public static void main(String[] args) {
        String result;
         for(int i=1;i<100+1;i++){
            if (i%3==0){
                result ="fizzbuzz";
                System.out.println(result);
            }else
                System.out.println(i);

        }

    }
}

/**
for(int i=1; i<=n; i++){
        if((i%3==0) && (i%5==0)){
        System.out.println("FizzBuzz");
        }else if(i%3==0 && !(i%5==0)){
        System.out.println("Fizz");
        }else if(i%5==0 && !(i%3==0)){
        System.out.println("Buzz");
        }else
        System.out.println(i);
        }
        }*/
