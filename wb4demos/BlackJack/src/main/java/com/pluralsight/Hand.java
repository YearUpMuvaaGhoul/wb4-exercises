package com.pluralsight;
import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;

    public Hand(){
        this.cards = new ArrayList<Card>();
    }

    public void Deal (Card card){
        cards.add(card);
    }

    public int getSize(){
        return cards.size();
    }

    public int getValue(){
        int handValue = 0;
        for
    }
}

