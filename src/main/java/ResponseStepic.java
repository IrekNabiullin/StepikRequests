import java.util.List;

@lombok.Data
public class ResponseStepic {
    private Meta meta;

    private List<Courses> courses;

    private List<Object> enrollments;
}
