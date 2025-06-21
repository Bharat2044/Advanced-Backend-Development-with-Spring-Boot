package org.example.solution;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Component
public class ClientRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TodoService service = retrofit.create(TodoService.class);
        Call<Todo> call = service.getTodoById(1);

        try {
            Response<Todo> response = call.execute();

            if (response.isSuccessful() && response.body() != null) {
                System.out.println(response.body());
            } else {
                System.out.println("Failed: " + response.code());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
