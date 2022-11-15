package coding.challenge.card;

public class Main {
	
	public static void main(String[] args) {
		//표준 트럼프 카드 한 장을 생성합니다.
		Card sevenHeart = new StandardCard(StandardSuit.HEARTS, 7);
		
		Pack cp = new StandardPack();
		Deck<Card> deck = new Deck<Card>(cp);
		deck.suffle();
		Card firstCard = deck.dealCard(0);
		System.out.println("Remaining Cards : " + deck.remainingCards());
		System.out.println("First Card : " + firstCard);
		
		
	}

}
