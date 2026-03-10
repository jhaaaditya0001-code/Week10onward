package Coursework;


public class AIModel {
    private String model_identity;
    private double unit_rate;
    private int param_total;
    private int window_size_label;

    public AIModel(String model_identity, double unit_rate, int param_total, int window_size_label) {
        this.model_identity = model_identity;
        this.unit_rate = unit_rate;
        this.param_total = param_total;
        this.window_size_label = window_size_label;
    }

    public String get_model_identity() {
        return model_identity;
    }

    public double get_rate_value() {
        return unit_rate;
    }

    public int get_param_total() {
        return param_total;
    }

    public int get_window_details() {
        return window_size_label;
    }

    @Override
    public String toString() {
        return "Model Information\n" +
               "Name: " + model_identity + "\n" +
               "Cost: " + unit_rate + " per lakh tokens\n" +
               "Parameters: " + param_total + " billion\n" +
               "Window: " + window_size_label + "\n";
    }
}