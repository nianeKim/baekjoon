package baekjoon;

import java.util.HashSet;

public class SelfNumber {
    public static void main(String[] args) {
        SelfNumber selfNumber = new SelfNumber();
        selfNumber.selfNumber();

    }
    public void selfNumber(){
        int sum = 0;
        HashSet nums = new HashSet();
        for(int i=1;i<10000;i++){
            nums.add(i);
        }

        HashSet hs = new HashSet();
        for(int i=1; i<10000;i++){
            String num = String.valueOf(i);
            String[] arr = num.split("");

            for(int j=0;j<arr.length;j++){
                sum += Integer.parseInt(arr[j]);
            } sum+=i;

            //System.out.println("n="+i+"일때:"+sum);
            hs.add(sum);
            sum=0;
        }
       //System.out.println(hs);
        //System.out.println(nums);
        //ArrayList<Integer> list = new ArrayList<Integer>(hs);
       // System.out.println(list);

        HashSet selfNums = new HashSet();
        for(int i=1; i<10000; i++){
            for(Object a:hs){
                if(a.equals(i)){
                   nums.remove(i);
                }
            }
        }
        for(Object a:nums){
            System.out.println(a);
        }
    }
}
