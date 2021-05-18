package xyz.todooc4.blog.controller;

import io.swagger.annotations.ApiOperation;
import java.util.List;
import lombok.*;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xyz.todooc4.blog.entity.*;
import xyz.todooc4.blog.service.*;

@RestController
@RequestMapping("/medias")
@RequiredArgsConstructor
public class MediaController {
	private final MediaService mediaService;

	@GetMapping
	@ApiOperation(value = "", nickname = "getAllMedias")
	public ResponseEntity<List<Media>> getAllMedias(@RequestParam(name = "q", required = false) Specification<Media> specification, @RequestParam(name = "sort", required = false) Sort sort) {
		return ResponseEntity.ok(mediaService.findAll(specification, sort));
	}

	@GetMapping("/{mediaId}")
	@ApiOperation(value = "", nickname = "getMediaById")
	public ResponseEntity<Media> getMediaById(@PathVariable Integer mediaId) {
		return ResponseEntity.ok(mediaService.findById(mediaId));
	}

	@PostMapping
	@ApiOperation(value = "", nickname = "saveMedia")
	public ResponseEntity<Media> saveMedia(@RequestBody Media media) {
		return ResponseEntity.status(HttpStatus.CREATED).body(mediaService.save(media));
	}

	@PutMapping
	@ApiOperation(value = "", nickname = "updateMedia")
	public ResponseEntity<Media> updateMedia(@RequestBody Media media) {
		return ResponseEntity.ok(mediaService.update(media));
	}

	@DeleteMapping("/{mediaId}")
	@ApiOperation(value = "", nickname = "deleteMediaById")
	public void deleteMediaById(@PathVariable Integer mediaId) {
		mediaService.deleteById(mediaId);
	}

}

