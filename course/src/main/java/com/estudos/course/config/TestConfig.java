package com.estudos.course.config;

import com.estudos.course.entities.Category;
import com.estudos.course.entities.Order;
import com.estudos.course.entities.User;
import com.estudos.course.entities.enums.OrderStatus;
import com.estudos.course.repositories.CategoryRepository;
import com.estudos.course.repositories.OrderRepository;
import com.estudos.course.repositories.ProductRepository;
import com.estudos.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        Category c1 = new Category(null, "Electronics");
        Category c2 = new Category(null, "Books");
        Category c3 = new Category(null, "Computers");

        categoryRepository.saveAll(Arrays.asList(c1, c2, c3));

        User u1 = new User(null, "Maria Brown", "mariabrown@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alexgreen@gmail.com", "977777777", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-06-20T03:41:07Z"),OrderStatus.WAITING_PAYMENT, u1);
        Order o3 = new Order(null, Instant.parse("2019-06-20T15:21:22Z"), OrderStatus.WAITING_PAYMENT,u2);

        orderRepository.saveAll(Arrays.asList(o1, o2, o3));

    }
}
