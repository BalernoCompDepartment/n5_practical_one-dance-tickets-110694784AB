import com.sun.java.util.jar.pack.ConstantPool.Index;

class Main {
  public static void main(String[] args) {
  
//so far it is looking good a couple of little things to fix and the output loop to finish keep going!
//Thank you! :)
  String groupName = Keyboard.getText("\n" + "Please enter the name of your group.");
// ask user to enter Group name of their group to store for later

  int groupNumbers = Keyboard.getInt("\n" + "Please enter the number of people in your group.");
// store number as value

  while (groupNumbers < 4 || groupNumbers > 10) {
// while value < min or value > max
    Screen.display("Please enter a number between 4 and 10.", "Error");
//display error
    groupNumbers = Keyboard.getInt("Please enter the number of people in your group.");
//ask user to enter valid number and store number as value
  } //end loop
  
double [] ticketPrice = new double [groupNumbers];
String [] pupilNames = new String [groupNumbers];
String [] pupilTickets = new String [groupNumbers];

for (int index = 0; index < groupNumbers; index ++) {
  pupilNames[index] = Keyboard.getText("Please enter person #" + index + "'s name within the group.");
  pupilTickets[index] = Keyboard.getText("Does " + pupilNames[index] + " want a standard ticket, or a ticket and a photo?");
  }
//for text you need to remember to use .equals("yes") instead of = signs
if (pupilTickets[index].equals("Yes" == "Y")) {
  //like this?
ticketPrice[index] = 4.99; 
} else if (pupilTickets[index].equals("No" == "N")) {
ticketPrice[index] = 3.00; 
} else {
  Screen.display("Please enter Yes or No to the question.", "Error");
}
String output = "";
output = "Group Details\n\n Name of Group: " + groupName + "\nNumber in Group: " + groupNumbers + "\nPeople within the Group: " + pupilNames[index];


}
}

//This is probably as much as I could do right now, I know it's not a fully working program but am doing my best, hopefully it would be enough in a test or whatnot, thanks :)


  
