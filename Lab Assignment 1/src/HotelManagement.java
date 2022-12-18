import java.util.*;
public class HotelManagement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vstr, nvstr, qvstr, qnvstr, vmc, nvmc, qvmc, qnvmc, hd, qhd, cd, qcd, amt = 0, amt1 = 0, amt2 = 0, tamt = 0, tamt1 = 0, tamt2 = 0, totalD = 0, ch; //for restaurant
        double gst = 0, tot, gtotal;
        String str, choice, choice1 ;
        int sdr = 0, pdr = 0, rsr = 0, vb = 0, nvb = 0;
        System.out.println("\t\t\t\t**********Raj Hotel and Restaurant**********\n");
        System.out.println("--> Enter R to opt for Restaurant.\n--> Enter H to opt for Hotel Services.");
        choice1 = in.next();
        while (choice1.equalsIgnoreCase("R")) {
            System.out.println("\t\t\t\t**********Welcome to Raj Restaurant**********\n");
            System.out.println("Stater Corner : 1");
            System.out.println("Main Course : 2");
            System.out.println("Desserts : 3");
            System.out.println("");
            System.out.println("Enter your choice : ");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter VS for Veg Staters and NVS for Non-Veg Staters.");
                    str = in.next();
                    if (str.equalsIgnoreCase("VS")) {
                        System.out.println("The Veg-Staters\t\t\t\tCost");
                        System.out.println("1) Paneer Tikka\t\t\t\t110");
                        System.out.println("2) Crispy Baby Corn\t\t\t150");
                        System.out.println("3) Crispy American Corn\t\t\t150");
                        System.out.println("4) Chilly Potatoes\t\t\t100");
                        System.out.println("5) Chilly Paneer\t\t\t110");
                        System.out.println("");
                        choice = "Y";
                        while (choice.equalsIgnoreCase("Y")) {
                            System.out.println("Choose Veg-Stater by entering number : ");
                            vstr = in.nextInt();
                            System.out.println("Enter the Quantity : ");
                            qvstr = in.nextInt();
                            if (vstr == 1 || vstr == 5) {
                                amt = qvstr * 110;
                            } else if (vstr == 2 || vstr == 3) {
                                amt = qvstr * 150;
                            } else if (vstr == 4) {
                                amt = qvstr * 100;
                            }
                            tamt += amt;
                            System.out.println("To place more order ! Enter Y");
                            choice = in.next();
                        }
                    }
                    if (str.equalsIgnoreCase("NVS")) {
                        System.out.println("The Non-Veg Staters\t\t\t\tCost");
                        System.out.println("1) Kozhi Muttai Fri\t\t\t\t150");
                        System.out.println("2) Pepper Chicken\t\t\t\t140");
                        System.out.println("3) Pepper BBQ\t\t\t\t\t200");
                        System.out.println("4) Mint Chicken Skewers\t\t\t\t150");
                        System.out.println("5) Chilli Flakes Chicken\t\t\t200");
                        System.out.println("");
                        choice = "Y";
                        while (choice.equalsIgnoreCase("y")) {
                            System.out.println("Choose Non-Veg Staters by entering number : ");
                            nvstr = in.nextInt();
                            System.out.println("Enter the Quantity : ");
                            qnvstr = in.nextInt();
                            if (nvstr == 1 || nvstr == 4) {
                                amt = qnvstr * 150;
                            } else if (nvstr == 2) {
                                amt = qnvstr * 140;
                            } else if (nvstr == 3 || nvstr == 5) {
                                amt = qnvstr * 200;
                            }
                            tamt += amt;
                            System.out.println("To place more order ! Enter Y");
                            choice = in.next();
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter VMC for Veg Main Course and NVMC for Non-Veg Main Course.");
                    str = in.next();
                    if (str.equalsIgnoreCase("VMC")) {
                        System.out.println("The Veg Main Course\t\t\tCost");
                        System.out.println("1) Dal Makhni\t\t\t\t210");
                        System.out.println("2) Dal Fry\t\t\t\t200");
                        System.out.println("3) Chana Masala\t\t\t\t210");
                        System.out.println("4) Alloo Gobi\t\t\t\t180");
                        System.out.println("5) Shahi Paneer\t\t\t\t250");
                        System.out.println("");
                        choice = "Y";
                        while (choice.equalsIgnoreCase("Y")) {
                            System.out.println("Choose Veg Main Course by entering number.");
                            vmc = in.nextInt();
                            System.out.println("Enter the Quantity : ");
                            qvmc = in.nextInt();
                            if (vmc == 1 || vmc == 3) {
                                amt1 = qvmc * 210;
                            } else if (vmc == 2) {
                                amt1 = qvmc * 200;
                            } else if (vmc == 4) {
                                amt1 = qvmc * 180;
                            } else if (vmc == 5) {
                                amt1 = qvmc * 250;
                            }
                            tamt1 += amt1;
                            System.out.println("To place more order ! Enter Y");
                            choice = in.next();
                        }
                    }
                    if (str.equalsIgnoreCase("NVMC")) {
                        System.out.println("The Non-Veg Main Course\t\t\t\tCost");
                        System.out.println("1) Chicken Kadhai\t\t\t\t230");
                        System.out.println("2) Butter Chicken\t\t\t\t220");
                        System.out.println("3) Mutton Fry\t\t\t\t\t230");
                        System.out.println("4) Mutton Handi\t\t\t\t\t220");
                        System.out.println("5) Egg Masala\t\t\t\t\t100");
                        System.out.println("");
                        choice = "Y";
                        while (choice.equalsIgnoreCase("Y")) {
                            System.out.println("Choose Non-Veg Main Course by entering number.");
                            nvmc = in.nextInt();
                            System.out.println("Enter the Quantity : ");
                            qnvmc = in.nextInt();
                            if (nvmc == 1 || nvmc == 3) {
                                amt1 = qnvmc * 230;
                            } else if (nvmc == 2 || nvmc == 4) {
                                amt1 = qnvmc * 220;
                            } else if (nvmc == 5) {
                                amt1 = qnvmc * 100;
                            }
                            tamt1 += amt1;
                            System.out.println("To place more order ! Enter Y");
                            choice = in.next();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter HD for Hot Desserts and CD for Cold Desserts.");
                    str = in.next();
                    if (str.equalsIgnoreCase("HD")) {
                        System.out.println("The Hot Desserts\t\t\tCost");
                        System.out.println("1) Gulab Jamun\t\t\t\t50");
                        System.out.println("2) Moong Halwa\t\t\t\t70");
                        System.out.println("3) Pancake\t\t\t\t100");
                        System.out.println("4) Gajar Halwa\t\t\t\t70");
                        System.out.println("5) Chocolate\t\t\t\t50");
                        System.out.println("");
                        choice = "Y";
                        while (choice.equalsIgnoreCase("Y")) {
                            System.out.println("Choose the Hot Desserts by entering number.");
                            hd = in.nextInt();
                            System.out.println("Enter the Quantity : ");
                            qhd = in.nextInt();
                            if (hd == 1 || hd == 5) {
                                amt2 = qhd * 50;
                            } else if (hd == 2 || hd == 4) {
                                amt2 = qhd * 70;
                            } else if (hd == 3) {
                                amt2 = qhd * 100;
                            }
                            tamt2 += amt2;
                            System.out.println("To place more order ! Enter Y");
                            choice = in.next();
                        }
                    }
                    if (str.equalsIgnoreCase("CD")) {
                        System.out.println("The Cold Desserts\t\t\tCost");
                        System.out.println("1) Ice Cream\t\t\t\t50");
                        System.out.println("2) Pastry\t\t\t\t50");
                        System.out.println("3) Banana Split\t\t\t\t120");
                        System.out.println("4) Strawberry Cake\t\t\t120");
                        System.out.println("5) Chocolate Pudding\t\t\t50");
                        System.out.println("");
                        choice = "Y";
                        while (choice.equalsIgnoreCase("Y")) {
                            while (choice.equalsIgnoreCase("Y")) {
                                System.out.println("Choose the Cold Desserts by entering number.");
                                cd = in.nextInt();
                                System.out.println("Enter the Quantity : ");
                                qcd = in.nextInt();
                                if (cd == 1 || cd == 2 || cd == 5) {
                                    amt2 = qcd * 50;
                                } else if (cd == 3 || cd == 4) {
                                    amt2 = qcd * 120;
                                }
                                tamt2 += amt2;
                                System.out.println("To place more order ! Enter Y");
                                choice = in.next();
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Invlaid Input!");
            }
            System.out.println("-->Enter R to go to Main Menu.\n-->Enter B for Billing.");
            choice1 = in.next();
            while (choice1.equalsIgnoreCase("b")) {
                tot = tamt + tamt1 + tamt2;
                System.out.println("Total Amount = Rs" + tot + "\n");
                gst = tot * 18.0 / 100.0;
                System.out.println("GST = Rs" + gst + "\n");
                gtotal = tot + gst - totalD;
                System.out.println("Amount to be paid = Rs" + gtotal);
                System.out.println("");
                System.out.println("\t\t\t**********Thanks for Visiting**********");
                System.out.println("\t\t\t\t*******Visit Again*******");
                break;
            }
        }
        while(choice1.equalsIgnoreCase("H")){
            System.out.println("\t\t\t\t**********Welcome to Raj Hotel Services**********\n");
            System.out.println("1) Room Bookings\n2) Hall Bookings\n3) Weekend Buffet\n");
            System.out.println("Enter your choice : ");
            ch = in.nextInt();
            switch(ch){
                case 1:
                    System.out.println("We have three kind of Rooms available.\n");
                    System.out.println("1) Simple Double Bed Rooms.\t\t\tRs1500/Night");
                    System.out.println("2) Premium Double Bed Rooms.\t\t\tRs2000/Night");
                    System.out.println("3) Royal Suite Rooms.\t\t\t\tRs3500/Night");
                    System.out.println("");
                    System.out.println("Choose the room type by entering the number.");
                    int rch = in.nextInt();
                    if (rch == 1){
                        System.out.println("Thank You for choosing our Simple Double Bed Room.");
                        sdr += sdr + 1500 +((18*1500)/100);
                        System.out.println("Your Bill will be = Rs" + sdr);
                    }
                    if (rch == 2){
                        System.out.println("Thank You for choosing our Simple Double Bed Room.");
                        pdr += pdr + 2000 +((18*2000)/100);
                        System.out.println("Your Bill will be = Rs" + pdr);
                    }
                    if (rch == 1){
                        System.out.println("Thank You for choosing our Simple Double Bed Room.");
                        rsr += rsr + 3500 +((18*3500)/100);
                        System.out.println("Your Bill will be = Rs" + rsr);
                    }
                    break;
                case 2:
                    System.out.println("Choose Ocassion for Hall Booking.");
                    System.out.println("1) Birthday\n2) Anniversary\n3) Marriage\n4) Any other Ocassion");
                    int ch1 = in.nextInt();
                    switch (ch1) {
                        case 1:
                            System.out.println("We provide various offers for Birthday for different age groups : ");
                            System.out.println("1) Below 18 years of age\n2) 18-50 years of age\n3) Above 50 years of age");
                            int pch = in.nextInt();
                            if (pch == 1){
                                System.out.println("The Price for hall will be Rs 5000 (excluding taxes).");
                            }
                            if (pch == 2){
                                System.out.println("The Price for hall will be Rs 7000 (excluding taxes).");
                            }
                            if (pch == 3){
                                System.out.println("The Price for hall will be Rs 4000 (excluding taxes).");
                            }
                            break;
                        case 2:
                            System.out.println("The Hall for Anniversary Party Costs Rs 9100 (excluding taxes).");
                            break;
                        case 3:
                            System.out.println("The Hall for Marriage Costs Rs 50000 (excluding taxes).");
                            break;
                        case 4:
                            System.out.println("The Hall bookings for any other occasion Costs Rs 10000 (excluding taxes).");
                            System.out.println("This is negotiable depending on the occasion.");
                            break;
                        default:
                            System.out.println("Invalid Choice!");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("We have Veg Buffet (VB) and Non-Veg Buffet (NVB).");
                    String chb = in.next();
                    if (chb.equalsIgnoreCase("VB")){
                        System.out.println("The Veg Buffet Costs Rs 550.");
                        vb += 550 + ((18*550)/100);
                        System.out.println("\nYour Bill will be Rs "+vb);
                    }
                    if (chb.equalsIgnoreCase("NVB")){
                        System.out.println("The Non-Veg Buffet Costs Rs 750.");
                        nvb += 750 + ((18*750)/100);
                        System.out.println("\nYour Bill will be Rs "+nvb);
                    }
                    break;
                default:
                    System.out.println("Choose a valid option.");
                    break;
            }
            System.out.println("\nPress H to go to Choice Menu or Press F for Feedback");
            choice1 = in.next();
            if(choice1.equalsIgnoreCase("F")){
                System.out.println("Enter Feedback");
                int f = in.nextInt();
                System.out.println("\t\t\t**********Thanks for Visiting**********");
                System.out.println("\t\t\t\t\t*******Visit Again*******");
            }
        }
    }
}