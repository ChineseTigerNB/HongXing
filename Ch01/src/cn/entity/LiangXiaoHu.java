package cn.entity;

/**
 * 集合类
 * @author 梁小虎
 */
public class LiangXiaoHu<E> {

	Object [] num=new Object[0];
	/**
	 * 新增的方法
	 * @param obj
	 */
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
	/**
	 * 根据下标获得值
	 * @param i
	 * @return
	 */
	public Object get(int i) {
		if(i>num.length||num.length==0){
			return "当前集合没有内容！";
		}
		return num[i];
	}
	/**
	 * 返回长度的方法
	 * @return
	 */
	public int size() {
		return num.length;
	}
	/**
	 * 返回出现次数最多的字符
	 * @param list
	 * @return
	 */
	public int count(LiangXiaoHu<E> list) {
		int nums=(int) list.get(0);
		int index=0;
		for (int i = 0; i < list.size(); i++) {
			if(nums==(int)list.get(i)){
				index=i;
				if(i==list.size()){
					break;
				}
			}else{
				nums=(int)list.get(i);
			}
		}
		return (int)list.get(index);
	}
	/**
	 * 获得最大数
	 * @param list
	 * @return
	 */
	public int max(LiangXiaoHu<E> list) {
		int num=(int)list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if(num<(int)list.get(i)){
				num=(int)list.get(i);
			}
		}
		return num;
	}
	/**
	 * 获得最小数
	 * @param list
	 * @return
	 */
	public int min(LiangXiaoHu<E> list) {
		int num=(int)list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if(num>(int)list.get(i)){
				num=(int)list.get(i);
			}
		}
		return num;
	}
	/**
	 * 移除的方法
	 * @param i
	 */
	public void remove(int i) {
		int index=0;
		Object [] arr=new Object[num.length-1];
		for (int j = 0; j < num.length; j++) {
			if(i!=j){
				arr[index]=num[j];
				index++;
			}
		}
		num=new Object[arr.length];
		for (int j = 0; j < num.length; j++) {
			num[j]=arr[j];
		}
	}
	
	/**
	 * 排序的方法
	 * @param list
	 */
	public void sort(LiangXiaoHu<E> list) {
		for (int i = 0; i < list.size(); i++) {
			num[i]=list.get(i);
		}
		for(int i=0;i<num.length-1;i++){//外层循环控制排序趟数
			for (int j = 0; j < num.length-1-i; j++) {
				if((int)num[j]>(int)num[j+1]){
					int temp=(int)num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		} 
	}
	
}
