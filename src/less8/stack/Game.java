package less8.stack;

import java.util.Stack;

public class Game {
    public static void main(String[] args) {


//  создаем колоду и добавляем в нее карты

        Stack<Card> deck = new Stack<>();
        deck.push(new Card("CARD_01"));
        deck.push(new Card("CARD_02"));
        deck.push(new Card("CARD_03"));
        deck.push(new Card("CARD_04"));
        deck.push(new Card("CARD_05"));


//  создаем сброс

        Stack<Card> graveyard = new Stack<>();


//  начинаем игру

        SimpleCardGame game = new SimpleCardGame();
        game.setDeck(deck);
        game.setGraveyard(graveyard);


//  первый игрок берет 3 карты из колоды

        Card card1 = game.getCardFromDeck();
        Card card2 = game.getCardFromDeck();
        Card card3 = game.getCardFromDeck();

        System.out.println("Какие карты достались первому игроку?");
        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);


//  первый игрок отправляет в сброс 3 своих карты

        game.discard(card1);
        game.discard(card2);
        game.discard(card3);

        System.out.println("Какие карты находятся в сбросе?");
        System.out.println(game.getGraveyard().pop());
        System.out.println(game.getGraveyard().pop());
        System.out.println(game.getGraveyard().pop());
    }
}
