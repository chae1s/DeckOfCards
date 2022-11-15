package coding.challenge.card;

import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		//표준 트럼프 카드 한 장을 생성합니다.
		Card sevenHeart = new StandardCard(StandardSuit.HEARTS, 7);
		Random random = new Random();
		Pack cp = new StandardPack();
		Deck<Card> deck = new Deck<Card>(cp);
		deck.suffle();
		int randomNumber = random.nextInt(deck.remainingCards());
		Card randomCard = deck.dealCard(randomNumber);
		System.out.println("Remaining Cards : " + deck.remainingCards());
		System.out.println("Random Card : " + randomCard);
	}

}
