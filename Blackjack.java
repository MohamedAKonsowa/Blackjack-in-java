
import java.util.Scanner;
public class Blackjack {
    public static void main(String[]args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("The cards are being shuffled");
        int shuffle = 0;
        while (shuffle == 0) {
            int i, one, two, three, four, five, six, seven, eight, nine, ten, king, queen, jack, total, game, round, pw, p1w, dw, draw, x, check, check1, check2, pd0draw, pp1draw, dp1draw, p0draw, p1draw, dealer0draw;
            boolean stand = false;
            one = 4;
            two = 4;
                three = 4;
            four = 4;
            five = 4;
            six = 4;
            seven = 4;
                 eight = 4;
            nine = 4;
            ten = 4;
            king = 4;
                 queen = 4;
            jack = 4;
            total = 52;
            game = 0;
            pw = 0;
            p1w = 0;
            dw = 0;
            draw = 0;
            check = 0;
            check1 = 0;
            check2 = 0;
            pd0draw = 0;
            pp1draw = 0;
            dp1draw = 0;
            int player;
            int player1;
            int dealer;
            for (i = 0; i >= 0; i++) {
                round = 0;
                player = 0;
                player1 = 0;
                dealer = 0;
                p0draw = pd0draw + draw + pp1draw;
                p1draw = pp1draw + draw + dp1draw;
                dealer0draw = pd0draw + draw + dp1draw;
                if (total < 6) {
                    System.out.println("There are less cards than required to play another round");
                    System.out.println("You have played " + game);
                    System.out.println("The player won " + pw + " rounds");
                    System.out.println("Player1 won " + p1w + " rounds");
                    System.out.println("The dealer won " + dw + " rounds");
                    System.out.println("The player drew " + p0draw + " rounds");
                    System.out.println("The player1 drew " + p1draw + " rounds");
                    System.out.println("The dealer drew " + dealer0draw + " rounds");
                    break;
                }
                if (total > 6) {
                    System.out.println("\n\nwill you play");
                    String a2 = s1.nextLine();
                    if (a2.equals("no")) {
                        System.out.println("You have played " + game);
                        System.out.println("The player won " + pw + " rounds");
                        System.out.println("Player1 won " + p1w + " rounds");
                        System.out.println("The dealer won " + dw + " rounds");
                        System.out.println("The player drew " + p0draw + " rounds");
                        System.out.println("The player1 drew " + p1draw + " rounds");
                        System.out.println("The dealer drew " + dealer0draw + " rounds");
                        break;
                    }
                    if (a2.equals("yes")) {
                        x = 1;
                        game = game + 1;
                        System.out.println("Game " + game);
                        for (int j = 0; j >= 0; j++) {
                            do {
                                round = round + 1;
                                System.out.println("Round " + round);
                                do {
                                    int generated = (int) (Math.random() * 13) + 1;
                                    if (total < 3){
                                        System.out.println("There are no remaining cards in the deck");
                                        check = 1;
                                    }
                                    if (!stand) {
                                        if (generated == 1) {
                                            if (one > 0) {
                                                check = 1;
                                                one = one - 1;
                                                total = total - 1;
                                                System.out.println("You drew an ace");
                                                if (player + 11 <= 21) {
                                                    player = player + 11;
                                                    System.out.println("The ace value is 11");
                                                } else {
                                                    player = player + 1;
                                                    System.out.println("The ace value is 1");
                                                }
                                                System.out.println("Your score is " + player);
                                            } else {
                                                check = 0;
                                            }
                                        }
                                        if (generated == 2) {
                                            if (two > 0) {
                                                check = 1;
                                                two = two - 1;
                                                total = total - 1;
                                                System.out.println("You drew a two");
                                                player = player + 2;
                                                System.out.println("Your score is " + player);
                                            } else {
                                                check = 0;
                                            }
                                        }
                                        if (generated == 3) {
                                            if (three > 0) {
                                                check = 1;
                                                three = three - 1;
                                                total = total - 1;
                                                System.out.println("You drew a three");
                                                player = player + 3;
                                                System.out.println("Your score is " + player);
                                            } else {
                                                check = 0;
                                            }
                                        }
                                        if (generated == 4) {
                                            if (four > 0) {
                                                check = 1;
                                                four = four - 1;
                                                total = total - 1;
                                                System.out.println("You drew a four");
                                                player = player + 4;
                                                System.out.println("Your score is " + player);
                                            } else {
                                                check = 0;
                                            }
                                        }
                                        if (generated == 5) {
                                            if (five > 0) {
                                                check = 1;
                                                five = five - 1;
                                                total = total - 1;
                                                System.out.println("You drew a five");
                                                player = player + 5;
                                                System.out.println("Your score is " + player);
                                            } else {
                                                check = 0;
                                            }
                                        }
                                        if (generated == 6) {
                                            if (six > 0) {
                                                check = 1;
                                                six = six - 1;
                                                total = total - 1;
                                                System.out.println("You drew a six");
                                                player = player + 6;
                                                System.out.println("Your score is " + player);
                                            } else {
                                                check = 0;
                                            }
                                        }
                                        if (generated == 7) {
                                            if (seven > 0) {
                                                check = 1;
                                                seven = seven - 1;
                                                total = total - 1;
                                                System.out.println("You drew a seven");
                                                player = player + 7;
                                                System.out.println("Your score is " + player);
                                            } else {
                                                check = 0;
                                            }
                                        }
                                        if (generated == 8) {
                                            if (eight > 0) {
                                                check = 1;
                                                eight = eight - 1;
                                                total = total - 1;
                                                System.out.println("You drew a eight");
                                                player = player + 8;
                                                System.out.println("Your score is " + player);
                                            } else {
                                                check = 0;
                                            }
                                        }
                                        if (generated == 9) {
                                            if (nine > 0) {
                                                check = 1;
                                                nine = nine - 1;
                                                total = total - 1;
                                                System.out.println("You drew a nine");
                                                player = player + 9;
                                                System.out.println("Your score is " + player);
                                            } else {
                                                check = 0;
                                            }
                                        }
                                        if (generated == 10) {
                                            if (ten > 0) {
                                                check = 1;
                                                ten = ten - 1;
                                                total = total - 1;
                                                System.out.println("You drew a ten");
                                                player = player + 10;
                                                System.out.println("Your score is " + player);
                                            } else {
                                                check = 0;
                                            }
                                        }
                                        if (generated == 11) {
                                            if (king > 0) {
                                                check = 1;
                                                king = king - 1;
                                                total = total - 1;
                                                System.out.println("You drew a king");
                                                player = player + 10;
                                                System.out.println("Your score is " + player);
                                            } else {
                                                check = 0;
                                            }
                                        }
                                        if (generated == 12) {
                                            if (queen > 0) {
                                                check = 1;
                                                queen = queen - 1;
                                                total = total - 1;
                                                System.out.println("You drew a queen");
                                                player = player + 10;
                                                System.out.println("Your score is " + player);
                                            } else {
                                                check = 0;
                                            }
                                        }
                                        if (generated == 13) {
                                            if (jack > 0) {
                                                check = 1;
                                                jack = jack - 1;
                                                total = total - 1;
                                                System.out.println("You drew a jack");
                                                player = player + 10;
                                                System.out.println("Your score is " + player);
                                            } else {
                                                check = 0;
                                            }
                                        }
                                    }
                                    stand = false;
                                } while (check == 0);
                                do {

                                        int generated2 = (int) (Math.random() * 13) + 1;

                                        if (generated2 == 1 && (dealer + 11) > 21) {
                                            if (one > 0) {
                                                check1 = 1;
                                                one = one - 1;
                                                total = total - 1;
                                                dealer = dealer + 1;
                                                System.out.println("The dealer has drew a card");
                                            } else {
                                                check1 = 0;
                                            }
                                        }
                                        if (generated2 == 1 && (dealer + 11) <= 21) {
                                            if (one > 0) {
                                                check1 = 1;
                                                one = one - 1;
                                                total = total - 1;
                                                dealer = dealer + 11;
                                                System.out.println("The dealer has drew a card");
                                            } else {
                                                check1 = 0;
                                            }
                                        }
                                        if (generated2 == 2) {
                                            if (two > 0) {
                                                check1 = 1;
                                                two = two - 1;
                                                total = total - 1;
                                                dealer = dealer + 2;
                                                System.out.println("The dealer has drew a card");
                                            } else {
                                                check1 = 0;
                                            }
                                        }

                                        if (generated2 == 3) {
                                            if (three > 0) {
                                                check1 = 1;
                                                three = three - 1;
                                                total = total - 1;
                                                dealer = dealer + 3;
                                                System.out.println("The dealer has drew a card");
                                            } else {
                                                check1 = 0;
                                            }
                                        }

                                        if (generated2 == 4) {
                                            if (four > 0) {
                                                check1 = 1;
                                                four = four - 1;
                                                total = total - 1;
                                                dealer = dealer + 4;
                                                System.out.println("The dealer has drew a card");
                                            } else {
                                                check1 = 0;
                                            }
                                        }

                                        if (generated2 == 5) {
                                            if (five > 0) {
                                                check1 = 1;
                                                five = five - 1;
                                                total = total - 1;
                                                dealer = dealer + 5;
                                                System.out.println("The dealer has drew a card");
                                            } else {
                                                check1 = 0;
                                            }
                                        }

                                        if (generated2 == 6) {
                                            if (six > 0) {
                                                check1 = 1;
                                                six = six - 1;
                                                total = total - 1;
                                                dealer = dealer + 6;
                                                System.out.println("The dealer has drew a card");
                                            } else {
                                                check1 = 0;
                                            }
                                        }

                                        if (generated2 == 7) {
                                            if (seven > 0) {
                                                check1 = 1;
                                                seven = seven - 1;
                                                total = total - 1;
                                                dealer = dealer + 7;
                                                System.out.println("The dealer has drew a card");
                                            } else {
                                                check1 = 0;
                                            }
                                        }

                                        if (generated2 == 8) {
                                            if (eight > 0) {
                                                check1 = 1;
                                                eight = eight - 1;
                                                total = total - 1;
                                                dealer = dealer + 8;
                                                System.out.println("The dealer has drew a card");
                                            } else {
                                                check1 = 0;
                                            }
                                        }

                                        if (generated2 == 9) {
                                            if (nine > 0) {
                                                check1 = 1;
                                                nine = nine - 1;
                                                total = total - 1;
                                                dealer = dealer + 9;
                                                System.out.println("The dealer has drew a card");
                                            } else {
                                                check1 = 0;
                                            }
                                        }

                                        if (generated2 == 10) {
                                            if (ten > 0) {
                                                check1 = 1;
                                                ten = ten - 1;
                                                total = total - 1;
                                                dealer = dealer + 10;
                                                System.out.println("The dealer has drew a card");
                                            } else {
                                                check1 = 0;
                                            }
                                        }

                                        if (generated2 == 11) {
                                            if (king > 0) {
                                                check1 = 1;
                                                king = king - 1;
                                                total = total - 1;
                                                dealer = dealer + 10;
                                                System.out.println("The dealer has drew a card");
                                            } else {
                                                check1 = 0;
                                            }
                                        }

                                        if (generated2 == 12) {
                                            if (queen > 0) {
                                                check1 = 1;
                                                queen = queen - 1;
                                                total = total - 1;
                                                dealer = dealer + 10;
                                                System.out.println("The dealer has drew a card");
                                            } else {
                                                check1 = 0;
                                            }
                                        }

                                        if (generated2 == 13) {
                                            if (jack > 0) {
                                                check1 = 1;
                                                jack = jack - 1;
                                                total = total - 1;
                                                dealer = dealer + 10;
                                                System.out.println("The dealer has drew a card");
                                            } else {
                                                check1 = 0;
                                            }
                                        }
                                } while (check1 == 0);

                                do {
                                    int stand2 = 0;
                                    if (player1 >= 17)
                                    {
                                        stand2 = (int)(Math.random()*3);
                                    }
                                    if (stand2 < 2) {
                                        int generated3 = (int) (Math.random() * 13) + 1;

                                        if (generated3 == 1 && (player1 + 11) > 21) {
                                            if (one > 0) {
                                                check2 = 1;
                                                one = one - 1;
                                                total = total - 1;
                                                player1 = player1 + 1;
                                                System.out.println("Player1 has drew a card");
                                            } else {
                                                check2 = 0;
                                            }
                                        }
                                        if (generated3 == 1 && (player1 + 11) <= 21) {
                                            if (one > 0) {
                                                check2 = 1;
                                                one = one - 1;
                                                total = total - 1;
                                                player1 = player1 + 11;
                                                System.out.println("Player1 has drew a card");
                                            } else {
                                                check2 = 0;
                                            }
                                        }

                                        if (generated3 == 2) {
                                            if (two > 0) {
                                                check2 = 1;
                                                two = two - 1;
                                                total = total - 1;
                                                player1 = player1 + 2;
                                                System.out.println("Player1 has drew a card");
                                            } else {
                                                check2 = 0;
                                            }
                                        }

                                        if (generated3 == 3) {
                                            if (three > 0) {
                                                check2 = 1;
                                                three = three - 1;
                                                total = total - 1;
                                                player1 = player1 + 3;
                                                System.out.println("Player1 has drew a card");
                                            } else {
                                                check2 = 0;
                                            }
                                        }

                                        if (generated3 == 4) {
                                            if (four > 0) {
                                                check2 = 1;
                                                four = four - 1;
                                                total = total - 1;
                                                player1 = player1 + 4;
                                                System.out.println("Player1 has drew a card");
                                            } else {
                                                check2 = 0;
                                            }
                                        }

                                        if (generated3 == 5) {
                                            if (five > 0) {
                                                check2 = 1;
                                                five = five - 1;
                                                total = total - 1;
                                                player1 = player1 + 5;
                                                System.out.println("Player1 has drew a card");
                                            } else {
                                                check2 = 0;
                                            }
                                        }

                                        if (generated3 == 6) {
                                            if (six > 0) {
                                                check2 = 1;
                                                six = six - 1;
                                                total = total - 1;
                                                player1 = player1 + 6;
                                                System.out.println("Player1 has drew a card");
                                            } else {
                                                check2 = 0;
                                            }
                                        }

                                        if (generated3 == 7) {
                                            if (seven > 0) {
                                                check2 = 1;
                                                seven = seven - 1;
                                                total = total - 1;
                                                player1 = player1 + 7;
                                                System.out.println("Player1 has drew a card");
                                            } else {
                                                check2 = 0;
                                            }
                                        }

                                        if (generated3 == 8) {
                                            if (eight > 0) {
                                                check2 = 1;
                                                eight = eight - 1;
                                                total = total - 1;
                                                player1 = player1 + 8;
                                                System.out.println("Player1 has drew a card");
                                            } else {
                                                check2 = 0;
                                            }
                                        }

                                        if (generated3 == 9) {
                                            if (nine > 0) {
                                                check2 = 1;
                                                nine = nine - 1;
                                                total = total - 1;
                                                player1 = player1 + 9;
                                                System.out.println("Player1 has drew a card");
                                            } else {
                                                check2 = 0;
                                            }
                                        }

                                        if (generated3 == 10) {
                                            if (ten > 0) {
                                                check2 = 1;
                                                ten = ten - 1;
                                                total = total - 1;
                                                player1 = player1 + 10;
                                                System.out.println("Player1 has drew a card");
                                            } else {
                                                check2 = 0;
                                            }
                                        }

                                        if (generated3 == 11) {
                                            if (king > 0) {
                                                check2 = 1;
                                                king = king - 1;
                                                total = total - 1;
                                                player1 = player1 + 10;
                                                System.out.println("Player1 has drew a card");
                                            } else {
                                                check2 = 0;
                                            }
                                        }

                                        if (generated3 == 12) {
                                            if (queen > 0) {
                                                check2 = 1;
                                                queen = queen - 1;
                                                total = total - 1;
                                                player1 = player1 + 10;
                                                System.out.println("Player1 has drew a card");
                                            } else {
                                                check2 = 0;
                                            }
                                        }

                                        if (generated3 == 13) {
                                            if (jack > 0) {
                                                check2 = 1;
                                                jack = jack - 1;
                                                total = total - 1;
                                                player1 = player1 + 10;
                                                System.out.println("Player1 has drew a card");
                                            } else {
                                                check2 = 0;
                                            }
                                        }
                                    }
                                } while (check2 == 0);
                                ////////////////////////////////////////////////////
                                int max1 = Math.max(player, dealer);
                                int max2 = Math.max(dealer, player1);
                                int max = Math.max(max1, max2);
                                if (dealer >= 17 && dealer <= 21) {
                                    System.out.println("The dealer decided not to draw");
                                    if (player == dealer && dealer == player1) {
                                        draw = draw + 1;
                                        System.out.println("Player and Dealer and Player1 hold the same score\nThe game ended in a draw");
                                        break;
                                    } else if (player == dealer) {
                                        if (player1 <= 21) {
                                            if (player1 > dealer) {
                                                p1w++;
                                                System.out.println("Player1 wins");
                                                System.out.println("Players score is " + player + "\nThe dealers score is " + dealer + "\nPlayer1 score is " + player1);
                                            }
                                            if (player1 < dealer) {
                                                pd0draw++;
                                                System.out.println("Player1 losses as the dealer and player draw");
                                                System.out.println("Players score is " + player + "\nThe dealers score is " + dealer + "\nPlayer1 score is " + player1);
                                            }
                                        }
                                        if (player1 > 21) {
                                            pd0draw++;
                                            System.out.println("Player1 losses as the dealer and player draw");
                                            System.out.println("Players score is " + player + "\nThe dealers score is " + dealer + "\nPlayer1 score is " + player1);
                                        }
                                    } else if (player == player1) {
                                        if (player <= 21) {
                                            if (dealer > player) {
                                                dw++;
                                                System.out.println("The dealer wins");
                                                System.out.println("Players score is " + player + "\nThe dealers score is " + dealer + "\nPlayer1 score is " + player1);
                                            }
                                            if (dealer < player) {
                                                pp1draw++;
                                                System.out.println("The dealer loses as both player and player1 draw");
                                                System.out.println("Players score is " + player + "\nThe dealers score is " + dealer + "\nPlayer1 score is " + player1);
                                            }
                                        }
                                        if (player > 21) {
                                            dw++;
                                            System.out.println("The dealer wins");
                                            System.out.println("Players score is " + player + "\nThe dealers score is " + dealer + "\nPlayer1 score is " + player1);
                                        }
                                    } else if (dealer == player1) {
                                        if (player <= 21) {
                                            if (player > dealer) {
                                                pw++;
                                                System.out.println("Player wins");
                                                System.out.println("Players score is " + player + "\nThe dealers score is " + dealer + "\nPlayer1 score is " + player1);
                                            }
                                            if (dealer > player) {
                                                dp1draw++;
                                                System.out.println("Player losses as dealer and player1 draw");
                                                System.out.println("Players score is " + player + "\nThe dealers score is " + dealer + "\nPlayer1 score is " + player1);
                                            }
                                        }
                                        if (player > 21) {
                                            dp1draw++;
                                            System.out.println("Player losses as dealer and player1 draw");
                                            System.out.println("Players score is " + player + "\nThe dealers score is " + dealer + "\nPlayer1 score is " + player1);
                                        }
                                    }
                                    else if (player > 21){
                                        System.out.println("Player losses as he passed 21");
                                        if (dealer>player1){
                                            dw++;
                                            System.out.println("dealer wins");
                                            System.out.println("Players score is " + player + "\nThe dealers score is " + dealer + "\nPlayer1 score is " + player1);
                                        }
                                        else if (player1 <=21){
                                            p1w++;
                                            System.out.println("Player1 Wins");
                                            System.out.println("Players score is " + player + "\nThe dealers score is " + dealer + "\nPlayer1 score is " + player1);
                                        }
                                    }
                                    else if (player1 > 21){
                                        System.out.println("Player1 losses as he passes 21");
                                        if (dealer>player){
                                            dw++;
                                            System.out.println("dealer wins");
                                            System.out.println("Players score is " + player + "\nThe dealers score is " + dealer + "\nPlayer1 score is " + player1);
                                        }
                                        if (player > dealer){
                                            pw++;
                                            System.out.println("Player wins");
                                            System.out.println("Players score is " + player + "\nThe dealers score is " + dealer + "\nPlayer1 score is " + player1);
                                        }
                                    }

                                    else if (max == dealer) {
                                        dw = dw + 1;
                                        System.out.println("The dealer wins");
                                        System.out.println("The player losses\nPlayers score is " + player + "\nThe dealers score is " + dealer + "\nPlayer1 score is " + player1);
                                        break;
                                    } else if (max == player) {
                                        pw = pw + 1;
                                        System.out.println("Player wins");
                                        System.out.println("The player wins\nPlayers score is " + player + "\nThe dealers score is " + dealer + "\nPlayer1 score is " + player1);
                                        break;
                                    } else if (max == player1) {
                                        p1w = p1w + 1;
                                        System.out.println("Player1 wins");
                                        System.out.println("The player losses\nPlayers score is " + player + "\nThe dealers score is " + dealer + "\nPlayer1 score is " + player1);
                                        break;
                                    }
                                }
                                else if (player > 21 && dealer > 21 && player1 <= 21) {
                                    System.out.println("You have passed 21\nYou lose with a score of " + player);
                                    System.out.println("Player1 wins");
                                    p1w++;
                                    System.out.println("Players score is " + player + "\nThe dealers score is " + dealer + "\nPlayer1 score is " + player1);
                                    j = -2;
                                } else if (player > 21 && player1 > 21 && dealer <= 21) {
                                    System.out.println("You have passed 21\nYou lose with a score of " + player);
                                    System.out.println("The dealer wins");
                                    dw++;
                                    System.out.println("Players score is " + player + "\nThe dealers score is " + dealer + "\nPlayer1 score is " + player1);
                                    j = -2;
                                } else if (player <= 21 && player1 > 21 && dealer > 21) {
                                    System.out.println("Both dealer and player1 passed 21\nYou win with a score of " + player);
                                    pw++;
                                    System.out.println("Players score is " + player + "\nThe dealers score is " + dealer + "\nPlayer1 score is " + player1);
                                    j = -2;
                                } else if (player > 21 && dealer <= 21) {
                                    System.out.println("You have passed 21\nYou lose with a score of " + player);
                                    if (dealer > player1) {
                                        System.out.println("The dealer wins");
                                        dw++;
                                    } else if (player1 > dealer) {
                                        System.out.println("Player1 wins");
                                        pw++;
                                    }
                                    System.out.println("Players score is " + player + "\nThe dealers score is " + dealer + "\nPlayer1 score is " + player1);
                                    j = -2;
                                } else if (dealer > 21 && player <= 21) {
                                    System.out.println("The dealer has passed 21");
                                    if (player > player1) {
                                        System.out.println("The player wins");
                                        pw++;
                                    } else if (player1 > player) {
                                        System.out.println("Player1 wins");
                                        p1w++;
                                    }
                                    System.out.println("Players score is " + player + "\nThe dealers score is " + dealer + "\nPlayer1 score is " + player1);
                                    j = -2;
                                } else if (player1 > 21 && player <= 21) {
                                    System.out.println("Player 1 has passed 21");
                                    if (player > dealer) {
                                        System.out.println("The player wins");
                                        pw++;
                                    } else if (dealer > player) {
                                        System.out.println("Dealer wins");
                                        dw++;
                                    }
                                    System.out.println("Players score is " + player + "\nThe dealers score is " + dealer + "\nPlayer1 score is " + player1);
                                    j = -2;
                                } else if (player > 21) {
                                    System.out.println("No one wins");
                                    System.out.println("Both player and dealer and player1 passed 21\nPlayers score is " + player + "\nThe dealers score is " + dealer + "\nPlayer1 score is " + player1);
                                    j = -2;
                                }
                                x--;
                            } while (x >= 0);
                            if (dealer >= 17) {
                                break;
                            }
                            if (player < 21) {
                                System.out.println("Will you draw again");
                                String a3 = s1.nextLine();
                                if (a3.equals("no")) {
                                    stand = true;
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("Would you like to reshuffle the deck and reset");
            String a2 = s1.nextLine();
            if (a2.equals("yes")){
                System.out.println("The deck is being reshuffled");
            }
            else if (a2.equals("no")){
                System.out.println("The game is turning off");
                shuffle=1;}
        }
    }
}