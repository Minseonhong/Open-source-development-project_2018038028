package problem_6weeks;

abstract class PairMap {
	protected String keyArray []; 
	protected String valueArray []; 
	abstract String get(String key); 
	abstract void put(String key, String value); 
	abstract String delete(String key); 
	abstract int length(); 
}

class Dictionary extends PairMap {
	private int num;
	private int cnt = 0;
	public Dictionary(int num) {
		this.num = num;
		keyArray = new String[num];
		valueArray = new String[num];
	}
	@Override
	public String get(String key) {
		for(int i=0; i<cnt; i++) {
			if(key.equals(keyArray[i])) {
				return valueArray[i];
			}
		}
		return null;
	}
	@Override
	public void put(String key, String value) {
		if(cnt==num) {
			System.out.println("배열이 꽉 찼습니다.");
			return;
		} 
		
		for(int i=0; i<cnt; i++) {
			if(key.equals(keyArray[i])) {
				valueArray[i] = value; 
				return;
			}
		} 
		
		keyArray[cnt] = key;
		valueArray[cnt] = value;
		cnt++;
	}
	@Override
	public String delete(String key) {
		for(int i=0; i<cnt; i++) {
			if(key.equals(keyArray[i])) {
				valueArray[i] = "null";
				return "null";
			}
		}
		return "해당 이름은 존재하지 않습니다.";
	}
	@Override
	public int length() {
		return cnt;
	}
}

public class problem5_10 {
	public static void main(String[] arsg) {
		Dictionary dic = new Dictionary(10);
		dic.put("황기태", "자바");
		dic.put("이재문", "파이선");
		dic.put("이재문", "C++"); 
		System.out.println("이재문의 값은 " + dic.get("이재문")); 
		System.out.println("황기태의 값은 " + dic.get("황기태")); 
		dic.delete("황기태"); 
		System.out.println("황기태의 값은 " + dic.get("황기태")); 
	}
}