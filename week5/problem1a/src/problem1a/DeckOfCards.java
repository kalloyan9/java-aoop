package problem1a;

// Fig. 7.10: DeckOfCards.java
// DeckOfCards class represents a deck of playing cards.
import java.util.Random;

public class DeckOfCards
{
    private Card deck[]; // array of Card objects
    private int currentCard; // index of next Card to be dealt
    private final int NUMBER_OF_CARDS = 52; // constant number of Cards
    private Random randomNumbers; // random number generator

    private String faces[] = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
            "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
    private String suits[] = { "Hearts", "Diamonds", "Clubs", "Spades" };
    // constructor fills deck of Cards
    public DeckOfCards()
    {
        deck = new Card[ NUMBER_OF_CARDS ]; // create array of Card objects
        currentCard = 0; // set currentCard so first Card dealt is deck[ 0 ]
        randomNumbers = new Random(); // create random number generator

        // populate deck with Card objects
        for ( int count = 0; count < deck.length; count++ )
            deck[ count ] =
                    new Card( faces[ count % 13 ], suits[ count / 13 ] );
    } // end DeckOfCards constructor

    // shuffle deck of Cards with one-pass algorithm
    public void shuffle()
    {
        // after shuffling, dealing should start at deck[ 0 ] again
        currentCard = 0; // reinitialize currentCard

        // for each Card, pick another random Card and swap them
        for ( int first = 0; first < deck.length; first++ )
        {
            // select a random number between 0 and 51
            int second =  randomNumbers.nextInt( NUMBER_OF_CARDS );

            // swap current Card with randomly selected Card
            Card temp = deck[ first ];
            deck[ first ] = deck[ second ];
            deck[ second ] = temp;
        } // end for
    } // end method shuffle

    // deal one Card
    public Card dealCard()
    {
        // determine whether Cards remain to be dealt
        if ( currentCard < deck.length )
            return deck[ currentCard++ ]; // return current Card in array
        else
            return null; // return null to indicate that all Cards were dealt
    } // end method dealCard

    public Card[] dealHand() {
        Card[] hand = new Card[5];
        for (int i = 0; i < hand.length; ++i) {
            hand[i] = dealCard();
        }

        return hand;
    }

    private int[] numbers(Card[] hand) {
        int[] numbers = new int[13];
        for (int i = 0; i < hand.length; ++i) {
            for (int j = 0; j < faces.length; ++j) {
                if (hand[i].getFace().equals(faces[j])) {
                    ++numbers[j];
                    break;
                }
            }
        }

        return numbers;
    }

    private int numberOfPairs(int[] numbers) {
        int numberOfPairs = 0;
        for (int i = 0; i < numbers.length; ++i) {
            if (numbers[i] == 2) {
                ++numberOfPairs;
            }
        }

        return numberOfPairs; // def. 0-2
    }

    private int numberOfThree(int[] numbers) {
        int numberOfPairs = 0;
        for (int i = 0; i < numbers.length; ++i) {
            if (numbers[i] == 3) {
                return 1;
            }
        }

        return 0;
    }

    public boolean hasFourOfAKind(Card[] hand) {
        int[] numbers = numbers(hand);
        for (int i = 0; i < numbers.length; ++i) {
            if (numbers[i] == 4) {
                return true;
            }
        }
        return false;
    }

    public boolean hasFullHouse(Card[] hand) {
        int[] numbers = numbers(hand);
        return numberOfPairs(numbers) == 1 && numberOfThree(numbers) == 1;
    }

    private int numberOfSuits(Card[] hand, String suit) {
        int numberOfSuits = 0;
        for (int i = 0; i < hand.length; ++i) {
            if (hand[i].getFace().equals(suit)) {
                ++numberOfSuits;
            }
        }
        return numberOfSuits;
    }

    public boolean hasFlush(Card[] hand) {
        return  numberOfSuits(hand, "Hearts") == 5      ||
                numberOfSuits(hand, "Diamonds") == 5    ||
                numberOfSuits(hand, "Clubs") == 5       ||
                numberOfSuits(hand, "Spades") == 5;
    }

    private boolean hasStraight(Card[] hand) {
        int[] numbers = numbers(hand);
        for (int i = 0; i < numbers.length - 5; ++i) {
            int j = 0;
            while (numbers[i] == 1 && i + j < numbers.length) {
                ++j;
            }
            if (j == 5) {
                return true;
            }
        }

        return false;
    }

    public boolean hasPair(Card[] hand) {
        int[] numbers = numbers(hand);
        // be careful with collision of full house
        return numberOfPairs(numbers) == 1 && numberOfThree(numbers) == 0;
    }

    public boolean hasTwoPair(Card[] hand) {
        int[] numbers = numbers(hand);
        // be careful with collision of full house
        return numberOfPairs(numbers) == 2 && numberOfThree(numbers) == 0;
    }

    public boolean hasThree(Card[] hand) {
        int[] numbers = numbers(hand);
        return numberOfPairs(numbers) == 0 && numberOfThree(numbers) == 1;
    }


} // end class DeckOfCards
