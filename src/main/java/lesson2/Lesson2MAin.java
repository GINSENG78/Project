package lesson2;

public class Lesson2MAin {
    public static void main(String[] args) {
        Lesson2MAin lesson2 = new Lesson2MAin();
        //lesson2.printUserInfo("John Doe", 1);
        boolean isBonusAvailable = true;
        lesson2.checkScore("John Doe", 1, 40, isBonusAvailable);
        lesson2.checkScore("Mark Smith", 2, 50, isBonusAvailable);
        lesson2.checkScore("Anna Smith", 3, 60, isBonusAvailable);
    }
    public void printUserInfo (String username, int userid) {

        System.out.println("The username is  " + username);
        System.out.println("The user ID is " +  userid);
    }

    public void checkScore (String username, int userid, int userscore, boolean isBonusAvailable) {
        System.out.println("The username is  " + username);
        System.out.println("The user ID is " +  userid);

        if (username.equals("John Doe")){
            userscore= userscore+ 20;
        }

        if (isBonusAvailable) {
            userscore= userscore+ 10;
        };
        if (userscore>100 || userscore<0 ) {
            System.out.println("Error");
        }
        else if (userscore >=60) {
            System.out.println("Pass!");
        }
        else {
            System.out.println("Fail!");
        }
    }
}
