package backend.json.front;

import java.util.List;

import lombok.Data;

@Data
public class Song {
    private List<Hit> hits;
}
