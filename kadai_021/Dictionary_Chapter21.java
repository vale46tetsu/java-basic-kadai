package kadai_021;

import java.util.HashMap;
import java.util.List;

public class Dictionary_Chapter21 {
	
	private HashMap<String, String> dictionary = new HashMap<String, String>();
	
	public void words() {
		
	dictionary.put("apple" , "りんご");
	dictionary.put("peach","桃");
	dictionary.put("banana","バナナ");
	dictionary.put("lemon","レモン");
	dictionary.put("pear","梨");
	dictionary.put("kiwi","キウィ");
	dictionary.put("starawberry","いちご");
	dictionary.put("grape","ぶどう");
	dictionary.put("muscat","マスカット");
	dictionary.put("cherry","さくらんぼ");
	
	};
	
	public void search(String word) {
		if (dictionary.containsKey(word)) {
			System.out.println(word + "の意味は" + dictionary.get(word));
		}
		
		else {
			System.out.println(word + "は辞書に存在しません");
			}
		};
	
	public void searchMultiple(List<String> words) {
		for (String word : words) {
			search(word);
		}
	};
};
	
	

