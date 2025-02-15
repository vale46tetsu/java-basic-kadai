package kadai_021;

import java.util.Arrays;
import java.util.List;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		Dictionary_Chapter21 Dictionary = new Dictionary_Chapter21();
		Dictionary.words();
		
		List<String> wordsToSearch = Arrays.asList("kiwi", "pear", "banana", "orange");
		
		Dictionary.searchMultiple(wordsToSearch);
	}

};

