package com.example.demo.repository;

import com.example.demo.entity.WxWords;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author 未绪
 * @time 2018/4/26 22:19
 */
public interface WordsRepository extends JpaRepository<WxWords, Integer> {
}
