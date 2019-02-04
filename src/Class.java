public class Class {

    //icyHot from Warmup 1
    public static boolean icyHot(int temp1, int temp2) {
        if((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)){
            return true;
        }else{
            return false;
        }
    }
    //arrayCount9 from Warmup 2
    public static int arrayCount9(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        return count;
    }
    //conCat from String 1
    public static String conCat(String a, String b) {
        if (a.length() == 0 || b.length() == 0)
            return a+b;
        if ((a.substring(a.length() - 1, a.length())).equals(b.substring(0,1)))
            return a + b.substring(1,b.length());
        else
            return a+b;
    }
    //makePi from Array 1
    public static int[] makePi() {
        return new int [] {3,1,4};
    }

    //lessBy10 from Logic 1
    public static boolean lessBy10(int a, int b, int c) {
        int high = Math.max(a,b);
        high = Math.max(high,c);

        if(high - a >= 10 || high - b >= 10 || high - c >= 10){
            return true;
        }else{
            return false;
        }
    }
    //closeFar from Logic 2
    public static boolean closeFar(int a, int b, int c) {
        if(Math.abs(a-b) <= 1 && Math.abs(a-c) >= 2 && Math.abs(b-c) >= 2){
            return true;
        }else if(Math.abs(a-c) <= 1 && Math.abs(a-b) >= 2 && Math.abs(b-c) >= 2){
            return true;
        }else{
            return false;
        }
    }
    //catDog from String 2
    public static boolean catDog(String str) {
        int len = str.length();
        int cat = 0;
        int dog = 0;

        for (int i = 0; i < len - 2; i++) {
            String temp = str.substring(i, i+3);
            if (temp.compareTo("cat") == 0){
                cat++;
            }
            if (temp.compareTo("dog") == 0){
                dog++;
            }
        }
        if (cat == dog){
            return true;
        }else{
            return false;
        }
    }
    //countTriple from String 3
    public static int countTriple(String str) {
        int len = str.length();
        int count = 0;

        for (int i = 0; i < len-2; i++){
            char tmp = str.charAt(i);
            if (tmp == str.charAt(i+1) && tmp == str.charAt(i+2))
                count++;
        }
        return count;
    }
    //only14 from Array 2
    public static boolean only14(int[] nums) {
        boolean isTrue = true;

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 && nums[i] != 4)
                isTrue = false;
        }
        return isTrue;

    }
    //canBalance from Array 3
    public static boolean canBalance(int[] nums) {
        int lSum = 0;

        for (int i = 0; i < nums.length; i++) {
            lSum += nums[i];
            int rSum = 0;
            for (int j = nums.length-1; j > i; j--) {
                rSum += nums[j];
            }
            if (rSum == lSum)
                return true;
        }
        return false;
    }
}