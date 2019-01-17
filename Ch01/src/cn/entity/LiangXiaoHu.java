package cn.entity;


/**
 * 集合类
 * @author 梁小虎
 */
public class LiangXiaoHu<E> {

	Object [] num=new Object[0];
	
	public void add(Object obj) {
		if(num.length==0){
			num=new Object[1];
			num[0]=obj;
		}else{
			Object [] arr=num;
			num=new Object[arr.length+1];
			for (int i = 0; i < num.length; i++) {
				num[i]=arr[i];
				if(arr.length-1==i){
					break;
				}
			}
			for (int i = 0; i < num.length; i++) {
				if(num[i]==null){
					num[i]=obj;
				}
			}
		}
	}
	public Object get(int i) {
		if(i>num.length||num.length==0){
			return "当前集合没有内容！";
		}
		return num[i];
	}
	public int size() {
		return num.length;
	}
	public void remove(int i) {
//		//num[i]=null;
//		Object [] arr=num;
//		num[i]=null;
//		for (int j = 0; j < num.length; j++) {
//			int index=0;
//			if(num[i]==null){
//				index=i;
//			}
//			if(index==0){
//				num[j]=arr[++index];
//			}else{
//				num[j]=arr[j];
//				if(index==j){
//					
//				}
//			}
//		}
	}
}
