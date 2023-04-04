package backend.json.front;

import java.util.List;

import lombok.Data;

@Data
public class Hit {
    private List<String> highlights;
    private String index;
    private String type;
    private Result result;  
}
