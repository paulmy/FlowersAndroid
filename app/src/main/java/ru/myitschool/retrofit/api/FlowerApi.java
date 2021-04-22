package ru.myitschool.retrofit.api;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import ru.myitschool.retrofit.PostModel;
public interface FlowerApi {
    @GET("/projects/feeds/flowers.json")
    Call<List<PostModel>> getData(@Query("name") String resourceName, @Query("num") int count);
}
