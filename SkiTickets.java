/*************************************

*Assignment: A02 SkiTickets

*Author: Owen Francy

*************************************/

import java.util.Scanner;
   public class SkiTickets

{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);


   System.out.print("Number of adult tickets: ");
   int adult = input.nextInt();
   input.nextLine();
   System.out.print("Number of child tickets: ");
   int child = input.nextInt();
   input.nextLine();
   System.out.printf("Customer Name: ");
   String Name = input.nextLine();
   double x = 93.00;
   double y = 47.00;
   double totalAdultTickets = x*adult;
   double totalChildTickets=  y*child;
   double finalTotal =totalAdultTickets + totalChildTickets;

   
   System.out.printf("\nInvoice for %s:", Name);
   System.out.printf("\nAdult Tickets %d  .. $ %.2f", adult, totalAdultTickets);
   System.out.printf("\nChild Tickets %d  .. $ %.2f\n", child, totalChildTickets);

   System.out.printf("----------------------------\n");
   System.out.println();
   System.out.printf("%29s", String.format("$ %.2f\n", finalTotal));
   System.out.printf("\t\t\t\t\t\t =========");
   
}
}