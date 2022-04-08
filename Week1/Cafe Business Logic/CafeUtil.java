import java.util.ArrayList;

public class CafeUtil{
    // 1. Cafe Java wants to implement a reward system for customers who always buy more drinks than they did the week before. To calculate how many drinks they need after 10 weeks, write a method that sums together every consecutive integer from 1 to 10 and returns the sum. In other words, add 1 + 2 + 3.. and so on up to 10 and return the result.
    
    // Ninja Bonus:  Add a parameter, numWeeks so that an admin can change the number from 10 to whatever they want.
    
    //int getStreakGoal()
    public int getStreakGoal(){
        int sum = 0;

        for (int i = 1; i <=10; i = i+1) {
            sum = sum + i;
        }
        return sum;
    }

    // 2. GET  ORDER double getOrderTotal(double[] prices)
    // Given an array of item prices from an order, sum all of the prices in the array and return the total. 
    public double getOrderTotal (double[] lineItems){
        double sum = 0;

        for (int idx = 0; idx < lineItems.length; idx++){
            sum += lineItems[idx];
        }
        return sum;
    }

    //3. VOID DISPLAY MENU: Given an ArrayList of menu items (strings), print out each index and menu item. 
    public void displayMenu(ArrayList<String>menuItems){
        for (int idx = 0; idx < menuItems.size();idx++){
            System.out.printf("%s %s \n",idx,menuItems.get(idx));
        }
    }

    //4. ADD CUSTOMER: Print this string to the console: "Please enter your name:"
    // Then add this line of code to get user input from the terminal and store it in the variable  userName: String userName = System.console().readLine();

    //Next print the userName to the console, saying "Hello, [user name here]!"
    // Next print "There are ___ people in front of you" using the number for how many people are ahead of them (how many items already in the array)
    // Then, add the customer's name to the given customers list. And print the list.
    // No need to return anything.

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Enter your name!!!");
        String userName = System.console().readLine();
        System.out.printf("Hello %s ",userName);
        System.out.printf("There are %s people in front of you!",customers.size());
        customers.add(userName);
    }
}
//Re-cap of ArrayList Syntax: myArray.add("Heidi"); // to add an item to an ArrayList.



