package backend.json;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backend.json.front.Hit;
import backend.json.front.PrimaryArtist;
import backend.json.front.ReleaseDateComponents;
import backend.json.front.Result;
import backend.json.front.Song;
import backend.json.front.Stats;

@SpringBootApplication
@RequestMapping("/api")
@RestController
public class JsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonApplication.class, args);

	}


	
	@GetMapping("/songs")
	public Song song() {
		Song song = new Song();
		List<Hit> hits = new ArrayList<>();
		Hit hit = new Hit();
		ReleaseDateComponents releaseDateComponents = new ReleaseDateComponents();
		Stats stats = new Stats();
		PrimaryArtist primaryArtist = new PrimaryArtist();
		Result result = new Result();

		result.set_type("song");
		result.setAnnotation_count(1);
		result.setApi_path("/songs/1326837");
		result.setArtist_names("Matt Elliott");
		result.setFull_title("Lone Gunman Required by Matt Elliott");
		result.setHeader_image_thumbnail_url("https://images.genius.com/d7368eb579b398a0a58996329a2d2e82.300x300x1.jpg");
		result.setHeader_image_url("https://images.genius.com/d7368eb579b398a0a58996329a2d2e82.400x400x1.jpg");
		result.setId(1326837);
		result.setInstrumental(false);
		result.setLanguage("en");
		result.setLyrics_owner_id(1549345);
		result.setLyrics_state("complete");
		result.setLyrics_updated_at(1429766152);
		result.setPath("/Matt-elliott-lone-gunman-required-lyrics");
		result.setPyongs_count(null);
		result.setRelationships_index_url("https://genius.com/Matt-elliott-lone-gunman-required-sample");

		releaseDateComponents.setYear(2006);
		releaseDateComponents.setMonth(10);
		releaseDateComponents.setDay(23);

		result.setRelease_date_components(releaseDateComponents);
		result.setRelease_date_for_display("October 23, 2006");
		result.setRelease_date_with_abbreviated_month_for_display("Oct. 23, 2006");
		result.setSong_art_image_thumbnail_url("https://images.genius.com/d7368eb579b398a0a58996329a2d2e82.300x300x1.jpg");
		result.setSong_art_image_url("https://images.genius.com/d7368eb579b398a0a58996329a2d2e82.400x400x1.jpg");

		stats.setUnreviewed_annotations(0);
		stats.setHot(false);

		result.setStats(stats);
		result.setTitle("Lone Gunman Required");
		result.setTitle_with_featured("Lone Gunman Required");
		result.setUpdated_by_human_at(1666603240);
		result.setUrl("https://genius.com/Matt-elliott-lone-gunman-required-lyrics");

		result.setFeatured_artists(new ArrayList<>());

		primaryArtist.set_type("artist");
		primaryArtist.setApi_path("/artists/367219");
		primaryArtist.setHeader_image_url("https://images.genius.com/78ed5ad35f2f8ef451e43e5acfc50483.465x465x1.jpg");
		primaryArtist.setId(367219);
		primaryArtist.setImage_url("https://images.genius.com/78ed5ad35f2f8ef451e43e5acfc50483.465x465x1.jpg");
		primaryArtist.setIndex_character("m");
		primaryArtist.set_meme_verified(false);
		primaryArtist.set_verified(false);
		primaryArtist.setName("Matt Elliott");
		primaryArtist.setSlug("Matt-elliott");
		primaryArtist.setUrl("https://genius.com/artists/Matt-elliott");

		result.setPrimary_artist(primaryArtist);

		hit.setHighlights(new ArrayList<>());
		hit.setIndex("song");
		hit.setType("song");

		hit.setResult(result);

		hits.add(hit);
		song.setHits(hits);

		return song;
	}

}
