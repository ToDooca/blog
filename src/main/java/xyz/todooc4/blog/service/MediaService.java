package xyz.todooc4.blog.service;

import java.util.Collection;
import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import xyz.todooc4.blog.entity.*;

public interface MediaService {

	List<Media> findAll(Specification<Media> specification, Sort sort);

	Media save(Media media);

	Media update(Media media);

	Media findById(Integer mediaId);

	void deleteById(Integer mediaId);

}