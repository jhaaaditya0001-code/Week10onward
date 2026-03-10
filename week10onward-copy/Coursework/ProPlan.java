package Coursework;

import java.util.ArrayList;

public class ProPlan extends AIModel {
    private int max_group_size;
    private ArrayList<String> active_group_list;

    public ProPlan(String model_identity, double unit_rate, int param_total, int window_size_label, int max_group_size) {
        super(model_identity, unit_rate, param_total, window_size_label);
        this.max_group_size = max_group_size;
        this.active_group_list = new ArrayList<String>();
    }

    public void enroll_new_user(String user_handle) {
        int current_count = active_group_list.size();
        if (current_count < max_group_size) {
            active_group_list.add(user_handle);
            int vacancies = max_group_size - active_group_list.size();
            System.out.println("User " + user_handle + " joined successfully");
            System.out.println("Empty spots: " + vacancies);
        } else {
            System.out.println("Operation failed. Group is at full capacity");
        }
    }

    public void terminate_user_access(String user_handle) {
        boolean exists = active_group_list.contains(user_handle);
        if (exists) {
            active_group_list.remove(user_handle);
            System.out.println("Access revoked for " + user_handle);
            System.out.println("New vacancy count: " + (max_group_size - active_group_list.size()));
        } else {
            System.out.println("Search result: User not found in database");
        }
    }

    public void execute_user_query(String query_text) {
        System.out.println("Request: " + query_text);
        System.out.println("Status: Active. Unlimited usage enabled.");
    }

    @Override
    public String toString() {
        String base_data = super.toString();
        String group_data = "Plan Type: Pro\nAllowed Slots: " + max_group_size + "\nCurrent Members: ";
        
        if (active_group_list.isEmpty()) {
            group_data = group_data + "Empty List";
        } else {
            for (int i = 0; i < active_group_list.size(); i++) {
                group_data = group_data + active_group_list.get(i);
                if (i < active_group_list.size() - 1) {
                    group_data = group_data + ", ";
                }
            }
        }
        
        return base_data + group_data + "\nEnd of details\n";
    }
}