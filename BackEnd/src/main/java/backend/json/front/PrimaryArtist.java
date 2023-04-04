package backend.json.front;

import lombok.Data;

@Data
public class PrimaryArtist {
    private String _type;
    private String api_path;
    private String header_image_url;
    private int id;
    private String image_url;
    private String index_character;
    private boolean is_meme_verified;
    private boolean is_verified;
    private String name;
    private String slug;
    private String url;
}
