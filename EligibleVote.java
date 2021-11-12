import java.util.Scanner;
public class EligibleVote
{
public static void main(String args[])
{
int CandidateAge, EligibleVoteAge = 18;   //variable declaration
Scanner c = new Scanner(System.in);
System.out.println("Please enter your age : ");    //getting age from the user
CandidateAge = c.nextInt();
if(CandidateAge >= EligibleVoteAge)  //checking the eligible for vote
{
System.out.println("Your are Eligible for vote!!");
}
else
{
System.out.println("Your are not Eligible for vote!!");
}}}