/*
 * ͨ���ʹ��Ϊ ?
 * ��ʹ�÷�����ʱ���ڶ���һ����������ʱ�����ڵ���ʱʹ��������������ʱ������ʹ��ͨ�����
 */
class Info<T>{
	private T key;
	public void setKey(T key) {
		this.key = key;
	}
	public T getKey() {
		return key;
	}
	
	@Override
	public String toString() {
		return this.getKey().toString();
	}
}
public class GenericDemo04 {

	public static void main(String[] args) {
		Info<String> i = new Info<String>();
		i.setKey("yezi");
		tell(i);		//��Ϊtell����ʱʹ����ͨ����������������ʹ����������,�˴�ΪString
		
		Info<Integer> i2 = new Info<Integer>();
		i2.setKey(100);
		tell(i2); 		//��Ϊtell����ʱʹ����ͨ����������������ʹ����������,�˴�Ϊinteger
	}
	/*
	 * ͨ��� �� ��
	 */
	public static void  tell(Info<?> i) {	//��ָ���������ͣ������ʱ����Ϊ��������
		System.out.println(i);
		
	}

}
