package com.example.demo.lecture;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("!test & prod")
public class TestBookRepository implements BookRepository {
    // Profile
}
