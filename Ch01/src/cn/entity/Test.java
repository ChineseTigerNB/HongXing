package cn.entity;


public class Test {
	public static void main(String[] args) {
		LiangXiaoHu<Object> list=new LiangXiaoHu<Object>();
		list.add(10);
		list.add(6);
		list.add(1);
		list.add(2);
		list.add(52);
		list.add(56);
		System.out.println("下标为1的字符："+list.get(1));
		System.out.println("当前集合最大数："+list.max(list));
		System.out.println("当前集合最小数："+list.min(list));
		System.out.println("出现次数最多的字符："+list.count(list));
		System.out.println("移除前集合长度："+list.size());
		list.remove(5);
		System.out.println("移除后集合长度："+list.size());
		System.out.println("集合中的字符：");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+"\t");
		}
		list.sort(list);
		System.out.println("\n升序：");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+"\t");
		}
	}
}
