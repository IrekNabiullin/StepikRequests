import com.google.gson.annotations.SerializedName;

@lombok.Data
public class Meta {
    private Integer page;

    @SerializedName("hasPrevious")
    private String has_previous;

    @SerializedName("has_next")
    private String hasNext;
}
