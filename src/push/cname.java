package push;

import java.util.Arrays;

public class cname {
	public static void main(String[] args) {
		 int arrayNum[] = {2,3,4,5,4,4,3};
		    Arrays.sort(arrayNum);
		    int countArray[]=new int[arrayNum[arrayNum.length-1]+1];
		    for(int i:arrayNum){
		       countArray[i]= countArray[i]+1;
		    }
		    for(int i=1;i<countArray.length;i++){
		        System.out.println(i+" : "+countArray[i]);
		    }
}
	 
}
