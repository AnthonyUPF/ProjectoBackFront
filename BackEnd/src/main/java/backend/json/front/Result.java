package backend.json.front;

import java.util.List;

import lombok.Data;

@Data
public class Result {
    private String _type;
    private int annotation_count;
    private String api_path;
    private String artist_names;
    private String full_title;
    private String header_image_thumbnail_url;
    private String header_image_url;
    private int id;
    private boolean instrumental;
    private String language;
    private int lyrics_owner_id;
    private String lyrics_state;
    private int lyrics_updated_at;
    private String path;
    private Integer pyongs_count;
    private String relationships_index_url;
    private ReleaseDateComponents release_date_components;
    private String release_date_for_display;
    private String release_date_with_abbreviated_month_for_display;
    private String song_art_image_thumbnail_url;
    private String song_art_image_url;
    private Stats stats;
    private String title;
    private String title_with_featured;
    private int updated_by_human_at;
    private String url;
    private List<Object> featured_artists;
    private PrimaryArtist primary_artist;
    
}
