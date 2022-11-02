/**
 * 
 * @author alexis__memo
 * 
 */
import java.util.Scanner;//tool for the scanners
import java.text.DecimalFormat;//tool for the rounding to 2 decimals
public class Solution {
	private static DecimalFormat df2 = new DecimalFormat(".##");//another tool for rounding to 2 decimals
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Welcome to Memo's Egg Emporium!");//gives title
		System.out.print("Please enter the number of eggs you would like: ");//gives instructions
		int eggsno =in.nextInt();//recieves number
		int eggsdozen =(eggsno/12);//creates variable that gives the number of dozens
		double costdozens=eggsdozen;//puts the number of dozens in cost of dozens
		int eggsnoleft=(eggsno%12);//puts the leftover of eggs that aren't in a dozen into a variable
		double costextraeggs= eggsnoleft;//puts the leftover of eggs into their cost
		if (eggsdozen<=2) {//if the number of dozens is less than 2 do this
			System.out.println("That will be "+(eggsdozen)+ " Dozen eggs (" +df2.format(costdozens*1.85)+ "), with "+(eggsnoleft)+" extra eggs ("+df2.format(1.85/12*costextraeggs)+")");//outprints the things that he is going to buy by multiplying the cost of the number of dozens for the number of dozens and dividing the cost of dozen by 12 and multiplying the number of eggs from the leftover to know the cost of the eggs from the leftover
			System.out.println("Your total cost is: "+ df2.format(costdozens*1.85+(1.85/12*costextraeggs)));}//outprints the total cost by summing the cost of dozens and the cost of the eggs from the leftover

		else if(eggsdozen<=4){//if the number of dozens is less than 4 and more than 2 do this
			System.out.println("That will be "+(eggsdozen)+ " Dozen eggs (" +df2.format(costdozens*1.60)+ "), with "+(eggsnoleft)+" extra eggs ("+df2.format(1.60/12*costextraeggs)+")");//outprints the things that he is going to buy by multiplying the cost of the number of dozens for the number of dozens and dividing the cost of dozen by 12 and multiplying the number of eggs from the leftover to know the cost of the eggs from the leftover
			System.out.println("Your total cost is: "+ df2.format(costdozens*1.60+(1.60/12*costextraeggs)));	//outprints the total cost by summing the cost of dozens and the cost of the eggs from the leftover


		}
		else if(eggsdozen<=7){//if the number of dozens is less than 7 and more than 4 do this
			System.out.println("That will be "+(eggsdozen)+ " Dozen eggs (" +df2.format(costdozens*1.52)+ "), with "+(eggsnoleft)+" extra eggs ("+df2.format(1.52/12*costextraeggs)+")");//outprints the things that he is going to buy by multiplying the cost of the number of dozens for the number of dozens and dividing the cost of dozen by 12 and multiplying the number of eggs from the leftover to know the cost of the eggs from the leftover
			System.out.println("Your total cost is: "+ df2.format(costdozens*1.52+(1.52/12*costextraeggs)));	//outprints the total cost by summing the cost of dozens and the cost of the eggs from the leftover


		}
		else if(eggsdozen<=10){//if the number of dozens is less than 10 and more than 7 do this
			System.out.println("That will be "+(eggsdozen)+ " Dozen eggs (" +df2.format(costdozens*1.39)+ "), with "+(eggsnoleft)+" extra eggs ("+df2.format(1.39/12*costextraeggs)+")");//outprints the things that he is going to buy by multiplying the cost of the number of dozens for the number of dozens and dividing the cost of dozen by 12 and multiplying the number of eggs from the leftover to know the cost of the eggs from the leftover
			System.out.println("Your total cost is: "+ df2.format(costdozens*1.39+(1.39/12*costextraeggs)));	//outprints the total cost by summing the cost of dozens and the cost of the eggs from the leftover


		}
		else if(eggsdozen>=11){//if the number of dozens is more than 10 do this
			System.out.println("That will be "+(eggsdozen)+ " Dozen eggs (" +df2.format(costdozens*1.25)+ "), with "+(eggsnoleft)+" extra eggs ("+df2.format(1.25/12*costextraeggs)+")");//outprints the things that he is going to buy by multiplying the cost of the number of dozens for the number of dozens and dividing the cost of dozen by 12 and multiplying the number of eggs from the leftover to know the cost of the eggs from the leftover
			System.out.println("Your total cost is: "+ df2.format(costdozens*1.25+(1.25/12*costextraeggs)));	//outprints the total cost by summing the cost of dozens and the cost of the eggs from the leftover

		}
	}

}