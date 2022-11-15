package coding.challenge.card;

import java.util.ArrayList;
import java.util.List;

public class StandardPack extends Pack<StandardCard> {
	
	public StandardPack() {
		super.setCards(build());
	}
	
	protected List<StandardCard> build() {
		List<StandardCard> cards = new ArrayList<StandardCard>();
		
		for(StandardSuit suit : StandardSuit.values()) {
			for(int rank = StandardCard.getMinValue(); rank <= StandardCard.getMaxValue(); rank++) {
				cards.add(new StandardCard(suit, rank));
			}
		}
		
		return cards;
	}

}
