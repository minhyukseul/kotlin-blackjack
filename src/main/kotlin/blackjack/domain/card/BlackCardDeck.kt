package blackjack.domain.card

class BlackCardDeck(private val cards: MutableSet<Card>) {
    fun hitCard(): Card {
        val card = cards.first()
        cards.remove(card)
        return card
    }
}