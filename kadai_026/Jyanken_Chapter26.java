package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			
			String choice = scanner.next();
			
			if(choice.equals("r") || choice.equals("s") || choice.equals("p")) {
				scanner.close();
				return choice;
				
			}
			else {
				
				System.out.println("r s p のいずれかを入力してください");
				
			}
		}
		
	}
	
	public String getRandom() {
		String[] janken = { "r", "s", "p" };
		String choice = janken[(int) Math.floor(Math.random()*3)] ;
		return choice;
	}
	
	public void playGame(String myChoice, String random) {
		
		HashMap<String, String> play = new HashMap<>();
		
		play.put("r", "グー");
		play.put("s", "チョキ");
		play.put("p", "パー");
		
		System.out.println("自分の手は" + play.get(myChoice) + ",対戦相手の手は" + play.get(random));
		
		if(myChoice.equals(random)) {
			
	        System.out.println("あいこです");
	            
	        }
		else if (
				 
	            myChoice.equals("r") && random.equals("s") ||
	            myChoice.equals("s") && random.equals("p") ||
	            myChoice.equals("p") && random.equals("r")) {
			 
	            System.out.println("自分の勝ちです");
	            
	        } 
		 else {
			 
	            System.out.println("自分の負けです");
	            
	        }
	    }
		
	}


