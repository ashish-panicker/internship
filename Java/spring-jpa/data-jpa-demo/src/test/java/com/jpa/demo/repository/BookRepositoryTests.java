package com.jpa.demo.repository;

import static org.assertj.core.api.Assertions.assertThat;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

import com.jpa.demo.model.Book;
import com.jpa.demo.repos.BookRepository;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.jdbc.core.JdbcTemplate;

@DataJpaTest
public class BookRepositoryTests {

    @Autowired
    private BookRepository repo;
    @Autowired
    private DataSource dataSource;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private EntityManager entityManager;

    @Test
    void injectedComponentsAreNotNull() {
        assertThat(dataSource).isNotNull();
        assertThat(jdbcTemplate).isNotNull();
        assertThat(entityManager).isNotNull();
        assertThat(repo).isNotNull();
    }

    @Test
    public void testSave() {
        Book b = new Book();
        b.setFirstName("J K");
        b.setLastName("Rowling");
        b.setTitle("harry potter");
        repo.save(b);
        assertThat(b.getBookId()).isNotNull();
    }

}
