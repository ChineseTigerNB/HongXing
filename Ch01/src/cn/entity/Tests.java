package cn.entity;

public class Tests {
	public static void main(String[] args) {
		int [] num=new int[5];
		num[0]=1;
		num[1]=1;
		num[2]=2;
		num[3]=2;
		num[4]=2;
		int count=0;
		int nums=num[0];
		int a=0;
		for (int i = 0; i < num.length; i++) {
			if(nums==num[i]){
				count++;
				a=i;
				if(i==num.length){
					break;
				}
			}else{
				nums=num[i];
				count=0;
			}
		}
		System.out.println(num[a]);
	}
	
}
