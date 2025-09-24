public class Main {
    public static void main(String[] args) {
        ApiClient apiClient = new ApiClient();
        String response = apiClient.fetchQuestions(10, "easy", "multiple");
        System.out.println(response);
    }
}
