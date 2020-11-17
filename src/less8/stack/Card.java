package less8.stack;


import java.util.Stack;

public class Card {

    public Card(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                '}';
    }
}

class SimpleCardGame {


//  колода

    private Stack<Card> deck;


//  сброс

    private Stack<Card> graveyard;

    public Card getCardFromDeck() {
        // pop() — удаляет верхний элемент из стека и возвращает его. реализация механики “игрок берет карту”
        return deck.pop();
    }

    public void discard(Card card) {
        // push() — добавляет элемент на верх стека. Когда мы отправляем карту в сброс, она ложится поверх сброшенных ранее карт;
        graveyard.push(card);
    }

    public Card lookTopCard() {
        // peek() — возвращает верхний элемент стека, но не удаляет его из стека
        return deck.peek();
    }


    public void setDeck(Stack<Card> deck) {
        this.deck = deck;
    }

    public void setGraveyard(Stack<Card> graveyard) {
        this.graveyard = graveyard;
    }

    public Stack<Card> getGraveyard() {
        return this.graveyard;
    }
}
