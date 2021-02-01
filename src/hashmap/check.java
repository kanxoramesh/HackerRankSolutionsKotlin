package hashmap;

public class check {
    public static void main(String[] args) {
        int mask= 0x000f;
        int value =0x2222;
        System.out.println(mask & value);

      /*  Float f= new Float("3.0");
        int a= f.intValue();
       *//* byte b= f.byteValue();*//*
        double d= f.doubleValue();
        System.out.println(a+b+d);*/
    }
}

  /*  fun taskOfPairing(freq: Array<Long>): Long {
        // Write your code here
        var remain=0L;
        var count=0L;
        for(i in 0 until freq.size){
        var temp=remain
        remain= (freq[i]+temp)%2
        if(remain == 0L)
        count+=(freq[i]+temp)/2
        else
        count+=freq[i]/2

        }
        return count

        }

*/