package cn.entity;

public class TT {
	public static void main(String[] args) {
		int [] num={2,2,2,1,1,1,1,1,1,2,2,2,2,2,2,2,22,2};
		
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
		int dd=0;
		System.out.println("出现次数最多的字符："+num[a]);
		System.out.println("不同数：");
		for (int i = 0; i < num.length; i++) {
			if(num[a]==num[i]){
				count++;
			}
			if(num[a]!=num[i]){
				System.out.print(num[i]+"\t");
			}
		}
		System.out.println(count);
	}
}
