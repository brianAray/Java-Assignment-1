package com.revature.fixme;

import com.revature.util.Checker;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class OfficeTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    private Office office = null;

    @BeforeAll
    public void setUp() {
        System.setOut(new PrintStream(outContent));
        this.office = new Office();
    }

    @AfterAll
    public void teardown() {
        System.setOut(originalOut);
        this.office = null;
    }

    @Test
    void FixedBrokenPrinterTest(){

        // This needs to be sent to the printer
        String message = "I am working now!";

        // Instantiating the broken printer object
        BrokenPrinter brokenPrinter = new BrokenPrinter();

        //Fix this method
        brokenPrinter.sendToPrinter(message);

        //Fix this method to print to the console and test
        System.out.print(brokenPrinter.getMessage());

        //Test to see if what you did works by checking if they are the same
        assertEquals(message, outContent.toString());
    }


    @Test
    void allCapsTest(){
        String lowerCaseMessage = "all caps";
        String upperCaseMessage = "ALL CAPS";

        assertEquals(this.office.allCaps(lowerCaseMessage), upperCaseMessage);
    }

    @Test
    void reverseTheWordsTest(){
        String strangeMessage = "!!uoy htiw etacinummoc nac I yaw ylno eht si draobyek siht dna enihcam lasrever emit a ni kcuts ma I !pleH";
        String reversedMessage = "";
        // Create a method in Office to reverse the strange message
        assertEquals(Checker.getSolvedMessage(), reversedMessage);
    }

    @Test
    void orderBySizeTest(){
        // Make an algorithm to sort me
        // Use Arrays.sort() for an indication of what the solution to look like
        // Then implement your own algorithm to sort
        double[] moneyArray = {1234.12, 423.2, 31.23, 274.34, 7672.34, 343.33, 234.23, 2675.34, 7865.75, 64.53};

        for(int i = 0; i < moneyArray.length - 1; i++){
            assertTrue(moneyArray[i] < moneyArray[i + 1]);
        }
    }

    @Test
    void makeAnEmailObject(){
        String authorEmail = "author@genericEmail.com";
        String recipientEmail = "recipient@genericEmail.com";
        String message =
                "Dear Recipient," +
                "I hope you can see this email." +
                "Best Wishes," +
                "Author";

        // These are the fields of the email object
        // Fix the makeEmail method in Office
        // Create an assertEquals that checks to see if you have made the correct email
        // Hint : You need to create the email object first by hand in order to compare it to the one made through
        // the office objects method
        assertEquals(new Email(authorEmail, recipientEmail, message), new Email(authorEmail, recipientEmail, message));
    }

    //Bonus
    //Create your own test from scratch alongside your own custom method

}