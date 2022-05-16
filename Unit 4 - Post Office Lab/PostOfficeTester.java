public class PostOfficeTester{
public static void main(String[] args)
 {
  PostOffice branch = new PostOffice(5);
  branch.retrieveMsg(5);
  branch.placeLetter(new Letter("Arnold", "I'll be back!"),5);
  branch.placeLetter(new Letter("Spock", "Live long and prosper."),4);
  branch.placeLetter(new Letter("Kirk", "KHAAAAAN!"),4);
  branch.retrieveMsg(4);
  branch.retrieveMsg(2);
  branch.retrieveMsg(-1);
  branch.placeLetter(new Letter("Harry", "Make my day!"),0);
  branch.placeLetter(new Letter("Ellie", "Thanks for the adventure! Now go have   another one!"), 1);
  branch.placeLetter(new Letter("Buzz", "To infinity... and beyond!"), 3);
  branch.placeLetter(new Letter("Puppy", "Vet appointment today!"), -3);

  branch.findSender("Kirk");
  branch.findSender("Ellie");
  }
  }
