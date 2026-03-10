package Coursework;
public class TestingModel {
    public static void main(String[] args) {
        
        PersonalPlan user_account = new PersonalPlan("GPT 4o", 15.50, 175, 1000, 1, 50);
        ProPlan team_account = new ProPlan("Claude 3.5 Sonnet", 25.0, 200, 5000, 5);

        System.out.println("Test 1: Valid Prompt Execution");
        user_account.execute_user_query("Calculate math", 200);

        System.out.println("Test 2: Prompt Rejected due to Context Limit");
        user_account.execute_user_query("Write a long story", 800);

        System.out.println("Test 3: Exhausting Monthly Quota and Purchasing More");
        user_account.execute_user_query("Check weather", 100); 
        user_account.top_up_balance(10);
        user_account.execute_user_query("Check weather again", 100);

        System.out.println("Test 4: Pro Plan Verifying Unlimited Prompts");
        team_account.enroll_new_user("John Doe");
        team_account.execute_user_query("Analyze data report");
        team_account.execute_user_query("Generate code snippet");
    }
}