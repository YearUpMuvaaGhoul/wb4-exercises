package com.pluralsight;

public class Main {
    public static void main(String[] args) throws Exception {

        Deck deck = new Deck();
        deck.shuffle();

        System.out.println("Welcome to Blackjack!");
        String player1Name = Console.PromptForString("Player 1, enter your name: ");

        System.out.println("Dealing cards... 2 cards to each player!");



        System.out.println("The dealer hand is:");
        Hand dealerHand = new Hand();
        dealerHand.Deal(deck.deal());
        dealerHand.Deal(deck.deal()); //alternate code to below
        dealerHand.DisplayHand();


        System.out.println(player1Name + "'s hand is:");
        Card player1Card1 = deck.deal(); // drawing card from the deck and storing in dealerCard1
        Card player1Card2 = deck.deal(); //" "
        Hand player1Hand = new Hand(); // creates Hand object
        player1Hand.Deal(player1Card1); // add dealerCard to dealerHand
        player1Hand.Deal(player1Card2);
        player1Hand.DisplayHand();

        if(dealerHand.getValue() == player1Hand.getValue()){
            System.out.println("It's a TIE!");
        }
        else if(dealerHand.getValue() > player1Hand.getValue()){
            System.out.println("Dealer wins!");
        }
        else{
            System.out.println(player1Name + " wins!");
        }

    }
}