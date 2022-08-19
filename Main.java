package invoice;
import java.util.*;
public class Main {
    Scanner scan = new Scanner(System.in);
    //Variables for Drinks section
    int drserial;
    int drnum;
    double drprise;
    //Varaiables for Vegitable section
    int vegiSerial;
    int vegiNum;
    double vegiPrice;
    //cheps for Vegitable section
    int  chepsNum;
    int cheapSerial;
    double cheapsPrice;
    //medicine for Vegitable section
    void entryData(){

        int prNumber;
        String prName;
        double prPrices;

        System.out.print("Enter your product number:");
        prNumber = scan.nextInt();
        System.out.print("Enter your product Name:");
        prName = scan.next();
//        System.out.println("Enter product prices :");
//        prPrices= scan.nextDouble();

    }
    void productNumbers(){


        System.out.println("Type 1 for Cold drinks \t");
        System.out.println("Type 2 for Vegitables: \t");
        System.out.println("Type 3 for snakes \t");
        System.out.println("Type 4 for medicine \t");
        System.out.println("Type 5 for others product \t");
        System.out.print("Enter number for selecting product :");
    }
    void productName(){

        int num ;
        String name;
        num= scan.nextInt();
        // START COLD DRINK SECTION
                if (num==1){
                    System.out.println("Which one cold drinks you need?");

                        String drinks = "";
                        System.out.println("drinks are 1 for PEPSI"+" 2 for COCA-COLA"+ " "+"3 for MIRINDA"+" "+" "+" 4 for THUMBS UP, 5 for RC");
                        drserial= scan.nextInt();
                            switch (drserial){
                                case 1:
                                   drinks= " 1 for PEPSI";
                                    break;
                                case 2:
                                    drinks="2 for COCA-COLA ";
                                    break;
                                case 3:
                                    drinks="3 for MIRINDA";
                                    break;
                                case 4:
                                    drinks="4 for THUMBSUP ";
                                    break;
                                case 5:
                                    drinks="5 for RC";
                                    break;
                                default:
                                    drinks=" water";
                            }
                         System.out.println("You select "+drinks);
                    System.out.print("Type how many you need :");
                    drnum= scan.nextInt();

                }

        //END COLD DRINK SCTION
         //Start vegitable section
        else if (num ==2 ) {
            System.out.println("You are wanted to buy vegitables:");
            String vegi="";
                    System.out.print("Options are:");
                    System.out.println("1 for Leafy green\t2 for Cruciferous\t3 for Marrow\t4 for Root\t5for Edible plant stem\t 6 for Allium");
                    System.out.print("Entry your vegitables option :");
                    vegiSerial= scan.nextInt();

                    switch (vegiSerial){
                        case 1:
                            vegi="Leafy green vegitables i.e.:\nlettuce, spinach and silverbeet.";
                            break;
                        case 2:
                            vegi="Cruciferous vegitables i.e.:\ncabbage, cauliflower, Brussels sprouts and broccoli.";
                            break;
                        case 3:
                            vegi="Marrow vegitables i.e.:\npumpkin, cucumber and zucchini.";
                            break;
                        case 4:
                            vegi="Root vegitables i.e.:\npotato, sweet potato and yam.";
                            break;
                        case 5:
                            vegi="Edible plant stem vegitables i.e.:\ncelery and asparagus.";
                            break;
                        default:
                            vegi="Allium vegitables i.e.:\nonion, garlic and shallot.";
                            break;
                    }
                    System.out.println("Your selected vegitables are "+" "+vegi);
                    System.out.print("Type how much you need i.e.:kg");
                    vegiNum= scan.nextInt();
        }
        //End vegitable section
         //Start Cheps section
        else if (num==3) {
            System.out.println("what types of cheps you wanted to buy?");
                    String cheps="";
                    System.out.println("Options are:");
                    System.out.println("1 for Bombay sweets Potato Crackers\t2 for DONG DONG cheaps  \t3 for RING cheaps\t4 for Sun cheaps\t5for Homemade cheaps");
                    System.out.print("Entry your cheaps option :");
                    cheapSerial= scan.nextInt();

                    switch (cheapSerial){
                        case 1:
                            cheps="Bombay sweets Potato Crackers";
                            break;
                        case 2:
                            cheps="DONG DONG cheaps";
                            break;
                        case 3:
                            cheps="RING cheaps";
                            break;
                        case 4:
                            cheps="Sun cheaps";
                            break;
                        case 5:
                            cheps="Homemade cheaps";
                            break;
                        default:
                            cheps="other brands cheaps";
                            break;
                    }
                    System.out.println("Your selected cheaps are "+" "+cheps);
                    System.out.print("Type how many packets you need :");
                    chepsNum= scan.nextInt();

                }
        //End snacks section

        else {
            System.out.println("Sorry currently not available this section\n We are working on this field. THANK YOU ");

        }
    }
        //Calculating all products prices

    void Drprise(){
        for (int i=1;i<=drnum; i++){
            drprise=30;
            drprise= drprise* drnum;

        }

    }

    void VegiPrice(){
        for (int j=1; j<=vegiNum; j++){
            vegiPrice = 230;
            vegiPrice = vegiPrice*vegiNum;
        }

    }
    void CheapsPrice(){
        for (int j=1; j<=chepsNum; j++){
            cheapsPrice = 15;
            cheapsPrice = cheapsPrice*chepsNum;
        }

    }
    void productPrices(){
        double total =(drprise+vegiPrice+cheapsPrice);
        System.out.println("Total cold drinks price is: "+"30"+"*"+ drnum+"="+drprise+""+"tk");
        System.out.println("Total vegitables price is: "+"230"+"*"+vegiNum+"="+vegiPrice+""+"tk");
        System.out.println("Total cheaps price is: "+"15"+"*"+chepsNum+"="+cheapsPrice+""+"tk");
        System.out.println("------------------------------------------------------------------------");
        System.out.print("Your total price is :"+"="+total);





    }


    public static void main(String[] args) {
        int num;
        Main pro = new Main();
        pro.productNumbers();
        pro.productName();
        pro.Drprise();
        pro.VegiPrice();
        pro.CheapsPrice();
        pro.productPrices();



    }
}