package xyz.todooc4.blog.service.impl;

import java.util.List;
import java.util.NoSuchElementException;
import lombok.*;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import xyz.todooc4.blog.entity.*;
import xyz.todooc4.blog.repository.MediaRepository;
import xyz.todooc4.blog.service.MediaService;

@Data
@Service
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = false, onlyExplicitlyIncluded = true)
public class MediaServiceImpl implements MediaService {
	private final MediaRepository mediaRepository;

	@Override
	public List<Media> findAll(Specification<Media> specification, Sort sort) {
		return mediaRepository.findAll(specification, sort == null ? Sort.unsorted() : sort);
	}

	@Override
	public Media findById(Integer mediaId) {
		return mediaRepository.findById(mediaId)
				.orElseThrow(() -> new NoSuchElementException("MediaService.notFound"));
	}

	@Override
	public Media save(Media media) {
		return mediaRepository.save(media);
	}

	@Override
	public Media update(Media media) {
		return mediaRepository.save(media);
	}

	@Override
	public void deleteById(Integer mediaId) {
		mediaRepository.deleteById(mediaId);
	}


}