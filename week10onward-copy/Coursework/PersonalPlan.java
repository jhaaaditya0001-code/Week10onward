package Coursework;
public class PersonalPlan extends AIModel {
    private int usage_balance;
    private int fixed_system_cost;

    public PersonalPlan(String model_identity, double unit_rate, int param_total, int window_size_label, int usage_balance, int fixed_system_cost) {
        super(model_identity, unit_rate, param_total, window_size_label);
        this.usage_balance = usage_balance;
        this.fixed_system_cost = fixed_system_cost;
    }

    public boolean verify_usage_capacity(int input_size, int output_size) {
        int total_tokens = input_size + output_size + fixed_system_cost;
        return total_tokens <= get_window_details();
    }

    public void top_up_balance(int extra_amount) {
        if (extra_amount > 0) {
            usage_balance = usage_balance + extra_amount;
            System.out.println("Top up success. New balance: " + usage_balance);
        } else {
            System.out.println("Error. Positive digit required");
        }
    }

    public void execute_user_query(String query_text, int length_target) {
        int input_tokens = query_text.length(); 
        
        if (verify_usage_capacity(input_tokens, length_target)) {
            if (usage_balance > 0) {
                usage_balance = usage_balance - 1;
                System.out.println("Executing: " + query_text);
                System.out.println("Quota used. Remaining: " + usage_balance);
            } else {
                System.out.println("Failed. Quota reached 0. Buy more prompts");
            }
        } else {
            System.out.println("Failed. Tokens exceed context window");
        }
        System.out.println("");
    }
}