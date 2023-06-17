public class exercise{
    public static void main(String[] args){
        //Lisa is cooking muffins. The recipe calls for 7 cups of sugar. 
        //She has already put in 2 cups. 
        //How many more cups does she need to put in?

        int totalNumberOfCups = 7;
        int lisaCups = 2;
        int missingCups;

        missingCups = totalNumberOfCups - lisaCups;
        System.out.println("Lisa needs to add "+missingCups+" cups of sugar");

        //At a restaurant, Mike and his three friends decided to divide the 
        //bill evenly. If each person paid $13 then what was the total bill?

        int numberOfPeople = 4;
        int individualBil = 13;
        int totalBill;

        totalBill = numberOfPeople * individualBil;
        System.out.println("The total bill is $"+totalBill);

        //How many packages of diapers can you buy with $40 if one package 
        //costs $8? 

        int budgetMoney = 40;
        int diaperCost = 8;
        int iCanBuy;

        iCanBuy = budgetMoney / diaperCost;
        System.out.println("I can buy "+ iCanBuy+" packages of diapers");

        //Last Friday Trevon had $29. Over the weekend he 
        //received some money for cleaning the attic. He now has $41. 
        //How much money did he receive?

        int fridayMoney = 29;
        int latestMoney = 41;
        int cleaningMoney;
        
        cleaningMoney = latestMoney - fridayMoney;
        System.out.println("Trevon received $"+cleaningMoney+" for cleaning the attic");

        //Last week Julia ran 30 miles more than Pranav. Julia ran 47 miles. 
        //How many miles did Pranav run?
        
        int juliaMaxRun = 47;
        int juliaRunMore = 30;
        int pranaRun;

        pranaRun = juliaMaxRun - juliaRunMore;

        System.out.println("Prana run "+pranaRun+" miles");


        //How many boxes of envelopes can you buy with $12 if 
        //one box costs $3?

        int myMoney = 12;
        int envelopeCost = 3;
        int envelopeCanBuy;

        envelopeCanBuy = myMoney / envelopeCost;
        
        System.out.println("I can buy "+envelopeCanBuy+" boxes of envelopes");

        //After paying $5.12 for a salad, Norachai has $27.10. 
        //How much money did he have before buying the salad?

        double saladCost = 5.12;
        double norachaiMoney = 27.10;
        double moneyBefore;
        
        moneyBefore = norachaiMoney + saladCost;
        System.out.println("Norachai had $"+moneyBefore+" before buying the salad");
    }
}
